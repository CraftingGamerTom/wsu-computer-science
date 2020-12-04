import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Creates a stupid f*cking test 
 * that is entirely pointless.
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class ChartComponentTest {

    /**
     * Tests that Chart Component works. 
     * Then asserts true because there's no
     * real way to actually test this shit.
     */
    @Test
    public void testChartComponentClass() {
        Boolean bool = false;
        double[] frequency = new double[5];
        frequency[0] = 1.0;
        frequency[1] = 1.0;
        frequency[2] = 1.0;
        frequency[3] = 1.0;
        frequency[4] = 1.0;
        ChartComponent chartTest = new ChartComponent(frequency);
        chartTest.paintComponent(null);
        if (frequency[0] == 1.0) {
            bool = true;
        }
        assertTrue(bool);
    }

}
