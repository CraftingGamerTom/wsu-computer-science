import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

/**
   Draws the olympic rings.
 */
@SuppressWarnings("serial")
public class OlympicRingComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      Ring blueRing = new Ring(0, 0, 78, Color.BLUE);
      Ring blackRing = new Ring(60, 0, 78, Color.BLACK);
      Ring redRing = new Ring(120, 0, 78, Color.RED);
      Ring yellowRing = new Ring(30, 65, 78, Color.YELLOW);
      Ring greenRing = new Ring(90, 65, 78, Color.GREEN);
      
      blueRing.draw(g2);
      blackRing.draw(g2);
      redRing.draw(g2);
      yellowRing.draw(g2);
      greenRing.draw(g2);
   }
}