package Java8.DateTimeApi.LocalTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        System.out.println("local time"+localTime);
        System.out.println("hour: "+localTime.getHour()+" minute: "+localTime.getMinute());
    }
}
