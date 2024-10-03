package io.github.xxfast.design.java.behavioural.visitor.problem;

class Vehicle { }

class Car extends Vehicle {}

class Hauler extends Vehicle {
    private final Vehicle[] inventory;

    public Hauler(Vehicle[] inventory) {
        this.inventory = inventory;
    }

    public Vehicle[] getInventory() {
        return inventory;
    }
}

class VehicleInspector {
    static String inspect(Vehicle vehicle) {
        return "❓";
    }

    static String inspect(Car car) {
        return "🚗";
    }

    static String inspect(Hauler hauler) {
        StringBuilder builder = new StringBuilder();
        for (Vehicle vehicle : hauler.getInventory()) {
            builder.append(inspect(vehicle));
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

        String inspection = VehicleInspector.inspect(biggerHauler);
        System.out.println(inspection);
    }
}
