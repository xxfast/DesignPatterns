package io.github.xxfast.design.java.behavioural.visitor.solution_jvm16;

import org.jetbrains.annotations.NotNull;

sealed class Vehicle { }
final class Car extends Vehicle { }
final class Hauler extends Vehicle  {
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

    private String inspect(@NotNull Vehicle vehicle) {
        return switch (vehicle) {
            case Car car -> inspect(car);
            case Hauler hauler -> inspect(hauler);
            default -> throw new IllegalArgumentException("Why java 😩");
        };
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
