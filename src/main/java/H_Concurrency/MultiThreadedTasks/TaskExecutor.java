package H_Concurrency.MultiThreadedTasks;
// Using an ExecutorService to execute Runnables.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

    public static void main(String[] args) {
        PrintTask t1 = new PrintTask("task1");
        PrintTask t2 = new PrintTask("task2");
        PrintTask t3 = new PrintTask("task3");

        System.out.println("Starting Executor");

        // create ExecutorService to manage threads
        ExecutorService   executorService = Executors.newCachedThreadPool();

        // start the three PrintTasks
        executorService.execute(t1); // start task1
        executorService.execute(t2); // start task2
        executorService.execute(t3); // start task3

        // shut down ExecutorService--it decides when to shut down threads
        executorService.shutdown();

        System.out.println("main ends.");
    }
}
