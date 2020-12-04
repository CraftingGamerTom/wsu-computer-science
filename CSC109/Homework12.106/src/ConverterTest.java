import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the Converter Class.
 */
public class ConverterTest {

    /**
     * For test cases against doubles.
     */
    public static final double DELTA = 1e-15;

    /**
     * Tests converting from Celsius to Fahrenheit.
     */
    @Test
    public void testToFahrenheit() {
        Converter toFahrenheit = new Converter(9.0 / 5, 32);

        assertEquals(toFahrenheit.convert(0), 32, DELTA);
    }

    /**
     * Tests converting from Fahrenheit to Celsius.
     */
    @Test
    public void testToCelsius() {
        Converter toCelsius = new Converter(5.0 / 9.0, -32);

        assertEquals(toCelsius.convert(32), 0, DELTA);
    }

    /**
     * Tests occurance of a scale other than Celsius and Fahrenheit.
     */
    @Test
    public void testBadScale() {
        Converter badScale = new Converter(5.0 / 9.0, 0);

        assertEquals(badScale.convert(100), 0, DELTA);
    }

}
