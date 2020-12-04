import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the Identifier Index Class
 */
public class IdentifierIndexTest {

    /**
     * This is a test method for the IdentifierIndex class.
     */
    @Test
    public void test() {
        IdentifierIndex index = new IdentifierIndex();
        try {
            index.read("indexTest"); // reads this file
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("FILE NOT FOUND");
        }
        Set<String> idents = index.getIdentifiers();
        String last = "";
        for (String s : idents) {
            last = s;
        }

        assertTrue(last.equals("void"));
        Set<Integer> lines = index.getLines("void");
        assertTrue(lines.toString().equals("[10]"));
        Set<Integer> lineValues = new TreeSet<Integer>();
        lineValues = index.getLines("f" + "oo");
        assertTrue(lineValues.toString().equals("[]"));
    }

}
