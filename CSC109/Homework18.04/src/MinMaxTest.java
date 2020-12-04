import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case class
 * 
 * @author TomRokickiii
 * @version 0.1
 */
public class MinMaxTest {

    /**
     * The test case
     */
    @Test
    public void test() {
        Coin[] coins = { new Coin(0.1, "Dime"), new Coin(0.05, "Nickel"),
            new Coin(0.01, "Penny"), new Coin(0.25, "Quarter") };

        PairUtil t = new PairUtil();
        t.hashCode();
        Pair<Coin, Coin> mm = PairUtil.minmax(coins);
        System.out.println(mm.getFirst());
        System.out.println("Expected: Coin[value=0.01,name=Penny]");
        System.out.println(mm.getSecond());
        System.out.println("Expected: Coin[value=0.25,name=Quarter]");

        String first = mm.getFirst().toString();
        String second = mm.getSecond().toString();

        assertTrue(first.equals("Coin[value=0.01,name=Penny]"));
        assertTrue(second.equals("Coin[value=0.25,name=Quarter]"));
    }

}
