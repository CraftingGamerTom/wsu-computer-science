import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii
 * Tests Grid
 */
public class GridTest {

    /**
     * This is my test
     */
    @Test
    public void testFloodfill() {
        Grid gr = new Grid();
        gr.floodfill(3, 4);
        String[] rows = gr.toString().split("\n");
        assertEquals(" 46 31 18  8  2  7 17 30 45 61", rows[2]);
        assertEquals(" 40 25 13  5  1  3  9 19 32 47", rows[3]);
        assertEquals(" 56 39 24 12  4 10 20 33 48 62", rows[4]);
    }

}
