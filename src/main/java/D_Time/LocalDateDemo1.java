package D_Time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate oneDecadeAgo = today.minus(1, ChronoUnit.DECADES);
        System.out.println("Day of month: " + today.getDayOfMonth());
    }
}
