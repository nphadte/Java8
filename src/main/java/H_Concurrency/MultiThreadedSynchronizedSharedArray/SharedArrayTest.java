package H_Concurrency.MultiThreadedSynchronizedSharedArray;

import H_Concurrency.MultiThreadedSharedArray.ArrayWriter;
import H_Concurrency.MultiThreadedSharedArray.SimpleArray;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String[] args) {
        // construct the shared object
        H_Concurrency.MultiThreadedSharedArray.SimpleArray sharedSimpleArray = new SimpleArray(6);

        // construct the shared object
        H_Concurrency.MultiThreadedSharedArray.ArrayWriter writer1 = new H_Concurrency.MultiThreadedSharedArray.ArrayWriter(1, sharedSimpleArray);
        H_Concurrency.MultiThreadedSharedArray.ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(writer1);
        executorService.execute(writer2);

        // call the join method to ensure all the threads have closed and then only call the executor shutdown
        executorService.shutdown(); // shutdown only means it will not accept any new tasks

        try {
            // wait 1 minute for both writers to finish executing
            boolean tasksEnded =
                    executorService.awaitTermination(1, TimeUnit.MINUTES);

            if (tasksEnded) {
                System.out.println("Contents of SimpleArray");
                System.out.println(sharedSimpleArray);
            } else
                System.out.println("Timed out while waiting for tasks to finish");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }  // end main

    }  // end class SharedArrayTest
}
