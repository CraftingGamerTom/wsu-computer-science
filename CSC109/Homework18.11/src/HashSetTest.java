import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii A Tester class
 */
public class HashSetTest {

    /**
     * The Test Class
     */
    @Test
    public void test() {
        HashSet<String> names = new HashSet<String>(101);
        // 101 is a prime

        names.add("Sue");
        names.add("Harry");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        names.remove("Romeo");
        names.remove("George");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            assertTrue(iter.next().length() > 1);
        }
    }

    /**
     * The Test Class for crap I should not need to waste time on
     */
    @Test
    public void testIso() {
        HashSet<String> names = new HashSet<String>(101);
        // 101 is a prime

        // Run remove
        try {
            names.remove("");
        }
        catch (UnsupportedOperationException e) {
            System.out.println("");
        }
        // Run size
        names.size();

        names.add("Sue");
        names.add("Harry");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        names.remove("Romeo");
        names.remove("George");
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            assertTrue(iter.next().length() > 1);
        }
    }
}
