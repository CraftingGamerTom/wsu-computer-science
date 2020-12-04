/**
 * The Pair Object Class
 * 
 * @author TomRokickiii
 * @version 0.1
 *
 * @param <T>
 *            Generic First
 * @param <S>
 *            Generic Second
 */
public class Pair<T, S> {
    private T first;
    private S second;

    /**
     * The pair constructor
     * 
     * @param firstElement
     *            first
     * @param secondElement
     *            second
     */
    public Pair(T firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
    }

    /**
     * a getter
     * 
     * @return first the first item
     */
    public T getFirst() {
        return first;
    }

    /**
     * a getter
     * 
     * @return second the second item0
     */
    public S getSecond() {
        return second;
    }
}
