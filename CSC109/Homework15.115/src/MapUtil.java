
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @version 0.1
 * @author TomRokickiii MapUtil will create a Map to Hao Loi's liking. :D
 */
public class MapUtil {
    /**
     * Make a sorted map whose keys are the word lengths words and whose values
     * are the sets of the words with the given lengths. The map and sets should
     * be sorted.
     * 
     * @param words
     *            an array of strings
     * @return a map mapping strings to their lengths
     */
    public Map<Integer, TreeSet<String>> makeMap(String[] words) {
        // map integer, list of strings

        // Make a Map
        // Keys will be the words
        // Values are sets of the words with given lengths
        // map and sets need to be sorted
        Map<Integer, TreeSet<String>> storedWords;
        storedWords = new TreeMap<Integer, TreeSet<String>>();
        ArrayList<Integer> lengths = new ArrayList<Integer>();

        /*
         * Go through all the words and gather the lengths. this will only add a
         * length once.
         */
        for (String word : words) {
            boolean isNew = true;
            int length = word.length();
            for (Integer n : lengths) {
                if (length == n) {
                    isNew = false;
                }
            }
            if (isNew) {
                lengths.add(length);
            }
        }
        /*
         * Go through all the stored lengths, if a word in the array is the same
         * length, add it to the TreeSet for that length. After finishing with
         * all the words of a specific length, add them to the Map with their
         * length
         */
        for (Integer length : lengths) {
            TreeSet<String> strings = new TreeSet<String>();
            for (String word : words) {
                if (word.length() == length) {
                    strings.add(word);
                }
            }
            // Need to sort the strings first?
            storedWords.put(length, strings);
        }
        // Need to sort the storedWords first?
        return storedWords;
    }
}