import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Test Case for DataSet Class.
 */
public class DataSetTest {

    /**
     * Used for test cases.
     */
    public static final double DELTA = 1e-15;

    /**
     * Tests if the dataSet class is getting the maximum number.
     */
    @Test
    public void test1() {
        int[] values = { 1, 10, 100, -1, -10, -100, 100, 0 };
        DataSet d = new DataSet(values, 0, values.length - 1);
        // System.out.println("Maximum: " + d.getMaximum());
        // System.out.println("Expected: 100");
        assertEquals(d.getMaximum(), 100, DELTA);
    }

    /**
     * Tests if the dataSet class is getting the sum of all numbers in the array
     * even with a negative number.
     */
    @Test
    public void test2() {
        int[] values = { -5, -1, -10, -2, -10, -100, -12, -7 };
        DataSet d = new DataSet(values, 0, values.length - 1);
        // System.out.println("Maximum: " + d.getMaximum());
        // System.out.println("Expected: -1");
        assertEquals(d.getMaximum(), -1, DELTA);
    }
}
