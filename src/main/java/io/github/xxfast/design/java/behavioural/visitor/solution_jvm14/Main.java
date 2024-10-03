package io.github.xxfast.design.java.behavioural.visitor.solution_jvm14;

abstract class Vehicle { }

class Car extends Vehicle {
}


class Hauler extends Vehicle  {
    private final Vehicle[] inventory;

    public Hauler(Vehicle[] inventory) {
        this.inventory = inventory;
    }

    public Vehicle[] getInventory() {
        return inventory;
    }
}

class VehicleInspection {
    public String inspect(Car car) {
        return "🚗";
    }

    public String inspect(Hauler hauler) {
        StringBuilder builder = new StringBuilder();
        for (Vehicle vehicle : hauler.getInventory()) {
            builder.append(inspect(vehicle));
        }
        return "🚚 (" + builder + ")";
    }

    private String inspect(Vehicle vehicle) {
        if(vehicle instanceof Car){
            return inspect((Car) vehicle);
        } else if (vehicle instanceof Hauler) {
            return inspect((Hauler) vehicle);
        }

        return null;
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
