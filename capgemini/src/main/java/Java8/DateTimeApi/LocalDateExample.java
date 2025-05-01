package Java8.DateTimeApi;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate currentDate=LocalDate.now();
        LocalDate randomDate=LocalDate.of(2000,9,8);
        System.out.println(currentDate);
        System.out.println(randomDate);

        System.out.println(currentDate.isAfter(randomDate));
        System.out.println(currentDate.plusMonths(4));
        System.out.println(currentDate.minusDays(2));

        System.out.println("parse the string date to local date"+LocalDate.parse("2000-09-08"));

        //zoned date

        ZoneId zoneid=ZoneId.of("America/Los_Angeles");
        LocalDate localDateofZone=LocalDate.now(zoneid);
        System.out.println(localDateofZone+" this is localDateofZOne");


    }
}