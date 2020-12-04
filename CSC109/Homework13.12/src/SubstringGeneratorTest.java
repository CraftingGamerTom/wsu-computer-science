import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii Tests the SubstringGenerator Object. Currently no assert
 *         methods.
 */
public class SubstringGeneratorTest {
    private static ArrayList<String> test1 = new ArrayList<String>();
    private static ArrayList<String> test2 = new ArrayList<String>();
    private static ArrayList<String> test3 = new ArrayList<String>();

    /**
     * Creates ArrayLists to test against
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // test one substrings
        test1.add("");
        test1.add("m");
        test1.add("r");
        test1.add("ru");
        test1.add("rum");
        test1.add("u");
        test1.add("um");
        // test two substrings
        test2.add("");
        test2.add("a");
        test2.add("ap");
        test2.add("ape");
        test2.add("aper");
        test2.add("e");
        test2.add("er");
        test2.add("p");
        test2.add("p"); // -
        test2.add("pa");
        test2.add("pap");
        test2.add("pape");
        test2.add("paper");
        test2.add("pe");
        test2.add("per");
        test2.add("r");
        // test three substrings
        test3.add("");
        test3.add("c");
        test3.add("co");
        test3.add("cof");
        test3.add("coff");
        test3.add("coffe");
        test3.add("coffee");
        test3.add("e");
        test3.add("e"); //-
        test3.add("ee");
        test3.add("f");
        test3.add("f"); //-
        test3.add("fe");
        test3.add("fee");
        test3.add("ff");
        test3.add("ffe");
        test3.add("ffee");
        test3.add("o");
        test3.add("of");
        test3.add("off");
        test3.add("offe");
        test3.add("offee");
    }

    /**
     * Test 1
     */
    @Test
    public void testgetSubstrings() {
        SubstringGenerator test = new SubstringGenerator("rum");
        ArrayList<String> l = test.getSubstrings();

        // System.out.println(l);
        // System.out.println(test1);
        for (int index = 0; index < test1.size(); index++) {
            assertTrue(l.get(index).equals(test1.get(index)));
        }

    }

    /**
     * Test 2
     */
    @Test
    public void testgetSubstrings2() {
        SubstringGenerator test = new SubstringGenerator("paper");
        ArrayList<String> l = test.getSubstrings();
        // System.out.println(l);
        // System.out.println(test2);
        for (int index = 0; index < test2.size(); index++) {
            assertTrue(l.get(index).equals(test2.get(index)));
        }
    }

    /**
     * Test 3
     */
    @Test
    public void testgetSubstrings3() {
        SubstringGenerator test = new SubstringGenerator("coffee");
        ArrayList<String> l = test.getSubstrings();
        // System.out.println(l);
        // System.out.println(test3);
        for (int index = 0; index < test3.size(); index++) {
            assertTrue(l.get(index).equals(test3.get(index)));
        }
    }
}