package codes.isuru.java.structural.bridge.solution;

public class Bike implements Colorful {
    private Paint color;

    Bike(Paint color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return null;
    }
}
