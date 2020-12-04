import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A Sentence Test object. The object stores a string that can be reversed.
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class SentenceTest {

    /**
     * Test the Sentence Object Class
     */
    @Test
    public void test() {
        Sentence greeting = new Sentence("Hello!");
        assertTrue(greeting.getText().equals("Hello!"));
        greeting.reverse();
        assertTrue(greeting.getText().equals("!olleH"));
    }

}
