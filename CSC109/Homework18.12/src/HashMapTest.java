import static org.junit.Assert.*;

import java.awt.Color;
import java.util.Set;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii A test case
 */
public class HashMapTest {

    /**
     * A test case
     */
    @Test
    public void test() {

        HashMap<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Juliet", Color.PINK);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.BLUE);
        favoriteColors.put("Eve", Color.PINK);
        favoriteColors.put("Romeo", Color.WHITE);
        favoriteColors.remove("Juliet");

        String s1 = favoriteColors.get("Romeo").toString();
        assertTrue(s1.equals("java.awt.Color[r=255,g=255,b=255]"));
        assertNull(favoriteColors.get("Juliet"));
        assertEquals(favoriteColors.size(), 3);
        Set<String> a = favoriteColors.keySet();
        a.size();

    }

}
