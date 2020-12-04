import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Creates a Chart Component Object
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class ChartComponent extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final int GRAPH_FRAME_WIDTH = 600;
    private static final int GRAPH_FRAME_HEIGHT = 500;

    private int bar1;
    private int bar2;
    private int bar3;
    private int bar4;
    private int bar5;

    /**
     * Creates a Chart Component taking in the frequencies for the desired chart
     * type.
     * 
     * @param frequencies
     *            The Array of frequencies for the desired chart.
     */
    public ChartComponent(Frequency[] frequencies) {
        bar1 = (int) Math.round(frequencies[0].getRelative());
        bar2 = (int) Math.round(frequencies[1].getRelative());
        bar3 = (int) Math.round(frequencies[2].getRelative());
        bar4 = (int) Math.round(frequencies[3].getRelative());
        bar5 = (int) Math.round(frequencies[4].getRelative());
        /*
         * System.out.println(frequencies[0].getRelative());
         * System.out.println(frequencies[1].getRelative());
         * System.out.println(frequencies[2].getRelative());
         * System.out.println(frequencies[3].getRelative());
         * System.out.println(frequencies[4].getRelative());
         * System.out.println(bar1); System.out.println(bar2);
         * System.out.println(bar3); System.out.println(bar4);
         * System.out.println(bar5);
         */
    }
    /**
     * Creates the JFrame based on a title and data 
     * stored in the ChartComponent Class.
     * @param title The title for the JFrame.
     */
    public void createFrame(String title) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.setSize(GRAPH_FRAME_WIDTH, GRAPH_FRAME_HEIGHT);
        jframe.setTitle(title);
        jframe.setVisible(true);
        JComponent chart = new Graph();
        jframe.add(chart);
    }

    /**
     * Draws the graph.
     * 
     * @author TomRokickiii
     * @version 0.1
     */
    private class Graph extends JComponent {

        /**
         * Default Constructor for a Graph JComponent.
         */
        public Graph() {
            // No Code needed - this is default.
        }

        /**
         * This method draws the base graph then draws the appropriate data
         * regardless of type of graph.
         * 
         * @param g
         *            Graphics Object.
         */
        public void paintComponent(Graphics g) {
            if (g == null) {
                return;
            }
            // Axis
            g.fillRect(75, 50, 2, 325); // Y-Axis
            g.fillRect(75, 375, 525, 2); // X-Axis
            // Bars
            g.fillRect(75, 100, 525, 2);
            g.fillRect(75, 155, 525, 2);
            g.fillRect(75, 210, 525, 2);
            g.fillRect(75, 265, 525, 2);
            g.fillRect(75, 320, 525, 2);
            // X-Strings
            g.setFont(new Font("TimesRoman", Font.BOLD, 20));
            g.drawString("<=20", 75, 400);
            g.drawString("21-23", 155, 400);
            g.drawString("24-26", 235, 400);
            g.drawString("27-29", 315, 400);
            g.drawString(">=30", 395, 400);
            // Y-Strings
            g.drawString("100", 40, 105);
            g.drawString("80", 40, 160);
            g.drawString("60", 40, 215);
            g.drawString("40", 40, 270);
            g.drawString("20", 40, 325);

            // Paint Graph
            g.fillRect(75, 375 - bar1, 70, bar1);
            g.fillRect(155, 375 - bar2, 70, bar2);
            g.fillRect(235, 375 - bar3, 70, bar3);
            g.fillRect(315, 375 - bar4, 70, bar4);
            g.fillRect(395, 375 - bar5, 70, bar5);
        }

    }
}