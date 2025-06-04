package Java8.DateTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        String date="19-09-2002";
        DateTimeFormatter df=DateTimeFormatter.ofPattern("d-M-y");
        LocalDate localDate=LocalDate.parse(date,df);
        System.out.println(localDate);
    }
}
