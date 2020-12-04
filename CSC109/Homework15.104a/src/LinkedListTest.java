import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii
 * Tests the LinkedList Class
 */
public class LinkedListTest {

    /**
     * Tests if everything works as normal case.
     */
    @Test
    public void test() {
        LinkedList list = new LinkedList();
        String[] words = new String[3];
        words[0] = "aaa";
        words[1] = "bbb";
        words[2] = "ccc";
        for (int i = words.length - 1; i >= 0; i--) {
            list.addFirst(words[i]);
        }
        list.rotate();
        String r = "";
        r = list.toString();
        // System.out.println(r);
        assertTrue(r.equals("bbb ccc aaa "));

    }

    /**
     * Tests what would happen if the size is 1
     */
    @Test
    public void test2() {
        LinkedList list = new LinkedList();
        String[] words = new String[1];
        words[0] = "a";

        for (int i = words.length - 1; i >= 0; i--) {
            list.addFirst(words[i]);
        }
        list.rotate();
        String r = "";
        r = list.toString();
        // System.out.println(r);
        assertTrue(r.equals("a "));

    }

    /**
     * Tests the occurance if there is nothing in the LinkedList
     */
    @Test
    public void test3() {
        LinkedList list = new LinkedList();
        String[] words = new String[0];
        for (int i = words.length - 1; i >= 0; i--) {
            list.addFirst(words[i]);
        }
        list.rotate();
        String r = "";
        r = list.toString();
        System.out.println(r);
        assertTrue(r.equals(""));

    }

}
