/*
We sometimes want to compare two Pair objects, for example, when using pairs as keys in a tree map.

To compare two pairs, compare the first elements of each. If they are the same, compare the second elements.

For example, the pair (1, "Joe") comes before (2, "Jim") because the first element of the first pair is less. The pair (1, "Jim") comes before (1, "Joe") because the first elements are the same and the second element of the first pair is less.

Of course, it is required that the first and second element in the pair are comparable.

Your task is to implement the compareTo method, and to add suitable constraints to the generic types.

Complete the following code:
*/
public class Pair<T extends Comparable<T>, S extends Comparable<S>> implements Comparable<Pair<T, S>> {
    public Pair(T firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    // your compareTo method here
    public int compareTo(Pair<T, S> b) {
        int ret = this.getFirst().compareTo(b.getFirst());
        if (ret == 0) {
            ret = this.getSecond().compareTo(b.getSecond());
        }
        return ret;
    }

    private T first;
    private S second;

    // this method is used to check your work

    public static int check(Integer i1, String s1, Integer i2, String s2) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(i1, s1);
        Pair<Integer, String> p2 = new Pair<Integer, String>(i2, s2);
        int d = p1.compareTo(p2);
        if (d < 0)
            return -1;
        if (d > 0)
            return 1;
        return 0;
    }

}