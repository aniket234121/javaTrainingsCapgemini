# Java Practice Problems:
Log Data Using `List<List<String>>`

Each log is represented as a list of 4 strings in this format:
```
[date, time, level, message]
All inputs follow this structure. Output is written in Java System.out.println() style.

```

### Question 1: Filter and Sort ERROR & CRITICAL Logs
```
Statement:
Filter only logs with "ERROR" or "CRITICAL" levels and sort them in ascending order by date and time.

Input:
[
    ["09-08-2002", "12:30", "ERROR", "System crash occurred"],
    ["08-08-2002", "14:00", "CRITICAL", "Database down"],
    ["10-08-2002", "09:00", "INFO", "Startup successful"],
    ["08-08-2002", "16:00", "ERROR", "Network failure"]
]
Expected Output:

[
    [08-08-2002, 14:00, CRITICAL, Database down],
    [08-08-2002, 16:00, ERROR, Network failure],
    [09-08-2002, 12:30, ERROR, System crash occurred]
]
```
### Question 2: Count Logs by Type
````
Statement:
Count how many logs exist for each log level.

Input:

[
    ["09-08-2002", "12:30", "ERROR", "Crash"],
    ["10-08-2002", "09:00", "INFO", "Startup"],
    ["10-08-2002", "10:00", "ERROR", "Failed load"],
    ["10-08-2002", "11:00", "CRITICAL", "Memory dump"]
]
Expected Output:

{ERROR=2, INFO=1, CRITICAL=1}
````
### Question 3: Extract ERROR Messages Only
````
Statement:
Extract messages from logs where the log level is "ERROR".

Input:

[
    ["09-08-2002", "12:30", "ERROR", "Crash"],
    ["10-08-2002", "09:00", "INFO", "Start"],
    ["10-08-2002", "10:00", "ERROR", "Load failed"]
]
Expected Output:

[Crash, Load failed]
````
### Question 4: Unique Log Types
``````
Statement:
Return all unique log types from the logs.

Input:

[
    ["09-08-2002", "12:30", "ERROR", "Crash"],
    ["09-08-2002", "13:30", "INFO", "Ready"],
    ["09-08-2002", "14:30", "WARNING", "Temp high"],
    ["09-08-2002", "15:30", "ERROR", "Crash again"]
]
Expected Output:

[ERROR, INFO, WARNING]
``````
### Question 5: Count Logs Per Day
````
Statement:
Count how many logs occurred per date.

Input:

[
    ["09-08-2002", "12:30", "ERROR", "Crash"],
    ["09-08-2002", "14:00", "INFO", "Login"],
    ["10-08-2002", "10:00", "CRITICAL", "Fail"],
    ["09-08-2002", "16:00", "WARNING", "Disk full"]
]
Expected Output:

{09-08-2002=3, 10-08-2002=1}
