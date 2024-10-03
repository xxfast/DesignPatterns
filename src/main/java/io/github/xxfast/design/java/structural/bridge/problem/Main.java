package io.github.xxfast.design.java.structural.bridge.problem;

public class Main {
    public static void main(String[] args) {
        Car myBlueCar = new Car.BlueCar();
        Van myBlueVan = new Van.BlueVan(); // ☠️


        // TODO: Add a white bike 🚴🏻 without needing to add 6 more types
    }
}
