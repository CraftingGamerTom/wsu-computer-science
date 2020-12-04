import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii A test case for SameHashCode
 */
public class SameHashCodeTest {
    /**
     * The one and only test case.
     */
    @Test
    public void test() {
        SameHashCode test = new SameHashCode();
        try {
            Map<Integer, HashSet<String>> theMap = test.sameHash("words");
            assertNotNull(theMap);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            assert (false);
        }

    }

}
