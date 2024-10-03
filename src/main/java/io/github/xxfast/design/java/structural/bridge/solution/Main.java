package io.github.xxfast.design.java.structural.bridge.solution;


import io.github.xxfast.design.java.structural.bridge.solution.Vehicle.Car;
import io.github.xxfast.design.java.structural.bridge.solution.Vehicle.Van;

public class Main {
    public static void main(String[] args) {
        Car myBlueCar = new Car(Paint.Blue, Make.Mazda);
        Van myYellowVan = new Van(Paint.Yellow, Make.Nissan);
        Bike myWhiteBike = new Bike(Paint.White);

        System.out.println(myWhiteBike.getColor());
    }
}
