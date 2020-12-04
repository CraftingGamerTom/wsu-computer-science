import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii A Test case class
 */
public class LinkedListTest {
    /**
     * Java doc for the test case
     */
    @Test
    public void test() {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Dick");

        // | in the comments indicates the iterator position

        ListIterator iterator = staff.listIterator(); // |DHRT
        iterator.next(); // D|HRT
        iterator.next(); // DH|RT

        // Add more elements after second element

        iterator.add("Juliet"); // DHJ|RT
        iterator.add("Nina"); // DHJN|RT

        iterator.next(); // DHJNR|T

        // Remove last traversed element

        iterator.remove(); // DHJN|T

        // Print all elements

        String s = "";
        iterator = staff.listIterator();
        while (iterator.hasNext()) {
            s += iterator.next() + " ";
        }
        assertTrue(s.equals("Dick Harry Juliet Nina Tom "));

    }

    /**
     * Tests Null
     */
    @Test
    public void testNull() {
        LinkedList<String> staff = new LinkedList<String>();
        ListIterator iterator = staff.listIterator();
        String s = "";
        // Run next
        try {
            iterator.next();
        }
        catch (NoSuchElementException e) {
            System.out.println("");
        }
        // Run remove
        try {
            iterator.remove();
        }
        catch (IllegalStateException e) {
            System.out.println("");
        }
        // Run set
        try {
            iterator.set("test");
        }
        catch (NoSuchElementException e) {
            System.out.println("");
        }
        // Run removeFirst
        try {
            staff.removeFirst();
        }
        catch (NoSuchElementException e) {
            System.out.println("");
        }
        // Run getFirst
        try {
            staff.getFirst();
        }
        catch (NoSuchElementException e) {
            System.out.println("");
            s = "Pass";
        }
        assertTrue(s.equals("Pass"));
    }

    /**
     * Isolated runs
     */
    @Test
    public void testIso() {
        LinkedList<String> staff = new LinkedList<String>();
        ListIterator iterator = staff.listIterator();

        // Run remove which will call removeFirst
        staff.addFirst("FIRST");
        // Run add
        iterator.add("testt");
        // Run remove
        iterator.next();
        iterator.remove();

        iterator.add("testThree");
        // Run set properly
        iterator.set("testFour");
        // Run getFirst properly
        Object s = staff.getFirst();
        assertTrue(s.equals("testt"));
    }

}
