package Java8.DateTimeApi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

    /*task list methods from localDate.md file
    Write a method to:

            - Create today’s date.
            - Create a specific date (e.g., `1995-08-20`).
            - Format both dates in the `"dd-MM-yyyy"` pattern.*/
    public static void basicLocalDate() {
        //create today date
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(1995, 8, 20);

        System.out.println("today date: " + today);
        System.out.println("specific date: " + specificDate);

        //formatter to "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-y");

        // format() returns string....
        String formattedDate = specificDate.format(formatter);
        System.out.println("formatter date: " + formattedDate);
    }


    /*
    Write a method that:

    - Takes a `LocalDate` input.
    - Adds 45 days.
    - Subtracts 3 months.
    - Returns the resulting date.
     */
    public static LocalDate DateArithmetic(LocalDate dateArg)
    {
        return dateArg.plusDays(45).minusMonths(3);
    }

    /*
    Write a method that:

    - Takes two inputs: a `LocalDate` of a birthday and today’s date.
    - Checks if today is that birthday (ignoring the year).
    - Returns `true` if it is, otherwise `false`.

     */
    public static boolean checkBirthday(LocalDate birthday,LocalDate today)
    {
        return birthday.getMonthValue()==today.getMonthValue()&&birthday.getDayOfMonth()==today.getDayOfMonth();
    }

    public static void sirExamplesOfLocalDate() {
        LocalDate currentDate = LocalDate.now();
        LocalDate randomDate = LocalDate.of(2000, 9, 8);
        System.out.println(currentDate);
        System.out.println(randomDate);

        System.out.println(currentDate.isAfter(randomDate));
        System.out.println(currentDate.plusMonths(4));
        System.out.println(currentDate.minusDays(2));

        System.out.println("parse the string date to local date" + LocalDate.parse("2000-09-08"));

        //zoned date

        ZoneId zoneid = ZoneId.of("America/Los_Angeles");
        LocalDate localDateofZone = LocalDate.now(zoneid);
        System.out.println(localDateofZone + " this is localDateofZOne");

    }


    public static void main(String[] args) {
//        sirExamplesOfLocalDate();
        basicLocalDate();
        LocalDate ld=LocalDate.now();
        System.out.println(ld+" return date by adding 45Days and subtract 3 month: "+DateArithmetic(ld));
        //check today birthday ignore year

    }
}