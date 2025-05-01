# LocalDate

* **now()** -> gives current date.
* **of(2000,06,09)** -> to create any date object. ( inbuilt validation for dates create using of)
* **isAfter(date obj)**  ->check is called Date obj is after passed date obj.
* **isBefore(date obj)** ->check is called Date obj is before passed date obj.
* **plusMongths(long no. of month to add)** add the month to the old date and return new date object.

| Function            | Description                                                   | Syntax                          |
|---------------------|---------------------------------------------------------------|---------------------------------|
| now()               | Gets the current date from the system clock                   | `LocalDate.now()`               |
| of()                | Obtains an instance of `LocalDate` from year, month, and day  | `LocalDate.of(2025, 6, 4)`      |
| parse()             | Parses a `LocalDate` from a text string                       | `LocalDate.parse("2025-06-04")` |
| getYear()           | Gets the year field                                           | `date.getYear()`                |
| getMonth()          | Gets the month as a `Month` enum                              | `date.getMonth()`               |
| getMonthValue()     | Gets the month as an int from 1 to 12                         | `date.getMonthValue()`          |
| getDayOfMonth()     | Gets the day of the month                                     | `date.getDayOfMonth()`          |
| getDayOfWeek()      | Gets the day of the week as a `DayOfWeek` enum                | `date.getDayOfWeek()`           |
| getDayOfYear()      | Gets the day of the year                                      | `date.getDayOfYear()`           |
| isLeapYear()        | Checks if the year is a leap year                             | `date.isLeapYear()`             |
| lengthOfMonth()     | Returns the length of the month in days                       | `date.lengthOfMonth()`          |
| lengthOfYear()      | Returns the length of the year in days                        | `date.lengthOfYear()`           |
| plusDays(n)         | Returns a copy with the specified number of days added        | `date.plusDays(5)`              |
| minusDays(n)        | Returns a copy with the specified number of days subtracted   | `date.minusDays(3)`             |
| plusMonths(n)       | Returns a copy with the specified number of months added      | `date.plusMonths(2)`            |
| minusMonths(n)      | Returns a copy with the specified number of months subtracted | `date.minusMonths(1)`           |
| plusYears(n)        | Returns a copy with the specified number of years added       | `date.plusYears(1)`             |
| minusYears(n)       | Returns a copy with the specified number of years subtracted  | `date.minusYears(1)`            |
| withDayOfMonth(n)   | Returns a copy with the day of month altered                  | `date.withDayOfMonth(15)`       |
| withMonth(n)        | Returns a copy with the month altered                         | `date.withMonth(12)`            |
| withYear(n)         | Returns a copy with the year altered                          | `date.withYear(2030)`           |
| until(otherDate)    | Calculates the period between two dates                       | `date.until(otherDate)`         |
| isBefore(otherDate) | Checks if this date is before the specified date              | `date.isBefore(otherDate)`      |
| isAfter(otherDate)  | Checks if this date is after the specified date               | `date.isAfter(otherDate)`       |
| equals(otherDate)   | Checks if this date is equal to the specified date            | `date.equals(otherDate)`        |
| toString()          | Converts the date                                             |                                 |

# LocalTime

