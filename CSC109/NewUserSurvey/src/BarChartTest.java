
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests BarChart
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class BarChartTest {
    /**
     * Test of hasWorkFrequency method, of class BarChart.
     */
    @Test
    public void testHasWorkFrequency() {
        System.out.println("hasWorkFrequency");
        String filename = "studentsurvey.csv";
        BarChart instance = new BarChart();
        Frequency[] expResult = new Frequency[5];
        expResult[0] = new Frequency("<=20", 4, 7, 57.142857142);
        expResult[1] = new Frequency("21-23", 3, 6, 50.0);
        expResult[2] = new Frequency("24-26", 1, 1, 100.0);
        expResult[3] = new Frequency("27-29", 3, 3, 100.0);
        expResult[4] = new Frequency(">=30", 11, 13, 84.61538461538461);
        Frequency[] result = instance.hasWorkFrequency(filename);
        instance.printArray(result);
        for (int i = 0; i < 5; i++) {
            assertEquals(result[i].getxLabel(), expResult[i].getxLabel());
            assertEquals(result[i].getCount(), expResult[i].getCount());
            assertEquals(result[i].getTotal(), expResult[i].getTotal());
            assertEquals(result[i].getRelative(), 
                    expResult[i].getRelative(), 0.00001);
        }

    }
    /**
     * Test of hasWorkFrequency method, of class BarChart.
     */
    @Test
    public void testHasKidsFrequency() {
        System.out.println("hasKidsFrequency");
        String filename = "studentsurvey.csv";
        BarChart instance = new BarChart();
        Frequency[] expResult = new Frequency[5];
        expResult[0] = new Frequency("<=20", 2, 7, 28.571428571);
        expResult[1] = new Frequency("21-23", 1, 6, 16.666666666);
        expResult[2] = new Frequency("24-26", 1, 1, 100.0);
        expResult[3] = new Frequency("27-29", 2, 3, 66.666666667);
        expResult[4] = new Frequency(">=30", 10, 13, 76.923076923);
        Frequency[] result = instance.hasKidsFrequency(filename);
        instance.printArray(result);
        for (int i = 0; i < 5; i++) {
            assertEquals(result[i].getxLabel(), expResult[i].getxLabel());
            assertEquals(result[i].getCount(), expResult[i].getCount());
            assertEquals(result[i].getTotal(), expResult[i].getTotal());
            assertEquals(result[i].getRelative(), 
                    expResult[i].getRelative(), 0.00001);
        }

    }
    /**
     * Test of hasWorkFrequency method, of class BarChart.
     */
    @Test
    public void testHasPCFrequency() {
        System.out.println("hasPCFrequency");
        String filename = "studentsurvey.csv";
        BarChart instance = new BarChart();
        Frequency[] expResult = new Frequency[5];
        expResult[0] = new Frequency("<=20", 6, 7, 85.714285714);
        expResult[1] = new Frequency("21-23", 6, 6, 100.0);
        expResult[2] = new Frequency("24-26", 1, 1, 100.0);
        expResult[3] = new Frequency("27-29", 3, 3, 100.0);
        expResult[4] = new Frequency(">=30", 6, 13, 46.153846153);
        Frequency[] result = instance.hasPCFrequency(filename);
        instance.printArray(result);
        for (int i = 0; i < 5; i++) {
            assertEquals(result[i].getxLabel(), expResult[i].getxLabel());
            assertEquals(result[i].getCount(), expResult[i].getCount());
            assertEquals(result[i].getTotal(), expResult[i].getTotal());
            assertEquals(result[i].getRelative(), 
                    expResult[i].getRelative(), 0.00001);
        }

    }
    /**
     * Tests if the methods return null if no file was found.
     */
    @Test
    public void testAllFileNotFoundExceptions() {
        System.out.println("AllFileNotFoundExceptions");
        String filename = "nobodyCallsFilesThis.csv";
        BarChart instance = new BarChart();
        
        Frequency[] result = instance.hasWorkFrequency(filename);
        assertNull(result);
        result = instance.hasKidsFrequency(filename);
        assertNull(result);
        result = instance.hasPCFrequency(filename);
        assertNull(result);

    }

}
