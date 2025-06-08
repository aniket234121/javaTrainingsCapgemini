# DateTimeFormatter

## Formatter 

| Symbol | Meaning             | Example    |
|--------|---------------------|------------|
| yyyy   | Year                | 2025       |
| MM     | Month (2 digits)    | 06         |
| MMM    | Month (short name)  | Jun        |
| dd     | Day of month        | 08         |
| EEEE   | Day of week (full)  | Sunday     |
| E      | Day of week (short) | Sun        |
| HH     | Hour (0-23)         | 14         |
| hh     | Hour (1-12)         | 02         |
| mm     | Minute              | 30         |
| ss     | Second              | 15         |
| a      | AM/PM marker        | PM         |
| SSS    | Milliseconds        | 123        |
| z      | Time zone           | IST        |
| X      | ISO 8601 time zone  | +05, +0530 |


## common Methods
| Method Signature                                                                | Description                           |
|---------------------------------------------------------------------------------|---------------------------------------|
| static DateTimeFormatter ofPattern(String pattern)                              | Creates a formatter using a pattern   |
| static DateTimeFormatter ofPattern(String pattern, Locale l)                    | Creates a locale-sensitive formatter  |
| String format(TemporalAccessor temporal)                                        | Formats a date/time object to string  |
| TemporalAccessor parse(CharSequence text)                                       | Parses a string to a date/time object |
| <T extends TemporalAccessor> T parse(CharSequence text, TemporalQuery<T> query) | Parses with a query                   |
