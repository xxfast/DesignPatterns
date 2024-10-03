package codes.isuru.java.creational.prototype.problem;

class Car {
    private final int cost;
    private final long mileage;

    public Car(int cost, long mileage) {
        this.cost = cost;
        this.mileage = mileage;
    }
}

public class Main {
    public static void main(String[] args) {
        Car theOriginal = new Car(10, 0);
        // Car theCopy = new Car(theOriginal.cost, theOriginal.mileage);
    }
}
