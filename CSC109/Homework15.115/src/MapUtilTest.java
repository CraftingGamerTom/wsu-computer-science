import static org.junit.Assert.*;

import java.util.Map;
import java.util.TreeSet;
import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the MapUtil Class.
 */
public class MapUtilTest {

    /**
     * Tests 6 sizes, 9 difference words
     */
    @Test
    public void test() {
        /*
         * 1 - 2 2 - 1 4 - 4 5 - 1 6 - 1 7 - 1
         */
        String[] words = { "I", "dont", "really", "know", "what", "I", "am",
            "doing", "Just", "kidding" };
        MapUtil m = new MapUtil();
        Map<Integer, TreeSet<String>> myMap = m.makeMap(words);
        assertTrue(myMap.toString()
                .equals("{1=[I], 2=[am], 4=[Just, dont, know, what],"
                        + " 5=[doing], 6=[really], 7=[kidding]}"));
    }

}
