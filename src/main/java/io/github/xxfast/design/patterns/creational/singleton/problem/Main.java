package codes.isuru.java.creational.singleton.problem;

import codes.isuru.java.creational.singleton.Batman;
import codes.isuru.java.creational.singleton.Car;

final class BatMobile extends Car {
    private final Batman theBatman;

    public BatMobile() {
        super(Integer.MAX_VALUE, 0);
        this.theBatman = new Batman();
    }
}

public class Main {
    public static void main(String[] args) {
        BatMobile theBatMobile = new BatMobile();
        BatMobile anotherBatMobile = new BatMobile();
    }
}
