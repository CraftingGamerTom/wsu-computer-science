import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * @version 0.1
 * @author TomRokickiii
 * SameHashCode Class blah blah blah.
 */
public class SameHashCode {
    /**
     * this is everything. this is big.
     * @param filename the file name to search
     * @return wordMap the map and hash codes of all the strings
     * @throws FileNotFoundException
     */
    public Map<Integer, HashSet<String>> sameHash(String filename)
        throws FileNotFoundException {
        /*
         * Scanner in = new Scanner(System.in);
         * System.out.println("Enter file name: "); String filename =
         * in.nextLine();
         */
        File reader = new File(filename);
        Scanner fileIn = new Scanner(reader);

        Map<Integer, HashSet<String>> wordMap 
            = new HashMap<Integer, HashSet<String>>();

        /*
         * Read words from file and add them to wordMap
         */
        while (fileIn.hasNext()) {
            // collect all hashcodes and remove duplicates
            // search for each hashcode and add the 
            //strings will the same has
            // code to a hashset
            // Contains key suggestion.
            String n = fileIn.nextLine();
            int h = n.hashCode();

            if (!wordMap.containsKey(h)) {
                // add something to the map with that hashcode 
                //and add the word.
                HashSet<String> hSet = new HashSet<String>();
                hSet.add(n);
                wordMap.put(h, hSet);
            }
            else {
                // find that hashcode in the map and add 
                //the word to the set
                HashSet<String> hSet = wordMap.get(h);
                hSet.add(n);

            }

        }

        fileIn.close();

        /*
         * Now iterate through all keys and print the 
         * sets whose size > 1.
         */
        for (int hashCode : wordMap.keySet()) {
            Set<String> wordList = wordMap.get(hashCode);
            if (wordList.size() > 1) {
                System.out.println(wordList);
            }
        }
        return wordMap;
    }

}