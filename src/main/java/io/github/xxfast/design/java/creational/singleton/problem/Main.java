package io.github.xxfast.design.java.creational.singleton.problem;

import io.github.xxfast.design.java.creational.singleton.Batman;
import io.github.xxfast.design.java.creational.singleton.Car;

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
