package TestTwo;

import java.util.Scanner;

/**
   A program that reads in an angle between 0 and 359,
      and prints out which quadrant it is in.
   For example, the input of 20 is in quadrant I, and
      similarly, the input of 330 is in quadrant IV.
   Use error validation to print out an error message
      if an input angle is not between 0 and 359 degrees.
*/
public class Quadrants
{
   public static void main (String[] args)
   {
      // Display prompt for degrees of angle
      System.out.println("Please enter the number of degrees of angle: ");

      // Read angle in degrees
      Scanner in = new Scanner(System.in);
      int angle = in.nextInt();
      String Quad = "";
      
      if (angle < 0 || angle > 360)
      {
    	  System.out.println("Error");
      }
      else if (angle < 90 && angle >= 0)
      {
    	  Quad = "I";
      }
      else if (angle < 180)
      {
    	  Quad = "II";
      }
      else if (angle < 270)
      {
    	  Quad = "III";
      }
      else if (angle < 360)
      {
    	  Quad = "IV";
      }
      else if (angle < 0 || angle > 360)
      {
    	  System.out.println("Error");
      }
      else
      {
    	  System.out.println("Error");
      }
      
      System.out.println(Quad);
      
      in.close();

      // Your work here

      // Determine and print out the quadrant for the angle as "I", "II", "III", or
      // "IV", or print the word "Error"

   }
}
