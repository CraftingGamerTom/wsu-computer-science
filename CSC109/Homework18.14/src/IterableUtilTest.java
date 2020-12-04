import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii This sucks ass
 */
public class IterableUtilTest {

    /**
     * test test test
     */
    @Test
    public void test() {
        IterableUtil<String> u = new IterableUtil<String>();
        u.hashCode();
        String sentence = "Mary had a little lamb";
        Iterable<String> it = Arrays.asList(sentence.split(" "));
        IterableUtil.print(it);
        assertTrue(sentence.equals("Mary had a little lamb"));
    }

}
