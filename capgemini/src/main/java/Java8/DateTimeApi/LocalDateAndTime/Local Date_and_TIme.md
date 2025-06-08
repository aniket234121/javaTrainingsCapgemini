# Local DateAndTime

## Methods
| Function          | Description                                                       | Syntax                                        |
|-------------------|-------------------------------------------------------------------|-----------------------------------------------|
| now()             | Gets the current date-time from the system clock                  | `LocalDateTime.now()`                         |
| of()              | Creates a LocalDateTime from year, month, day, hour, minute, etc. | `LocalDateTime.of(2025, 6, 8, 14, 30)`        |
| parse()           | Parses a LocalDateTime from a string                              | `LocalDateTime.parse("2025-06-08T14:30")`     |
| getYear()         | Gets the year                                                     | `dt.getYear()`                                |
| getMonth()        | Gets the month as a `Month` enum                                  | `dt.getMonth()`                               |
| getMonthValue()   | Gets the month as a number (1-12)                                 | `dt.getMonthValue()`                          |
| getDayOfMonth()   | Gets the day of the month                                         | `dt.getDayOfMonth()`                          |
| getDayOfWeek()    | Gets the day of the week as `DayOfWeek` enum                      | `dt.getDayOfWeek()`                           |
| getDayOfYear()    | Gets the day of the year                                          | `dt.getDayOfYear()`                           |
| getHour()         | Gets the hour-of-day (0–23)                                       | `dt.getHour()`                                |
| getMinute()       | Gets the minute-of-hour                                           | `dt.getMinute()`                              |
| getSecond()       | Gets the second-of-minute                                         | `dt.getSecond()`                              |
| getNano()         | Gets the nanosecond part of the time                              | `dt.getNano()`                                |
| plusDays(n)       | Returns copy with n days added                                    | `dt.plusDays(2)`                              |
| minusDays(n)      | Returns copy with n days subtracted                               | `dt.minusDays(2)`                             |
| plusHours(n)      | Returns copy with n hours added                                   | `dt.plusHours(3)`                             |
| minusHours(n)     | Returns copy with n hours subtracted                              | `dt.minusHours(1)`                            |
| plusMinutes(n)    | Returns copy with n minutes added                                 | `dt.plusMinutes(15)`                          |
| minusMinutes(n)   | Returns copy with n minutes subtracted                            | `dt.minusMinutes(15)`                         |
| plusSeconds(n)    | Returns copy with n seconds added                                 | `dt.plusSeconds(10)`                          |
| minusSeconds(n)   | Returns copy with n seconds subtracted                            | `dt.minusSeconds(5)`                          |
| withYear(n)       | Returns copy with altered year                                    | `dt.withYear(2030)`                           |
| withMonth(n)      | Returns copy with altered month                                   | `dt.withMonth(12)`                            |
| withDayOfMonth(n) | Returns copy with altered day                                     | `dt.withDayOfMonth(20)`                       |
| withHour(n)       | Returns copy with altered hour                                    | `dt.withHour(10)`                             |
| withMinute(n)     | Returns copy with altered minute                                  | `dt.withMinute(45)`                           |
| withSecond(n)     | Returns copy with altered second                                  | `dt.withSecond(30)`                           |
| withNano(n)       | Returns copy with altered nanosecond                              | `dt.withNano(123000000)`                      |
| truncatedTo(unit) | Truncates the datetime to the given unit                          | `dt.truncatedTo(ChronoUnit.HOURS)`            |
| isBefore(other)   | Checks if this datetime is before another                         | `dt.isBefore(other)`                          |
| isAfter(other)    | Checks if this datetime is after another                          | `dt.isAfter(other)`                           |
| equals(other)     | Checks if this datetime equals another                            | `dt.equals(other)`                            |
| format(formatter) | Formats this datetime using a DateTimeFormatter                   | `dt.format(DateTimeFormatter.ofPattern(...))` |
| toLocalDate()     | Returns only the date part as LocalDate                           | `dt.toLocalDate()`                            |
| toLocalTime()     | Returns only the time part as LocalTime                           | `dt.toLocalTime()`                            |
| toString()        | Returns ISO-8601 string representation                            | `dt.toString()`                               |
