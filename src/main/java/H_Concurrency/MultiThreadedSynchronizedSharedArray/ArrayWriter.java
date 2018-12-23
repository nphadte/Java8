package H_Concurrency.MultiThreadedSynchronizedSharedArray;

import H_Concurrency.MultiThreadedSharedArray.SimpleArray;
// Adds integers to an array shared with other Runnables

public class ArrayWriter implements Runnable {

    private final H_Concurrency.MultiThreadedSharedArray.SimpleArray sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int value, SimpleArray array) {
        this.sharedSimpleArray = array;
        this.startValue = value;
    }

    @Override
    public void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            sharedSimpleArray.add(i);  // add an element to the shared array
        }
    }
}  // end class ArrayWriter






