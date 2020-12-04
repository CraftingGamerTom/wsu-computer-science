import java.util.HashSet;
import java.util.Set;

/**
 *@author TomRokickiii
 * @version 0.1
 * @param <K> Generic Key
 * @param <V> Generic Value
 */
public class HashMap<K, V> {

    private HashSet<Pair<K, V>> set;

    /**
     * HASSHHHH
     */
    public HashMap() {
        set = new HashSet<>();
    }

    /**
     *
     * @param key value added
     * @param value to be added
     */
    public void put(K key, V value) {
        Pair newPair = new Pair(key, value);
        for (Pair<K, V> p : set) {
            if (p.equals(newPair)) {
                return;
            }
        }
        remove(key);
        set.add(newPair);
    }

    /**
     *
     * @param key searched for
     * @return value of the pair
     */
    public V get(K key) {
        for (Pair<K, V> p : set) {
            if (p.getFirst() == key) {
                return p.getSecond();
            }
        }
        return null;
    }

    /**
     *
     * @param key removed
     * @return a value of the key
     */
    public V remove(K key) {
        for (Pair<K, V> thePair : set) {
            if (thePair.getFirst() == key) {
                V a = thePair.getSecond();
                set.remove(thePair);
                return a;
            }
        }
        return null;
    }

    /**
     *
     * @return s the key set
     */
    public Set<K> keySet() {
        Set<K> s = new HashSet<>();
        for (Pair<K, V> p : set) {
            s.add(p.getFirst());
        }
        return s;
    }

    /**
     *
     * @return size the map size
     */
    public int size() {
        return set.size();
    }
}