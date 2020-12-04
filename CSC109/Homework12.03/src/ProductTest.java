import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @version 0.1
 * @author TomRokickiii
 * Tests the Product Class.
 */
public class ProductTest {
    
    /**
     * For test cases against doubles.
     */
    public static final double DELTA = 1e-15;

    /**
     * Tests the Product Class.
     */
    @Test
    public void test() {
        Product prod = new Product("TestProduct", 100.0);
        assertTrue(prod.getDescription().equals("TestProduct"));
        assertEquals(prod.getPrice(), 100.0, DELTA);
    }

}
