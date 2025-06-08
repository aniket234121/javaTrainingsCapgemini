# LocalDate

* **now()** -> gives current date.
* **of(2000,06,09)** -> to create any date object. ( inbuilt validation for dates create using of)
* **isAfter(date obj)**  ->check is called Date obj is after passed date obj.
* **isBefore(date obj)** ->check is called Date obj is before passed date obj.
* **plusMongths(long no. of month to add)** add the month to the old date and return new date object.

| Function                             | Description                                                   | Syntax                          |
|--------------------------------------|---------------------------------------------------------------|---------------------------------|
| `now()`                              | Gets the current date from the system clock                   | `LocalDate.now()`               |
| `of(int year, int month, int day)`   | Obtains an instance of `LocalDate` from year, month, and day  | `LocalDate.of(2025, 6, 4)`      |
| `parse(CharSequence text)`           | Parses a `LocalDate` from a text string                       | `LocalDate.parse("2025-06-04")` |
| `getYear()`                          | Gets the year field                                           | `date.getYear()`                |
| `getMonth()`                         | Gets the month as a `Month` enum                              | `date.getMonth()`               |
| `getMonthValue()`                    | Gets the month as an int from 1 to 12                         | `date.getMonthValue()`          |
| `getDayOfMonth()`                    | Gets the day of the month                                     | `date.getDayOfMonth()`          |
| `getDayOfWeek()`                     | Gets the day of the week as a `DayOfWeek` enum                | `date.getDayOfWeek()`           |
| `getDayOfYear()`                     | Gets the day of the year                                      | `date.getDayOfYear()`           |
| `isLeapYear()`                       | Checks if the year is a leap year                             | `date.isLeapYear()`             |
| `lengthOfMonth()`                    | Returns the length of the month in days                       | `date.lengthOfMonth()`          |
| `lengthOfYear()`                     | Returns the length of the year in days                        | `date.lengthOfYear()`           |
| `plusDays(long daysToAdd)`           | Returns a copy with the specified number of days added        | `date.plusDays(5)`              |
| `minusDays(long daysToSubtract)`     | Returns a copy with the specified number of days subtracted   | `date.minusDays(3)`             |
| `plusMonths(long monthsToAdd)`       | Returns a copy with the specified number of months added      | `date.plusMonths(2)`            |
| `minusMonths(long monthsToSubtract)` | Returns a copy with the specified number of months subtracted | `date.minusMonths(1)`           |
| `plusYears(long yearsToAdd)`         | Returns a copy with the specified number of years added       | `date.plusYears(1)`             |
| `minusYears(long yearsToSubtract)`   | Returns a copy with the specified number of years subtracted  | `date.minusYears(1)`            |
| `withDayOfMonth(int dayOfMonth)`     | Returns a copy with the day of month altered                  | `date.withDayOfMonth(15)`       |
| `withMonth(int month)`               | Returns a copy with the month altered                         | `date.withMonth(12)`            |
| `withYear(int year)`                 | Returns a copy with the year altered                          | `date.withYear(2030)`           |
| `until(ChronoLocalDate endDate)`     | Calculates the period between two dates                       | `date.until(otherDate)`         |
| `isBefore(ChronoLocalDate other)`    | Checks if this date is before the specified date              | `date.isBefore(otherDate)`      |
| `isAfter(ChronoLocalDate other)`     | Checks if this date is after the specified date               | `date.isAfter(otherDate)`       |
| `equals(Object otherDate)`           | Checks if this date is equal to the specified date            | `date.equals(otherDate)`        |
| `toString()`                         | Converts the date to a string                                 | `date.toString()`               |


# Java `LocalDate` Task List (Easy to Hard)

A series of tasks to practice and master the `LocalDate` class in Java.

---

## ✅ Task 1: Basic LocalDate Creation and Formatting (Easy)

Write a method to:

- Create today’s date.
- Create a specific date (e.g., `1995-08-20`).
- Format both dates in the `"dd-MM-yyyy"` pattern.

---

## ✅ Task 2: Date Arithmetic (Moderate)

Write a method that:

- Takes a `LocalDate` input.
- Adds 45 days.
- Subtracts 3 months.
- Returns the resulting date.

---

## ✅ Task 3: Check for Recurring Events (Moderate)

Write a method that:

- Takes two inputs: a `LocalDate` of a birthday and today’s date.
- Checks if today is that birthday (ignoring the year).
- Returns `true` if it is, otherwise `false`.

---

## ✅ Task 4: List All Mondays in a Given Month (Intermediate)

Write a method that:

- Takes a year and month as input.
- Returns a list of all dates that fall on a **Monday** in that month.

💡 *Hint*: Use `TemporalAdjusters` and `DayOfWeek.MONDAY`.

---

## ✅ Task 5: Date Range Validation & Counting (Hard)

Write a method that:

- Takes two `LocalDate` inputs: `startDate` and `endDate`.
- Validates that `startDate` is before `endDate`.
- Counts how many **Saturdays** and **Sundays** fall within the date range.
- Returns the counts using either a custom class or a `Map<String, Integer>`.

---

🎯 **Instructions**:
1. Implement each task using Java 8 or later.
2. Submit your code for review.
3. Receive tips and performance suggestions for writing efficient and clean date-related logic.

Happy Coding! 🚀


# LocalTime

