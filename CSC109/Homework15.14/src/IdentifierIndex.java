import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Complete the following class in your solution:

/**
 * @version 0.1
 * @author TomRokickiii A class to read in a 
 *          Java source file and produce an
 *         index of all identifiers in the file.
 */
public class IdentifierIndex {
    private HashMap<Integer, TreeSet<String>> allIdentifiers 
        = new HashMap<Integer, TreeSet<String>>();

    /**
     * Reads all identifiers from the given file
     * 
     * @param filename
     *            the file name
     */
    public void read(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner in2 = new Scanner(file);
        int i = 1;

        while (in2.hasNextLine()) {

            Scanner in = new Scanner(in2.nextLine());
            in.useDelimiter("[^A-Za-z0-9_]+");
            TreeSet<String> identifiers = new TreeSet<String>();
            while (in.hasNext()) {

                String inn = in.next();
                //System.out.println(i + "   " + inn);
                identifiers.add(inn);
                allIdentifiers.put(i, identifiers);
            }
            in.close();
            i++;
        }
        in2.close();
    }

    /**
     * A set of all identifiers that occur in the file, in sorted order.
     * @return ids the Id's stored in a TreeSet.
     */
    public Set<String> getIdentifiers() {
        Set<String> ids = new TreeSet<String>();
        for (int hashCode : allIdentifiers.keySet()) {
            Set<String> wordList = allIdentifiers.get(hashCode);
            ids.addAll(wordList);
        }
        return ids;
    }

    /**
     * Gets all line numbers on which the given identifier occurs.
     * 
     * @param identifier
     *            an identifier
     * @return all line numbers on which the identifier was found, in 
     * increasing order; an empty set (not null) if the identifier 
     * was never found
     */
    public Set<Integer> getLines(String identifier) {
        Set<Integer> ids = new TreeSet<Integer>();
        for (int hashCode : allIdentifiers.keySet()) {
            TreeSet<String> wordList = allIdentifiers.get(hashCode);
            //System.out.println(wordList);
            if (wordList.contains(identifier)) {
                ids.add(hashCode);
            }
        }
        return ids;
    }
}