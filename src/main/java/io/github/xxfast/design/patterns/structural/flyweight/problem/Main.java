package codes.isuru.java.structural.flyweight.problem;

import codes.isuru.java.structural.flyweight.MemoryUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import static java.util.Objects.requireNonNullElse;


enum Color {
    Blue,
    Yellow
}

class Object {
    public int x;
    public int y;

    Object(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Wheel extends Object {
    Wheel(int x, int y) {
        super(x, y);
    }
}

class Vehicle extends Object {
    private Color color;
    private Wheel[] wheels;

    Vehicle(int x, int y, Color color, Wheel[] wheels) {
        super(x, y);
        this.color = color;
        this.wheels = wheels;
    }
}

class World {
    public List<Object> objects = new ArrayList<>();
    int size;

    World(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String[][] translatedCoordinates = new String[size][size];
        for (Object obj : objects) {
            translatedCoordinates[obj.x][obj.y] = "X";
        }

        StringBuilder builder = new StringBuilder();
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                String cell = translatedCoordinates[x][y];
                builder.append(requireNonNullElse(cell, " "));
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}

public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00'Mb'");

    public static void main(String[] args) {
        double before = MemoryUtils.getAllocatedMemoryInMb();
        World world = new World(50);

        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            int x = random.nextInt(0, world.size);
            int y = random.nextInt(0, world.size);

            Wheel[] wheelsForVehicle = new Wheel[4];
            for (int j = 0; j < wheelsForVehicle.length; j++) {
                Wheel wheel = new Wheel(x, y);
                world.objects.add(wheel);
                wheelsForVehicle[j] = wheel;
            }

            world.objects.add(new Vehicle(x, y, Color.Blue, wheelsForVehicle));
        }

        double after = MemoryUtils.getAllocatedMemoryInMb();

        System.out.println("Number of objects:\t" + world.objects.size());
        System.out.println("Memory allocated:\t" + df.format(after - before));
        System.out.println();
        System.out.println("World:\n" + world);
    }
}
