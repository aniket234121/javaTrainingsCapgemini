package Java8.DateTimeApi.LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateMethodExamples {

    public static void main(String[] args) {
        // 1. now()
        LocalDate today = LocalDate.now();
        System.out.println("now(): " + today); // now(): 2025-06-08

        // 2. of()
        LocalDate customDate = LocalDate.of(2025, 6, 4);
        System.out.println("of(): " + customDate); // of(): 2025-06-04

        // 3. parse()
        LocalDate parsedDate = LocalDate.parse("2025-06-04");
        System.out.println("parse(): " + parsedDate); // parse(): 2025-06-04

        //custom Parsed Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate customParsed = LocalDate.parse("04-06-2025", formatter);
        System.out.println("Custom parsed: " + customParsed); // Output: Custom parsed: 2025-06-04

        // 4. getYear()
        System.out.println("getYear(): " + customDate.getYear()); // getYear(): 2025

        // 5. getMonth()
        Month month = customDate.getMonth();
        System.out.println("getMonth(): " + month); // getMonth(): JUNE

        // 6. getMonthValue()
        System.out.println("getMonthValue(): " + customDate.getMonthValue()); // getMonthValue(): 6

        // 7. getDayOfMonth()
        System.out.println("getDayOfMonth(): " + customDate.getDayOfMonth()); // getDayOfMonth(): 4

        // 8. getDayOfWeek()
        DayOfWeek dayOfWeek = customDate.getDayOfWeek();
        System.out.println("getDayOfWeek(): " + dayOfWeek); // getDayOfWeek(): WEDNESDAY

        // 9. getDayOfYear()
        System.out.println("getDayOfYear(): " + customDate.getDayOfYear()); // getDayOfYear(): 155

        // 10. isLeapYear()
        System.out.println("isLeapYear(): " + customDate.isLeapYear()); // isLeapYear(): false

        // 11. lengthOfMonth()
        System.out.println("lengthOfMonth(): " + customDate.lengthOfMonth()); // lengthOfMonth(): 30

        // 12. lengthOfYear()
        System.out.println("lengthOfYear(): " + customDate.lengthOfYear()); // lengthOfYear(): 365

        // 13. plusDays()
        System.out.println("plusDays(5): " + customDate.plusDays(5)); // plusDays(5): 2025-06-09

        // 14. minusDays()
        System.out.println("minusDays(3): " + customDate.minusDays(3)); // minusDays(3): 2025-06-01

        // 15. plusMonths()
        System.out.println("plusMonths(2): " + customDate.plusMonths(2)); // plusMonths(2): 2025-08-04

        // 16. minusMonths()
        System.out.println("minusMonths(1): " + customDate.minusMonths(1)); // minusMonths(1): 2025-05-04

        // 17. plusYears()
        System.out.println("plusYears(1): " + customDate.plusYears(1)); // plusYears(1): 2026-06-04

        // 18. minusYears()
        System.out.println("minusYears(1): " + customDate.minusYears(1)); // minusYears(1): 2024-06-04

        // 19. withDayOfMonth()
        System.out.println("withDayOfMonth(15): " + customDate.withDayOfMonth(15)); // withDayOfMonth(15): 2025-06-15

        // 20. withMonth()
        System.out.println("withMonth(12): " + customDate.withMonth(12)); // withMonth(12): 2025-12-04

        // 21. withYear()
        System.out.println("withYear(2030): " + customDate.withYear(2030)); // withYear(2030): 2030-06-04

        // 22. until()
        LocalDate endDate = LocalDate.of(2026, 6, 4);
        Period period = customDate.until(endDate);
        System.out.println("until(2026-06-04): " + period); // until(2026-06-04): P1Y

        // 23. isBefore()
        System.out.println("isBefore(2026-06-04): " + customDate.isBefore(endDate)); // isBefore(2026-06-04): true

        // 24. isAfter()
        System.out.println("isAfter(2026-06-04): " + customDate.isAfter(endDate)); // isAfter(2026-06-04): false

        // 25. equals()
        System.out.println("equals(LocalDate.of(2025, 6, 4)): " + customDate.equals(LocalDate.of(2025, 6, 4))); // true

        // 26. toString()
        System.out.println("toString(): " + customDate.toString()); // toString(): 2025-06-04
    }
}
