package codes.isuru.java.structural.flyweight;

import java.text.DecimalFormat;

public class MemoryUtils {
    public static double getAllocatedMemoryInMb() {
        Runtime runtime = Runtime.getRuntime();
        long allocatedMemoryBytes = runtime.totalMemory() - runtime.freeMemory();
        return (double) allocatedMemoryBytes / 1000000.0;
    }
}
