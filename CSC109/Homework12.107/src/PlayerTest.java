import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the Player Object Class
 * 
 * @author TomRokickiii
 * @version 0.1
 */
public class PlayerTest {

    /**
     * Creates a new Player object, tests all the methods.
     */
    @Test
    public void test() {
        Player p = new Player("John Doe", "Center");

        assertTrue(p.getName().equals("John Doe"));
        assertTrue(p.getPosition().equals("Center"));

        assertTrue(p.toString().equals("John Doe-Center"));

    }

}
