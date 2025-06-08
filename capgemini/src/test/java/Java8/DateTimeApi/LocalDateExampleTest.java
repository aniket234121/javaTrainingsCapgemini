package Java8.DateTimeApi;

import Java8.DateTimeApi.LocalDate.LocalDateExample;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LocalDateExampleTest {

    @Test
    void testDateArithmetic() {
        // Arrange
        LocalDate input = LocalDate.of(2024, 6, 4); // Example input
        LocalDate expected = input.plusDays(45).minusMonths(3);

        // Act
        LocalDate result = LocalDateExample.DateArithmetic(input);

        // Assert
        assertEquals(expected, result, "The date after adding 45 days and subtracting 3 months should match.");
    }

    @Test
    void testCheckBirthday_SameMonthAndDay() {
        // Arrange
        LocalDate birthday = LocalDate.of(1990, 6, 4); // June 4, year ignored
        LocalDate today = LocalDate.of(2025, 6, 4);    // Same month and day

        // Act
        boolean isBirthday = LocalDateExample.checkBirthday(birthday, today);

        // Assert
        assertTrue(isBirthday, "Should return true if month and day match regardless of year.");
    }

    @Test
    void testCheckBirthday_DifferentMonthOrDay() {
        // Arrange
        LocalDate birthday = LocalDate.of(1990, 6, 4);
        LocalDate today = LocalDate.of(2025, 6, 5); // Different day

        // Act
        boolean isBirthday = LocalDateExample.checkBirthday(birthday, today);

        // Assert
        assertFalse(isBirthday, "Should return false if month or day do not match.");
    }


    @Test
    public void testGetMondays_February2024() {
        List<LocalDate> mondays = LocalDateExample.MondayDates(2024, 2);
        List<LocalDate> expected = List.of(
                LocalDate.of(2024, 2, 5),
                LocalDate.of(2024, 2, 12),
                LocalDate.of(2024, 2, 19),
                LocalDate.of(2024, 2, 26)
        );
        assertEquals(expected, mondays);
    }

    @Test
    public void testGetMondays_March2023() {
        List<LocalDate> mondays = LocalDateExample.MondayDates(2023, 3);
        List<LocalDate> expected = List.of(
                LocalDate.of(2023, 3, 6),
                LocalDate.of(2023, 3, 13),
                LocalDate.of(2023, 3, 20),
                LocalDate.of(2023, 3, 27)
        );
        assertEquals(expected, mondays);
    }

    @Test
    public void testGetMondays_May2021() {
        List<LocalDate> mondays = LocalDateExample.MondayDates(2021, 5);
        List<LocalDate> expected = List.of(
                LocalDate.of(2021, 5, 3),
                LocalDate.of(2021, 5, 10),
                LocalDate.of(2021, 5, 17),
                LocalDate.of(2021, 5, 24),
                LocalDate.of(2021, 5, 31)
        );
        assertEquals(expected, mondays);
    }

    @Test
    public void testGetMondays_February2023_NonLeapYear() {
        List<LocalDate> mondays = LocalDateExample.MondayDates(2023, 2);
        List<LocalDate> expected = List.of(
                LocalDate.of(2023, 2, 6),
                LocalDate.of(2023, 2, 13),
                LocalDate.of(2023, 2, 20),
                LocalDate.of(2023, 2, 27)
        );
        assertEquals(expected, mondays);
    }

    @Test
    public void testGetMondays_January2022() {
        List<LocalDate> mondays = LocalDateExample.MondayDates(2022, 1);
        List<LocalDate> expected = List.of(
                LocalDate.of(2022, 1, 3),
                LocalDate.of(2022, 1, 10),
                LocalDate.of(2022, 1, 17),
                LocalDate.of(2022, 1, 24),
                LocalDate.of(2022, 1, 31)
        );
        assertEquals(expected, mondays);
    }

    @Test
    void testCheckBirthday_ExactMatch() {
        // Optional test for strict equality (if years match)
        LocalDate birthday = LocalDate.of(2025, 6, 4);
        LocalDate today = LocalDate.of(2025, 6, 4);

        assertTrue(LocalDateExample.checkBirthday(birthday, today), "Should return true for exact match including year.");
    }
    @Test
    public void testCountSatAndSundays() {
        // Test Case 1: Valid range with multiple weekends
        LocalDate start1 = LocalDate.of(2024, 6, 1);  // Saturday
        LocalDate end1 = LocalDate.of(2024, 6, 30);   // Sunday
        Map<String, Integer> result1 = LocalDateExample.countSatandSundays(start1, end1);
        assertEquals(5, result1.get("Saturday"));
        assertEquals(5, result1.get("Sunday"));

        // Test Case 2: Same start and end date (invalid range)
        LocalDate start2 = LocalDate.of(2024, 6, 15);
        LocalDate end2 = LocalDate.of(2024, 6, 15);
        Map<String, Integer> result2 = LocalDateExample.countSatandSundays(start2, end2);
        assertTrue(result2.isEmpty());

        // Test Case 3: startDate after endDate (invalid range)
        LocalDate start3 = LocalDate.of(2024, 7, 1);
        LocalDate end3 = LocalDate.of(2024, 6, 1);
        Map<String, Integer> result3 = LocalDateExample.countSatandSundays(start3, end3);
        assertTrue(result3.isEmpty());

        // Test Case 4: Valid range with only one weekend
        LocalDate start4 = LocalDate.of(2024, 6, 8);
        LocalDate end4 = LocalDate.of(2024, 6, 10);
        Map<String, Integer> result4 = LocalDateExample.countSatandSundays(start4, end4);
        assertEquals(1, result4.get("Saturday"));
        assertEquals(1, result4.get("Sunday"));

        // Test Case 5: Range with no weekends (Mon–Fri only)
        LocalDate start5 = LocalDate.of(2024, 6, 3); // Monday
        LocalDate end5 = LocalDate.of(2024, 6, 7);   // Friday
        Map<String, Integer> result5 = LocalDateExample.countSatandSundays(start5, end5);
        assertEquals(0, result5.get("Saturday"));
        assertEquals(0, result5.get("Sunday"));
    }
}

