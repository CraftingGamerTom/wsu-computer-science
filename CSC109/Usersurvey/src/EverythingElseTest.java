import static org.junit.Assert.*;

import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JFrame;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * This is a test case file
 * @author TomRokickiii
 * @version 0.1
 */
public class EverythingElseTest {

    /**
     * Sets up the bull shit tests.
     * 
     * @throws Exception
     *             which I'm not handling.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        int frameWidth = 500;
        int frameHeight = 250;
        JFrame frame = new Survey();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.setFont(new Font("System", Font.PLAIN, 10));
        Font f = frame.getFont();
        FontMetrics fm = frame.getFontMetrics(f);
        int x = fm.stringWidth("Survey");
        int y = fm.stringWidth("            ");
        int z = frame.getWidth() / 2 - (x / 2);
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        frame.setTitle(pad + "Survey"); // TO-DO: FIX CENTERED

        frame.setVisible(true);
    }

    /**
     * Tests stuff later.
     */
    @Test
    public void testMyPatienceBarChart() {
        Boolean bool = false;
        int bs = 0;
        if (bs == 1.0) {
            bool = true;
        } 
        assertTrue(bool);
    }

}
