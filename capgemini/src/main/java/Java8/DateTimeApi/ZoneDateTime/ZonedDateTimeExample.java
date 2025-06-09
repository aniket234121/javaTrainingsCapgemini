package Java8.DateTimeApi.ZoneDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        // Current ZonedDateTime
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime: " + zdtNow); // Current system zone time

        // Specific ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.of(2025, 6, 9, 10, 30, 0, 0, ZoneId.of("Asia/Kolkata"));
        System.out.println("ZonedDateTime.of(): " + zdt);

        // Parsing from String
        ZonedDateTime parsed = ZonedDateTime.parse("2025-06-09T10:15:30+05:30[Asia/Kolkata]");
        System.out.println("Parsed ZonedDateTime: " + parsed);

        // Converting time zone
        ZonedDateTime utcTime = zdt.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("Converted to UTC: " + utcTime);

        // Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z VV");
        String formatted = zdt.format(formatter);
        System.out.println("Formatted: " + formatted);

        // Getting LocalDateTime
        LocalDateTime localDateTime = zdt.toLocalDateTime();
        System.out.println("LocalDateTime from ZonedDateTime: " + localDateTime);
    }
}
