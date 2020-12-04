
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

import java.util.NoSuchElementException;

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

    // this method is called to check your work
    /**
     * Checks work. Thank you Hao Loi for not doing any documentation at all.
     * Really makes me life sooo much easier. I'm so glad I know how to do
     * Javadocs. Also I really appreciate the lack of brackets and the fact 
     * you never finished this Javadoc. I wonder if there is a way you you 
     * could use a computer to check for all your style errors... Oh Wait..
     * 
     * @param words are the wrods to be put into the linked list
     * @return r the String generated from the linked list
     */
    public static String check(String[] words) {
        LinkedList list = new LinkedList();
        for (int i = words.length - 1; i >= 0; i--) {
            list.addFirst(words[i]);
        }
        list.rotate();
        String r = "";
        ListIterator iter = list.listIterator();
        while (iter.hasNext()) {
            r += iter.next() + " ";
        }
        return r;
    }

    // you need not modify any code beyond this point

    /**
     * Returns the first element in the linked list.
     * 
     * @return the first element in the linked list
     */
    public Object getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    /**
     * Removes the first element in the linked list.
     * 
     * @return the removed element
     */
    public Object removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        return element;
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
     * Returns an iterator for iterating through this list.
     * 
     * @return an iterator for iterating through this list
     */
    public ListIterator listIterator() {
        return new LinkedListIterator();
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

    /**
     * @version 0.1
     * @author TomRokickiii Iterator. THat was 100% not needed This is an
     *         iterator class that had no documentation.
     */
    private class LinkedListIterator implements ListIterator {
        /**
         * Constructs an iterator that points to the front of the linked list.
         */
        public LinkedListIterator() {
            position = null;
            previous = null;
        }

        /**
         * Moves the iterator past the next element. Thank you for not using and
         * curly brackets so webcat would complain.
         * 
         * @return the traversed element
         */
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            previous = position; // Remember for remove

            if (position == null) {
                position = first;
            } 
            else {
                position = position.next;
            }
            return position.data;
        }

        /**
         * Tests if there is an element after the iterator position. Once again
         * thanks for not using curly brackets.
         * 
         * @return true if there is an element after the iterator position
         */
        public boolean hasNext() {
            if (position == null) {
                return first != null;
            } 
            else {
                return position.next != null;
            }
        }

        /**
         * Adds an element before the iterator position and moves the iterator
         * past the inserted element.
         * 
         * @param element
         *            the element to add
         */
        public void add(Object element) {
            if (position == null) {
                addFirst(element);
                position = first;
            } 
            else {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
            }
            previous = position;
        }

        /**
         * Removes the last traversed element. This method may only be called
         * after a call to the next() method. Wow what a shock. No curly
         * Brackets included.
         */
        public void remove() {
            if (previous == position) {
                throw new IllegalStateException();
            }
            if (position == first) {
                removeFirst();
            } 
            else {
                previous.next = position.next;
            }
            position = previous;
        }

        /**
         * Sets the last traversed element to a different value.
         * 
         * @param element
         *            the element to set
         */
        public void set(Object element) {
            if (position == null) {
                throw new NoSuchElementException();
            }
            position.data = element;
        }

        private Node position;
        private Node previous;
    }
}
