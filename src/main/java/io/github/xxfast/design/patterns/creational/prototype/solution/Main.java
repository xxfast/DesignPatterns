package codes.isuru.java.creational.prototype.solution;


class Car implements Cloneable {
    private final int cost;
    private final long mileage;

    public Car(int cost, long mileage) {
        this.cost = cost;
        this.mileage = mileage;
    }

    @SuppressWarnings("MethodDoesntCallSuperMethod") // 🤷‍
    @Override public Car clone() {
        return new Car(this.cost, this.mileage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (cost != car.cost) return false;
        return mileage == car.mileage;
    }

    @Override
    public int hashCode() {
        int result = cost;
        result = 31 * result + (int) (mileage ^ (mileage >>> 32));
        return result;
    }
}

public class Main {
    public static void main(String[] args){
        Car theOriginal = new Car(10, 0);
        Car theCopy = theOriginal.clone();
    }
}
