import java.util.ArrayList;
import java.util.Collections;

/**
 * A SubsetGenerator Object. This object holds a string. The user can call a
 * method to have an ArrayList of Strings containing the objects stored string's
 * subsets.
 * 
 * @version 0.1
 * @author TomRokickiii
 * 
 */
public class SubsetGenerator {

    private String inputString;

    /**
     * Method called to create a new SubsetGenerator Object.
     * 
     * @param input
     *            A String to be stored by the object.
     */
    public SubsetGenerator(String input) {
        inputString = input;
    }

    /**
     * Recursive method to find all subsets of a string.
     *
     * @return outputList A ArrayList of strings. Each String is a subset of the
     *         original string.
     */
    public ArrayList<String> getSubsets() {
        ArrayList<String> outputList = new ArrayList<String>();
        if (inputString.length() == 0) {
            outputList.add(inputString);
            return outputList;
        }

        // Creates a substring for the second half of the String.
        String nextSubstring = inputString.substring(1);

        /*
         * Creates a new SubsetGenerator Object for that substring to break it
         * down further.
         */
        SubsetGenerator nextSubsetGen = new SubsetGenerator(nextSubstring);
        ArrayList<String> nextSubset = nextSubsetGen.getSubsets();

        // After the recursive method returns, merge the ArrayLists.
        outputList.addAll(nextSubset);

        for (String s : nextSubset) {
            outputList.add(inputString.charAt(0) + s);
        }

        Collections.sort(outputList);
        return outputList;
    }
}