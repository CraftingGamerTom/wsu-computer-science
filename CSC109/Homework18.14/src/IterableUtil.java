/**
 * God Help me
 * 
 * @author TomRokickiii
 * @version 0.1
 * @param <E>
 *            generic
 */
public class IterableUtil<E> {

    /**
     * This shit prints other shit.
     * 
     * @param banana
     *            the thing generic
     * @param <E>
     *            this is bullshit
     */
    public static <E> void print(Iterable<E> banana) {

        String s = "";
        for (E peach : banana) {
            s += peach + ", ";

        }
        s = s.substring(0, s.length() - 2);
        System.out.println(s);

    }
}
