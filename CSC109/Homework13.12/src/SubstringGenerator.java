import java.util.ArrayList;

/**
 * @version 0.1
 * @author TomRokickiii A SubstringGenerator Object stores a string and can
 *         prove the substrings of the string.
 */
public class SubstringGenerator {

    private String s;

    /**
     * Creates a SubstringGenerator Object.
     * 
     * @param s
     *            the string to store
     */
    public SubstringGenerator(String s) {
        this.s = s;
    }

    /**
     * Gets the substring of the SubstringGenerator string object.
     * 
     * @return n The ArrayList of substrings
     */
    public ArrayList<String> getSubstrings() {
        // add this string
        // add loop of substrings, making string bigger
        ArrayList<String> l = new ArrayList<String>();

        // if cannot split, get out
        if ((this.s == null) || (this.s.length() == 0)) {
            return l;
        }

        // add whole string
        l.add(this.s);
        // System.out.println(this.s);

        // add sub strings
        for (int i = 1; i < this.s.length(); i++) {
            String end = this.s.substring(0, i);
            l.add(end);
            // System.out.println(end);
        }

        // if it can be reduced from front, find substrings of that
        if (this.s.length() > 1) {
            String end = this.s.substring(1);
            SubstringGenerator e = new SubstringGenerator(end);
            ArrayList<String> el = e.getSubstrings();
            l.addAll(el);
        } 
        else {
            // cannot be reduced further, add the empty string
            l.add("");
            // System.out.println("0");
        }

        // sort list
        java.util.Collections.sort(l);
        
        return l;
    }
}
