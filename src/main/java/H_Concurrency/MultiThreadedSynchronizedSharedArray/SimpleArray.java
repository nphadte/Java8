package H_Concurrency.MultiThreadedSynchronizedSharedArray;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {

    private final int[] array;    // the shared integer array
    private int writeIndex = 0; // shared index of next element to write

    private static final SecureRandom generator = new SecureRandom();

    public SimpleArray(int size) {
        this.array = new int[size];
        this.writeIndex = writeIndex;
    }

    // add a value to the shared array
    public synchronized void add(int value) {
        int position = writeIndex;  // store the write index


        try {
            Thread.sleep(generator.nextInt(500));
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();  // re-interrupt the thread
        }

        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);
        ++writeIndex;
        System.out.printf("Next write index: %d%n", writeIndex);

    }

    // used for outputting the contents of the shared integer array
    public String toString() {
        return Arrays.toString(array);
    }
}
