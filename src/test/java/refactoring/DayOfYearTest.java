package refactoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DayOfYearTest {

    @Test
    void testJanuaryFirst() {
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2025));
    }

    @Test
    void testJanuary31() {
        assertEquals(31, DayOfYear.dayOfYear(1, 31, 2025));
    }

    @Test
    void testFebruaryFirst() {
        assertEquals(32, DayOfYear.dayOfYear(2, 1, 2025));
    }

    @Test
    void testMarchFirstNomalYear() {
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 2025));
    }

    @Test
    void testMarchFirstLeapYear() {
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2024));
    }

    @Test
    void testFebruary29LeapYear() {
        assertEquals(60, DayOfYear.dayOfYear(2, 29, 2024));
    }

    @Test
    void testDecember31LeapYear() {
        assertEquals(366, DayOfYear.dayOfYear(12, 31, 2024));
    }

    @Test
    void testDecember31NormalYear() {
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2025));
    }

    @Test
    void testDecemberFirstNormalYear() {
        assertEquals(335, DayOfYear.dayOfYear(12, 1, 2025));
    }

    @Test 
    void testAprilFirst(){
        assertEquals(91, DayOfYear.dayOfYear(4, 1, 2025));
    }

    @Test 
    void testJulyFirst(){
        assertEquals(182, DayOfYear.dayOfYear(7, 1, 2025));
    }

    @Test 
    void testOctoberFirst(){
        assertEquals(274, DayOfYear.dayOfYear(10, 1, 2025));
    }

    @Test 
    void testFebruary28LeapYear(){
        assertEquals(59, DayOfYear.dayOfYear(2, 28, 2024));
    }

    @Test 
    void testFebruary28NormalYear(){
        assertEquals(59, DayOfYear.dayOfYear(2, 28, 2025));
    }
}
