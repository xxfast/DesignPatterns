package codes.isuru.java.structural.bridge.problem;

public class Car extends Object {
    static class BlueCar extends Car {}
    static class YellowCar extends Car {}
    static class GreenCar extends Car {}

    @Override
    public String toString() {
        return super.toString();
    }
}