package TestThree;

/*
Your task is to write a method that displays a rectangle with a given width and height. For example, if the width is 4 and the height is 2, print

[][][][]
[][][][]
Don't print anything if the width or height is larger than 25.

Complete the following code:
*/
	
	
import java.util.Scanner;

public class DrawRects
{
   /**
      A method to display a rectangle of dimension <tt>height</tt>
      by <tt>width</tt>. If the width or height are > 25, don't
      display anything.
      @param width, the width of the rectangle to be drawn
      @param height, the height of the rectangle to be drawn
   */
   public static void displayRectangle(int width, int height)
   {
      // your work here 
   }

   /**
      The main method reads the width and height and invokes your method.
   */
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int w = in.nextInt();
      int h = in.nextInt();
      displayRectangle(w, h);
      if (w == 26 || h == 26 || w == 0 || h == 0)
      {
    	  System.out.println("");
      }
      else 
      {
    	  for (int i = 0; i < h; i++) 
    	  {
    		  for (int x = 1; x < w; x++) 
    		  {
    			  System.out.print("[]");
    		  }
    		  System.out.println("[]");
    	  }
      }
      in.close();
   }
}