package ballbreaker;

import java.awt.Rectangle;

public class Square extends Rectangle
{
    private int x;
    private int y;
    private int sideLength;
   /**
      Constructs a square with a given position and side length.
      @param x the x-coordinate of the top left corner
      @param y the y-coordinate of the top left corner
      @parameter sideLength the length of each side
   */   
   public Square(int x, int y, int sideLength)
   {
       this.x = x;
       this.y = y;
       this.sideLength = sideLength;
   }
   
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
           sideLength = width;
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
}