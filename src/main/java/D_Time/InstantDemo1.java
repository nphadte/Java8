package D_Time;

import java.time.Duration;
import java.time.Instant;


public class InstantDemo1 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        //TimeUnit.SECONDS.sleep(1);
        try
        {
            Thread.sleep(10000000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        Instant end   = Instant.now();
        System.out.println(Duration.between(start,end).toMillis());
        System.out.println(Duration.between(start,end).toMinutes());
    }
}
