package DateTimeApiTesting;

import Java8.DateTimeApi.LocalDateExample;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
    void testCheckBirthday_ExactMatch() {
        // Optional test for strict equality (if years match)
        LocalDate birthday = LocalDate.of(2025, 6, 4);
        LocalDate today = LocalDate.of(2025, 6, 4);

        assertTrue(LocalDateExample.checkBirthday(birthday, today), "Should return true for exact match including year.");
    }
}

