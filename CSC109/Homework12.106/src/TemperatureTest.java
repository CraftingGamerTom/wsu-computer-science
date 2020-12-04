import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the Temperature Class.
 */
public class TemperatureTest {
    /**
     * For test cases against doubles.
     */
    public static final double DELTA = 1e-15;

    /**
     * Tests Celsius getter getters.
     */

    @Test
    public void testCelsiusTemp() {
        Temperature tC = new Temperature(100, "C");
        assertTrue(tC.getScale().equals("C"));
        assertEquals(tC.getValue(), 100.0, DELTA);
    }

    /**
     * Tests Fahrenheit getters.
     */
    @Test
    public void testFahrenheitTemp() {
        Temperature tF = new Temperature(100, "F");
        assertTrue(tF.getScale().equals("F"));
        assertEquals(tF.getValue(), 100.0, DELTA);
    }

    /**
     * Tests Fahrenheit Comparisons
     */
    @Test
    public void testComparisonsFahrenheit() {
        // Compare this...
        Temperature tF = new Temperature(100, "F");
        // ...to these
        Temperature tF1 = new Temperature(50, "F");
        Temperature tF2 = new Temperature(100, "F");
        Temperature tF3 = new Temperature(150, "F");

        assertEquals(tF.compareTo(tF1), 1, DELTA);
        assertEquals(tF.compareTo(tF2), 0, DELTA);
        assertEquals(tF.compareTo(tF3), -1, DELTA);
    }

    /**
     * Tests Celsius Comparisons
     */
    @Test
    public void testComparisonsCelsius() {
        // Compare this...
        Temperature tC = new Temperature(100, "C");
        // ...to these
        Temperature tC1 = new Temperature(50, "C");
        Temperature tC2 = new Temperature(100, "C");
        Temperature tC3 = new Temperature(150, "C");

        assertEquals(tC.compareTo(tC1), 1, DELTA);
        assertEquals(tC.compareTo(tC2), 0, DELTA);
        assertEquals(tC.compareTo(tC3), -1, DELTA);
    }

    /**
     * Tests comparisons of opposite temperature types (F & C).
     */
    @Test
    public void testComparisonsOpposite() {
        // Compare this...
        Temperature tC = new Temperature(0, "C");
        // ...to these
        Temperature tF1 = new Temperature(10, "F");
        Temperature tF2 = new Temperature(32, "F");
        Temperature tF3 = new Temperature(100, "F");

        assertEquals(tC.compareTo(tF1), 1, DELTA);
        assertEquals(tC.compareTo(tF2), 0, DELTA);
        assertEquals(tC.compareTo(tF3), -1, DELTA);
    }
}
