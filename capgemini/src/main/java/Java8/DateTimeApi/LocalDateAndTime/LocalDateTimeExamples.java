package Java8.DateTimeApi.LocalDateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExamples {
    public static void main(String[] args) {
        // Static Factory Methods
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now); // Output: Current system date-time

        LocalDateTime specific = LocalDateTime.of(2025, 6, 8, 14, 30);
        System.out.println("Specific: " + specific); // Output: 2025-06-08T14:30

        LocalDate date = LocalDate.of(2025, 6, 8);
        LocalTime time = LocalTime.of(14, 30);
        LocalDateTime combined = LocalDateTime.of(date, time);
        System.out.println("Combined DateTime: " + combined); // Output: 2025-06-08T14:30

        // Parsing
        LocalDateTime parsed = LocalDateTime.parse("2025-06-08T14:30");
        System.out.println("Parsed ISO: " + parsed); // Output: 2025-06-08T14:30

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime parsedCustom = LocalDateTime.parse("08-06-2025 14:30", formatter);
        System.out.println("Parsed Custom: " + parsedCustom); // Output: 2025-06-08T14:30

        // Getters
        System.out.println("Year: " + now.getYear());                 // e.g., 2025
        System.out.println("Month: " + now.getMonth());               // e.g., JUNE
        System.out.println("Month Value: " + now.getMonthValue());    // e.g., 6
        System.out.println("Day of Month: " + now.getDayOfMonth());   // e.g., 8
        System.out.println("Day of Year: " + now.getDayOfYear());     // e.g., 160
        System.out.println("Day of Week: " + now.getDayOfWeek());     // e.g., SUNDAY
        System.out.println("Hour: " + now.getHour());                 // e.g., 20
        System.out.println("Minute: " + now.getMinute());             // e.g., 15
        System.out.println("Second: " + now.getSecond());             // e.g., 10
        System.out.println("Nano: " + now.getNano());                 // e.g., 123456789

        // Plus / Minus
        System.out.println("Plus 2 days: " + now.plusDays(2));
        System.out.println("Minus 3 hours: " + now.minusHours(3));
        System.out.println("Plus 10 minutes: " + now.plusMinutes(10));

        // With methods
        System.out.println("With year 2030: " + now.withYear(2030));
        System.out.println("With month 12: " + now.withMonth(12));
        System.out.println("With day of month 15: " + now.withDayOfMonth(15));
        System.out.println("With hour 10: " + now.withHour(10));
        System.out.println("With minute 45: " + now.withMinute(45));

        // Truncate to unit
        System.out.println("Truncated to HOURS: " + now.truncatedTo(ChronoUnit.HOURS));

        // Comparison
        LocalDateTime future = now.plusDays(1);
        System.out.println("Is now before future? " + now.isBefore(future)); // true
        System.out.println("Is now after future? " + now.isAfter(future));   // false
        System.out.println("Equals itself? " + now.equals(now));             // true

        // Format
        String formatted = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("Formatted: " + formatted); // e.g., 2025/06/08 20:15:30

        // To LocalDate and LocalTime
        System.out.println("To LocalDate: " + now.toLocalDate()); // e.g., 2025-06-08
        System.out.println("To LocalTime: " + now.toLocalTime()); // e.g., 20:15:30
    }
}
