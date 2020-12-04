import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the LineItem
 */
public class LineItemTest {

    /**
     * For test cases against doubles.
     */
    public static final double DELTA = 1e-15;

    /**
     * Tests the LineItem class
     */
    @Test
    public void testAll() {
        Product prod = new Product("TestProduct", 100.0);
        LineItem test = new LineItem(prod, 2);
        String constant = "TestProduct                     " 
                        + "100.00    2  200.00";

        assertEquals(test.getTotalPrice(), 200.0, DELTA);
        assertTrue(test.format().equals(constant));
    }

}
