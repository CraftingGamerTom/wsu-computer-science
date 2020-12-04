import java.awt.Color;
import java.awt.Graphics2D;

/**
   A class that draw the Olympic rings.
*/
public class Ring
{
   private int X_CORD;
   private int Y_CORD;
   private int RADIUS;
   private Color COLOR;
   /**
      Constructs a circle that represents the Olympic rings.
      @param anX the x coordinate
      @param aY the y coordinate
      @param aRadius the radius of the circle
      @param aColor the color of the ring
   */
   public Ring(int anX, int aY, int aRadius, Color aColor)
   {
      X_CORD = anX;
      Y_CORD = aY;
      RADIUS = aRadius;
      COLOR = aColor;
   }

   /**
      Draws the ring.
      @param g2 the graphic context
   */
   public void draw(Graphics2D g2)
   {
      g2.setColor(COLOR);
      g2.drawOval(X_CORD, Y_CORD, RADIUS, RADIUS);
   }
}