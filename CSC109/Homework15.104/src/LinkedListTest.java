import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the LinkedList Class
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
        ListIterator iter = list.listIterator();
        while (iter.hasNext()) {
            r += iter.next() + " ";
        }
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
        ListIterator iter = list.listIterator();
        while (iter.hasNext()) {
            r += iter.next() + " ";
        }
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
        ListIterator iter = list.listIterator();
        while (iter.hasNext()) {
            r += iter.next() + " ";
        }
        System.out.println(r);
        assertTrue(r.equals(""));

    }

    /**
     * When you're given dummy code ... you provide dummy tests.
     */
    @Test
    public void dumbTest() {
        LinkedList list = new LinkedList();
        String[] words = new String[3];
        words[0] = "aaa";
        words[1] = "bbb";
        words[2] = "ccc";
        for (int i = words.length - 1; i >= 0; i--) {
            list.addFirst(words[i]);
        }
        ListIterator iter = list.listIterator();
        // -----
        LinkedList.check(words);
        // -----
        try {
            list.getFirst();
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        // -----
        try {
            list.removeFirst();
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        // -----
        try {
            iter.next();
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        // -----
        iter.hasNext();
        // -----
        iter.add(words[0]);
        // -----
        try {
            iter.remove();
        }
        catch (IllegalStateException e) {
            System.out.println("");
        }
        // -----
        iter.set(words[0]);
        // ---------------------------
        assertTrue(LinkedList.check(words).equals("bbb ccc aaa "));
    }

}
