/*
Your task is to add a rotate method to the LinkedList class of Section 15.2 
that rotates the elements of a linked list so that the second element becomes 
the first, the third the second, and so on. The first element becomes the 
last element. For example, after rotating the list containing the elements

Mary, had, a, little, lamb
the list becomes

had, a, little, lamb, Mary
Complete the following code:
*/

/**
 * @author TomRokickiii
 * @version 0.1 A linked list is a sequence of nodes with efficient element
 *          insertion and removal. This class contains a subset of the methods
 *          of the standard java.util.LinkedList class. Thank you so much
 *          Professor Loi for writing code that has a million style errors
 *          according to your own program.
 */
public class LinkedList {
    private Node first;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        first = null;
    }

    /**
     * Rotates the elements of a linked list so that the second element becomes
     * the first, the third the second, and so on. The first element becomes the
     * last element.
     */
    public void rotate() {
        if (first == null || first.next == null) {
            return;
        }
        Node temp = first;
        Node f = first;
        // ListIterator iterator = listIterator();

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = first;

        first = first.next;
        f.next = null;

    }
    /**
     * Adds an element to the front of the linked list.
     * 
     * @param element
     *            the element to add
     */
    public void addFirst(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }
    /**
     * @version 0.1
     * @author TomRokickiii A F*CKING NODE. This is a Node Class that had no
     *         documentation
     */
    private class Node {
        public Object data;
        public Node next;
    }
}
