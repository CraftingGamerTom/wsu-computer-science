import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the Fixed price Item3
 */
public class FixedPriceItemTest {

    /**
     * For test cases against doubles.
     */
    public static final double DELTA = 1e-15;

    /**
     * Tests creating a Fixed Price Item and the get price method.
     */
    @Test
    public void testAll() {
        FixedPriceItem item = new FixedPriceItem("TEST", 100.0);
        assertEquals(item.getPrice(), 100.0, DELTA);
    }

}
