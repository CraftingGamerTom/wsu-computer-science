import java.awt.Rectangle;

public class Square
{
    private int xCord;
    private int yCord;
    private int length;
   /**
      Constructs a square with a given position and side length.
      @param x the x-coordinate of the top left corner
      @param y the y-coordinate of the top left corner
      @parameter sideLength the length of each side
   */   
   public Square(int x, int y, int sideLength)
   {
      xCord = x;
      yCord = y;
      length = sideLength;
   }
   
   /**
      Translates this square the indicated distance,
      to the right along the x coordinate axis, and 
      downward along the y coordinate axis.
      @param dx the distance to move along the x axis
      @param dy the distance to move along the y axis
   */   
   public void translate(int dx, int dy)
   {
      xCord += dx;
      yCord += dy;
   }
   
   /**
      Sets the new side length of this square.
      @param newSideLength the new side length
   */
   public void setSideLength(int newSideLength)
   {
      length = newSideLength;
   }
   
   public String toString()
   {
      String output = "Square[x="+xCord+",y="+yCord+",width="+length+",height="+length+"]";
      return output;
   }
         
   private Rectangle rect;
   
   /**
   Sets the size of this method. Overrides Rectangle.setSize. 
   @param width the new side length
   @param height the new side length 
   (Precondition: width equals height)
*/   
public void setSize(int width, int height)
{
    if (width != height) {
        
        throw new AssertionError();
    }
    else {
        length = width;
    }
   
}

// This method tests your work.

public static Square check(int x, int y, int sideLength, int width, int height) 
{
   Square sq = new Square(x, y, sideLength);
   try
   {
      sq.setSize(width, height);
   }
   catch (AssertionError ex)
   {
   }
   return sq;
}
   /*
   // The following method checks your work.
   
   public static Square check(int x, int y, int sideLength, int dx, int dy, int newSideLength)
   {
      Square sq = new Square(x, y, sideLength);
      sq.translate(dx, dy);
      sq.setSideLength(newSideLength);
      return sq;
   }
   */
}