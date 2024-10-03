package codes.isuru.java.creational.singleton.solution;

import codes.isuru.java.creational.singleton.Batman;
import codes.isuru.java.creational.singleton.Car;

final class BatMobile extends Car {
    private static volatile BatMobile instance;
    private final Batman theBatman;

    private BatMobile() {
        super(Integer.MAX_VALUE, 0);
        this.theBatman = new Batman();
    }

    public static BatMobile getInstance() {
        BatMobile previousInstance = instance;
        if(previousInstance != null) return previousInstance;
        synchronized (BatMobile.class){
            if(instance == null){
                instance = new BatMobile();
            }
            return instance;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BatMobile theBatMobile = BatMobile.getInstance();
        BatMobile anotherBatMobile = BatMobile.getInstance();
    }
}
