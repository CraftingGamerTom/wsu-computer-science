/**
 *
 * @author brendan
 * @version 0.1
 * @param <T>
 *            the first object
 * @param <S>
 *            the second object
 */
public class Pair<T, S> {

    private T first;
    private S second;

    /**
     *
     * @param firstElement
     *            the first element
     * @param secondElement
     *            the second element
     */
    public Pair(T firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
    }

    /**
     *
     * @return return the first element
     */
    public T getFirst() {
        return first;
    }

    /**
     *
     * @return returns the second element
     */
    public S getSecond() {
        return second;
    }

    /**
     *
     * @param otherObject
     *            the object to compare to
     * @return returns true if equal
     */
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject.getClass() == this.getClass()) {
            Pair tmp = (Pair) otherObject;
            if (tmp.first != this.first) {
                return false;
            }
            else {
                return tmp.second == this.second;
            }
        }
        else {
            return false;
        }
    }

    /**
     *
     * @return returns a hashCode?
     */
    @Override
    public int hashCode() {
        return first.hashCode() + second.hashCode();
    }
}