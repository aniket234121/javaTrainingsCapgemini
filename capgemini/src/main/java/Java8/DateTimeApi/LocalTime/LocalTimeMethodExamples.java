package Java8.DateTimeApi.LocalTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeMethodExamples  {
    public static void main(String[] args) {
        // 1. now()
        LocalTime now = LocalTime.now();
        System.out.println("now(): " + now); // now(): 14:30:00.123456789 (will vary)

        // 2. of()
        LocalTime time = LocalTime.of(14, 30);
        System.out.println("of(): " + time); // of(): 14:30

        // 3. parse()
        LocalTime parsed = LocalTime.parse("14:30");
        System.out.println("parse(): " + parsed); // parse(): 14:30

        //parse with formatter
        LocalTime time2 = LocalTime.parse("02:30 PM", DateTimeFormatter.ofPattern("hh:mm a"));
        System.out.println(time2);

        // 4. getHour()
        System.out.println("getHour(): " + time.getHour()); // getHour(): 14

        // 5. getMinute()
        System.out.println("getMinute(): " + time.getMinute()); // getMinute(): 30

        // 6. getSecond()
        System.out.println("getSecond(): " + time.getSecond()); // getSecond(): 0

        // 7. getNano()
        System.out.println("getNano(): " + time.getNano()); // getNano(): 0

        // 8. isBefore()
        System.out.println("isBefore(LocalTime.of(15, 0)): " + time.isBefore(LocalTime.of(15, 0))); // true

        // 9. isAfter()
        System.out.println("isAfter(LocalTime.of(13, 0)): " + time.isAfter(LocalTime.of(13, 0))); // true

        // 10. equals()
        System.out.println("equals(LocalTime.of(14, 30)): " + time.equals(LocalTime.of(14, 30))); // true

        // 11. plusHours()
        System.out.println("plusHours(2): " + time.plusHours(2)); // 16:30

        // 12. minusHours()
        System.out.println("minusHours(1): " + time.minusHours(1)); // 13:30

        // 13. plusMinutes()
        System.out.println("plusMinutes(30): " + time.plusMinutes(30)); // 15:00

        // 14. minusMinutes()
        System.out.println("minusMinutes(15): " + time.minusMinutes(15)); // 14:15

        // 15. plusSeconds()
        System.out.println("plusSeconds(10): " + time.plusSeconds(10)); // 14:30:10

        // 16. minusSeconds()
        System.out.println("minusSeconds(5): " + time.minusSeconds(5)); // 14:29:55

        // 17. plusNanos()
        System.out.println("plusNanos(1000000): " + time.plusNanos(1_000_000)); // 14:30:00.001

        // 18. minusNanos()
        System.out.println("minusNanos(1000000): " + time.minusNanos(1_000_000)); // 14:29:59.999

        // 19. withHour()
        System.out.println("withHour(10): " + time.withHour(10)); // 10:30

        // 20. withMinute()
        System.out.println("withMinute(45): " + time.withMinute(45)); // 14:45

        // 21. withSecond()
        System.out.println("withSecond(20): " + time.withSecond(20)); // 14:30:20

        // 22. withNano()
        System.out.println("withNano(500000000): " + time.withNano(500_000_000)); // 14:30:00.500

        // 23. truncatedTo(ChronoUnit.HOURS)
        System.out.println("truncatedTo(HOURS): " + time.truncatedTo(ChronoUnit.HOURS)); // 14:00

        // 24. toSecondOfDay()
        System.out.println("toSecondOfDay(): " + time.toSecondOfDay()); // 14*3600 + 30*60 = 52200

        // 25. toNanoOfDay()
        System.out.println("toNanoOfDay(): " + time.toNanoOfDay()); // 52200 * 1_000_000_000 = 52200000000000

        // 26. toString()
        System.out.println("toString(): " + time.toString()); // 14:30
    }
}

