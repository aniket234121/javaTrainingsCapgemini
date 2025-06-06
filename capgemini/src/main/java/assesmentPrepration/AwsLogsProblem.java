package assesmentPrepration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class AwsLogsProblem {

    //    Statement:
//    Filter only logs with "ERROR" or "CRITICAL" levels and sort them in ascending order by date and time.
//
//            Input:
//            [
//            ["09-08-2002", "12:30", "ERROR", "System crash occurred"],
//            ["08-08-2002", "14:00", "CRITICAL", "Database down"],
//            ["10-08-2002", "09:00", "INFO", "Startup successful"],
//            ["08-08-2002", "16:00", "ERROR", "Network failure"]
//            ]
    public List<List<String>> question1(List<List<String>> logs) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return logs.stream().filter(log->{
            String level=log.get(2);
            return level.equalsIgnoreCase("Error")||level.equalsIgnoreCase("Critical");
        }).sorted(Comparator.comparing(log->{
            String dateTime=log.get(0)+" "+log.get(1);
            return LocalDateTime.parse(dateTime,df);
        })).collect(Collectors.toList());

    }


//    ## Question 2: Count Logs by Type
//````
//    Statement:
//    Count how many logs exist for each log level.
//
//            Input:
//
//            [
//            ["09-08-2002", "12:30", "ERROR", "Crash"],
//            ["10-08-2002", "09:00", "INFO", "Startup"],
//            ["10-08-2002", "10:00", "ERROR", "Failed load"],
//            ["10-08-2002", "11:00", "CRITICAL", "Memory dump"]
//            ]
//    Expected Output:
//
//    {ERROR=2, INFO=1, CRITICAL=1}
//````

    public  Map<String,Long> question2(List<List<String>> logs){
        return logs.stream().collect(Collectors.groupingBy(log->log.get(2),Collectors.counting()));
    }


    public static void main(String[] args) {
        AwsLogsProblem aws=new AwsLogsProblem();
        List<List<String>> logs = new ArrayList<>();
        logs.add(Arrays.asList("09-08-2002", "12:30", "ERROR", "System crash"));
        logs.add(Arrays.asList("10-08-2002", "09:15", "INFO", "Startup complete"));
        logs.add(Arrays.asList("09-08-2002", "10:30", "CRITICAL", "Memory overflow"));
        logs.add(Arrays.asList("09-08-2002", "11:30", "WARNING", "Low disk space"));
        logs.add(Arrays.asList("08-08-2002", "16:45", "ERROR", "Service unavailable"));

        aws.question1(logs).forEach(System.out::println);
        Map<String,Long> map=aws.question2(logs);
        System.out.println(map);
    }
}
