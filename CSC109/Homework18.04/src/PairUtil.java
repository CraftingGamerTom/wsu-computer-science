/**
 * @version 0.1
 * @author TomRokickiii This shit is a Pair Util
 */
public class PairUtil {

    /**
     * this method does stuff
     * 
     * @param a
     *            is an array
     * @param <T>
     *            this is dumb
     * @return a new pair
     */
    public static <T extends Measurable> Pair minmax(T[] a) {

        T min = a[0];
        T max = a[0];
        for (T peaches : a) {
            if (peaches.getMeasure() > max.getMeasure()) {
                max = peaches;
            }
            if (peaches.getMeasure() < min.getMeasure()) {
                min = peaches;
            }
        }
        return new Pair(min, max);
    }
}
