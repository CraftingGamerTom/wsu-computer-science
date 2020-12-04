import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests the SubsetGenerator Object.
 * 
 * @version 0.1
 * @author TomRokickiii
 * 
 */
public class SubsetGeneratorTest {
    private static ArrayList<String> test1 = new ArrayList<String>();
    private static ArrayList<String> test2 = new ArrayList<String>();
    private static ArrayList<String> test3 = new ArrayList<String>();

    /**
     * Creates ArrayLists to test against
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // test one Subsets
        test1.add("");
        test1.add("m");
        test1.add("r");
        test1.add("rm");
        test1.add("ru");
        test1.add("rum");
        test1.add("u");
        test1.add("um");
        // test two Subsets
        test2.add("");
        test2.add("b");
        test2.add("bo");
        test2.add("boy");
        test2.add("by");
        test2.add("o");
        test2.add("oy");
        test2.add("y");
        // test three Subsets
        test3.add("");
        test3.add("g");
        test3.add("gi");
        test3.add("gil");
        test3.add("gir");
        test3.add("girl");
        test3.add("gl");
        test3.add("gr");
        test3.add("grl");
        test3.add("i");
        test3.add("il");
        test3.add("ir");
        test3.add("irl");
        test3.add("l");
        test3.add("r");
        test3.add("rl");
    }

    /**
     * Test 1
     */
    @Test
    public void testgetSubsets() {
        SubsetGenerator test = new SubsetGenerator("rum");
        ArrayList<String> l = test.getSubsets();

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
    public void testgetSubsets2() {
        SubsetGenerator test = new SubsetGenerator("boy");
        ArrayList<String> l = test.getSubsets();
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
    public void testgetSubsets3() {
        SubsetGenerator test = new SubsetGenerator("girl");
        ArrayList<String> l = test.getSubsets();
        // System.out.println(l);
        // System.out.println(test3);
        for (int index = 0; index < test3.size(); index++) {
            assertTrue(l.get(index).equals(test3.get(index)));
        }
    }
}