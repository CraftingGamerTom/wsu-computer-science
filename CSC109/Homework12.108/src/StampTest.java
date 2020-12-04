import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @version 0.1
 * @author TomRokickiii
 * Tests the Stamp Class.
 */
public class StampTest {

    /**
     * Used for test cases.
     */
    public static final double DELTA = 1e-15;

    /**
     * Tests the Stamp Classes.
     */
    @Test
    public void test() {
        Stamp stamp = new Stamp("TestStamp", 10.0, "USA");
        assertEquals(stamp.getValue(), 10.0, DELTA);
        assertTrue(stamp.getCountry().equals("USA"));
        assertTrue(stamp.getDescription().equals("TestStamp"));
        assertEquals(stamp.getMeasure(), 10.0, DELTA);

        Stamp test1 = new Stamp("TestStamp", 9.0, "USA");
        Stamp test2 = new Stamp("TestStamp", 10.0, "USA");
        Stamp test3 = new Stamp("TestStamp", 11.0, "USA");
        assertEquals(stamp.compareTo(test1), 1);
        assertEquals(stamp.compareTo(test2), 0);
        assertEquals(stamp.compareTo(test3), -1);
    }

}
