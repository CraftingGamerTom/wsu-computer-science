import java.util.Iterator;

/**
 * This class implements a hash set using separate chaining.
 * 
 * @author TomRokickiii
 * @version 0.1
 * @param <T>
 *            Generic Type
 */
public class HashSet<T> {
    private Node<T>[] buckets;
    private int currentSize;

    /**
     * Constructs a hash table.
     * 
     * @param bucketsLength
     *            the length of the buckets array
     */
    public HashSet(int bucketsLength) {
        buckets = new Node[bucketsLength];
        currentSize = 0;
    }

    /**
     * Tests for set membership.
     * 
     * @param x
     *            an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;

        Node current = buckets[h];
        while (current != null) {
            if (current.data.equals(x)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Adds an element to this set.
     * 
     * @param x
     *            an object
     * @return true if x is a new object, false if x was already in the set
     */
    public boolean add(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;

        Node current = buckets[h];
        while (current != null) {
            if (current.data.equals(x)) {
                return false;
            }
            // Already in the set
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = buckets[h];
        buckets[h] = newNode;
        currentSize++;
        return true;
    }

    /**
     * Removes an object from this set.
     * 
     * @param x
     *            an object
     * @return true if x was removed from this set, false if x was not an
     *         element of this set
     */
    public boolean remove(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;

        Node current = buckets[h];
        Node previous = null;
        while (current != null) {
            if (current.data.equals(x)) {
                if (previous == null) {
                    buckets[h] = current.next;
                }
                else {
                    previous.next = current.next;
                }
                currentSize--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    /**
     * Returns an iterator that traverses the elements of this set.
     * 
     * @return a hash set iterator
     */
    public Iterator iterator() {
        return new HashSetIterator();
    }

    /**
     * Gets the number of elements in this set.
     * 
     * @return the number of elements
     */
    public int size() {
        return currentSize;
    }

    /**
     * A Node Class
     * 
     * @author TomRokickiii
     * @version 0.1
     * @param <T>
     */
    class Node<T> {
        /**
         * the data
         */
        public T data;
        /**
         * the next node
         */
        public Node next;

    }

    /**
     * @version 0.1
     * @author TomRokickiii Iterator Class
     */
    class HashSetIterator implements Iterator {
        private int bucket;
        private Node current;

        /**
         * Constructs a hash set iterator that points to the first element of
         * the hash set.
         */
        public HashSetIterator() {
            current = null;
            bucket = -1;
        }

        /**
         * Checks if the set has a next node
         * 
         * @return returns a boolean
         */
        public boolean hasNext() {
            if (current != null && current.next != null) {
                return true;
            }
            for (int b = bucket + 1; b < buckets.length; b++) {
                if (buckets[b] != null) {
                    return true;
                }
            }
            return false;
        }

        /**
         * iterates forward
         * 
         * @return current.data an object
         */
        public Object next() {
            if (current != null && current.next != null) {
                current = current.next; // Move to next element in bucket
            }
            else // Move to next bucket
            {
                do {
                    bucket++;
                    /*
                     * Not Testing - if (bucket == buckets.length) { throw new
                     * NoSuchElementException(); }
                     */
                    current = buckets[bucket];
                }
                while (current == null);
            }
            return current.data;
        }

        /*
         * /** removes stuff
         */
        /*
         * public void remove() { throw new UnsupportedOperationException(); }
         */
    }
}