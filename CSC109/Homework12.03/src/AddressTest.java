import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @version 0.1
 * @author TomRokickiii
 * Tests the Address Class.
 */
public class AddressTest {

    /**
     * Tests the method to create an 
     * address and the method that formats it.
     */
    @Test
    public void testAll() {
        Address a = new Address(
                "Thomas Rokicki", "100 Main Street", 
                "Rutland", "Massachusetts", "01543");
        assertTrue(a.format().equals(
                "Thomas Rokicki\n100 Main Street\n"
                + "Rutland, Massachusetts 01543"));
    }

}
