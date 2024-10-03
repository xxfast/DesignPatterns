package io.github.xxfast.design.java.structural.bridge.solution;

import org.jetbrains.annotations.Nullable;

public abstract class Vehicle implements Colorful {
    private Paint color;
    @Nullable private Make make;

    Vehicle(Paint color, @Nullable Make make){
        this.color = color;
        this.make = make;
    }

    @Override
    public String getColor() {
        return color.name();
    }

    public static class Car extends Vehicle {
        Car(Paint color, Make registrationPlate) {
            super(color, registrationPlate);
        }
    }
    public static class Van extends Vehicle {
        Van(Paint color, Make registrationPlate) {
            super(color, registrationPlate);
        }
    }
}
