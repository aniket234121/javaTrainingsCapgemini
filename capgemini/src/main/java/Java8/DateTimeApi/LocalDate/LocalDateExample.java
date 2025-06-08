package Java8.DateTimeApi.LocalDate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    /*

    Write a method that:

    - Takes a year and month as input.
    - Returns a list of all dates that fall on a **Monday** in that month.

    *Hint* Use `TemporalAdjusters` and `DayOfWeek.MONDAY`

    */
    public static List<LocalDate> MondayDates(int year,int month){

        List<LocalDate> mondays=new ArrayList<>();
        LocalDate date=LocalDate.of(year,month,1);
        LocalDate monday=date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));


        while(monday.getMonthValue()==month)
        {
            mondays.add(monday);
            monday=monday.plusDays(7);
        }
        return mondays;
    }
/*

    Write a method that:

    - Takes two `LocalDate` inputs: `startDate` and `endDate`.
    - Validates that `startDate` is before `endDate`.
    - Counts how many **Saturdays** and **Sundays** fall within the date range.
    - Returns the counts using either a custom class or a `Map<String, Integer>`.
*/
    public static Map<String,Integer> countSatandSundays(LocalDate startDate,LocalDate endDate){
        if(!startDate.isBefore(endDate))
            return new HashMap<>();
        LocalDate Saturday =startDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        LocalDate Sunday =startDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        Map<String,Integer> count=new HashMap<>();
        count.put("Saturday",0);
        count.put("Sunday",0);
        while(Saturday.isBefore(endDate)||Saturday.isEqual(endDate))
        {
            count.put("Saturday",count.get("Saturday")+1);
            Saturday=Saturday.plusDays(7);
        }
        while(Sunday.isBefore(endDate)||Sunday.isEqual(endDate))
        {
            count.put("Sunday",count.get("Sunday")+1);
            Sunday=Sunday.plusDays(7);
        }
        return count;
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
        System.out.println(checkBirthday(LocalDate.of(2002,9,3),LocalDate.now()));
        System.out.println(MondayDates(2002,3));

    }
}