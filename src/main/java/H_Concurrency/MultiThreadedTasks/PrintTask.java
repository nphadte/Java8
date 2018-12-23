package H_Concurrency.MultiThreadedTasks;
// Runnable example
// PrintTask class sleeps for a random time from 0 to 5 seconds

import java.security.SecureRandom;

public class PrintTask implements Runnable {
    private final static SecureRandom generator = new SecureRandom();
    private final String taskName;  // name of the Task
    private int sleepTime;          // random sleep time for thread

    public PrintTask() {
        this.taskName = "t0";
        this.sleepTime = 100;
    }

    public PrintTask(String taskName) {
        this.taskName = taskName;
        this.sleepTime = determineTaskTime();
    }


    @Override
    public void run() {
        try {
            System.out.println(taskName + " is going to sleep for " + sleepTime);
            Thread.sleep(sleepTime);
        } catch (IllegalArgumentException ilarg) {

        } catch (InterruptedException ie) {

        }
    }

    public static int determineTaskTime() {
        int n = 0;
        n = generator.nextInt(5000);
        return n;
    }
}
