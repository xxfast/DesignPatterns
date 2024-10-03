package io.github.xxfast.design.java.behavioural.visitor.solution;

interface Inspectable {
    String inspect(Inspection inspection);
}

interface Inspection {

    String inspect(Car car);

    String inspect(Hauler hauler);
}


abstract class Vehicle implements Inspectable { }

class Car extends Vehicle implements Inspectable {
    @Override
    public String inspect(Inspection inspection) {
        return inspection.inspect(this);
    }
}

class Hauler extends Vehicle implements Inspectable {
    private final Vehicle[] inventory;

    public Hauler(Vehicle[] inventory) {
        this.inventory = inventory;
    }

    public Vehicle[] getInventory() {
        return inventory;
    }

    @Override
    public String inspect(Inspection inspection) {
        return inspection.inspect(this);
    }
}

class VehicleInspection implements Inspection {
    @Override
    public String inspect(Car car) {
        return "🚗";
    }

    @Override
    public String inspect(Hauler hauler) {
        StringBuilder builder = new StringBuilder();
        for (Vehicle vehicle : hauler.getInventory()) {
            builder.append(vehicle.inspect(this));
        }
        return "🚚 (" + builder + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Hauler smallerHaler = new Hauler(
                new Vehicle[]{
                        new Car(),
                        new Car(),
                        new Car()
                }
        );

        Hauler biggerHauler = new Hauler(
                new Vehicle[]{
                        new Car(),
                        new Car(),
                        smallerHaler
                }
        );

        VehicleInspection inspection = new VehicleInspection();
        System.out.println(inspection.inspect(biggerHauler));
    }
}
