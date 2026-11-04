package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {
    private PriceFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new PriceFormatter();
    }

    @Test
    void testBasicFormatting() {
        assertEquals("123 456,79 €", formatter.formatPrice(123456.789));
    }

    @Test 
    void testPriceWithoutDecimals(){
        assertEquals("10 000 €", formatter.formatPrice(10000.00));
    }

    @Test 
    void testRounding(){
        assertEquals("3,15 €", formatter.formatPrice(3.146));
    }

    @Test 
    void testRoundingDown(){
        assertEquals("3,12 €", formatter.formatPrice(3.123));
    }

    @Test 
    void testLargeNumberFormatting(){
        assertEquals("1 234 567,89 €", formatter.formatPrice(1234567.89));
    }

    @Test 
    void testDecimalWithTwoDigits() {
        assertEquals("12,50 €", formatter.formatPrice(12.5));
    }

    @Test 
    void testRemoveDecimalsAfterRounding(){
        assertEquals("12 €", formatter.formatPrice(12.004));
    }

}
