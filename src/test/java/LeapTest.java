import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LeapTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40})
    @DisplayName("Confirm that numbers divisible by 4, but not 100 returns true")
    void testTrueForDivisibleBy4(int ints) {
        Leap tester = new Leap();
        assertTrue(Leap.isLeapYear(ints));

    }

    @ParameterizedTest
    @ValueSource(ints = {1200, 1600, 2000, 2400, 2800, 3200, 3600, 4000})
    @DisplayName("Confirm that numbers divisible by 400 returns true")
    void testTrueForDivisibleBy400(int ints) {
        Leap tester = new Leap();
        assertTrue(Leap.isLeapYear(ints));

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 6, 7, 9, 10, 11})
    @DisplayName("Confirm that numbers not divisible by 4 return false")
    void testFalseNotDivisibleBy4(int ints) {
        Leap tester = new Leap();
        assertFalse(Leap.isLeapYear(ints));

    }

    @ParameterizedTest
    @ValueSource(ints = {1700, 1800, 1900, 2100})
    @DisplayName("Confirm that numbers divisible by 100, but not 400, return false")
    void testFalseDivisibleBy100ButNot400(int ints) {
        Leap tester = new Leap();
        assertFalse(Leap.isLeapYear(ints));

    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044})
    @DisplayName("Confirm that leap years return true")
    void testTrueLeapYears(int ints) {
        Leap tester = new Leap();
        assertTrue(Leap.isLeapYear(ints));

    }
}