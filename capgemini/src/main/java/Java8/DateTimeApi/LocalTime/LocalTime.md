# LocalTime

## Methods
| Function            | Description                                                         | Syntax                               |
|---------------------|---------------------------------------------------------------------|--------------------------------------|
| now()               | Gets the current time from the system clock                         | `LocalTime.now()`                    |
| of()                | Obtains an instance of `LocalTime` from hour, minute, etc.          | `LocalTime.of(14, 30)`               |
| parse()             | Parses a `LocalTime` from a text string                             | `LocalTime.parse("14:30")`           |
| getHour()           | Gets the hour-of-day field (0-23)                                   | `time.getHour()`                     |
| getMinute()         | Gets the minute-of-hour field (0-59)                                | `time.getMinute()`                   |
| getSecond()         | Gets the second-of-minute field (0-59)                              | `time.getSecond()`                   |
| getNano()           | Gets the nano-of-second field (0-999,999,999)                       | `time.getNano()`                     |
| isBefore(otherTime) | Checks if this time is before another time                          | `time.isBefore(otherTime)`           |
| isAfter(otherTime)  | Checks if this time is after another time                           | `time.isAfter(otherTime)`            |
| equals(otherTime)   | Checks if this time equals another time                             | `time.equals(otherTime)`             |
| plusHours(n)        | Returns a copy with the specified number of hours added             | `time.plusHours(2)`                  |
| minusHours(n)       | Returns a copy with the specified number of hours subtracted        | `time.minusHours(1)`                 |
| plusMinutes(n)      | Returns a copy with the specified number of minutes added           | `time.plusMinutes(30)`               |
| minusMinutes(n)     | Returns a copy with the specified number of minutes subtracted      | `time.minusMinutes(15)`              |
| plusSeconds(n)      | Returns a copy with the specified number of seconds added           | `time.plusSeconds(10)`               |
| minusSeconds(n)     | Returns a copy with the specified number of seconds subtracted      | `time.minusSeconds(5)`               |
| plusNanos(n)        | Returns a copy with the specified number of nanoseconds added       | `time.plusNanos(1000)`               |
| minusNanos(n)       | Returns a copy with the specified number of nanoseconds subtracted  | `time.minusNanos(1000)`              |
| withHour(n)         | Returns a copy with the hour-of-day altered                         | `time.withHour(10)`                  |
| withMinute(n)       | Returns a copy with the minute-of-hour altered                      | `time.withMinute(45)`                |
| withSecond(n)       | Returns a copy with the second-of-minute altered                    | `time.withSecond(20)`                |
| withNano(n)         | Returns a copy with the nano-of-second altered                      | `time.withNano(500000000)`           |
| truncatedTo(unit)   | Truncates the time to the specified unit (e.g., ChronoUnit.MINUTES) | `time.truncatedTo(ChronoUnit.HOURS)` |
| toSecondOfDay()     | Converts time to total seconds since midnight                       | `time.toSecondOfDay()`               |
| toNanoOfDay()       | Converts time to total nanoseconds since midnight                   | `time.toNanoOfDay()`                 |
| toString()          | Converts time to ISO-8601 string format                             | `time.toString()`                    |
