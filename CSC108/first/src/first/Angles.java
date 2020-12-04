package first;

import java.util.Scanner;

/**
   A program that reads in an angle of any size (positive or negative),
   normalizes it, and prints it out.
   For example, the input of 380 should print 20,
   and the input of -30 should return 330.
   All variables should be of type int. 
*/
public class Angles
{
   public static void main (String[] args)
   {
      // Display prompt for degrees of angle
      System.out.print("Please enter the number of degrees of angle: ");

      // Read angle in degrees
      Scanner in = new Scanner(System.in);
      int angle = in.nextInt();
      int normalized = 0;
      
      
      if (angle > 0)
      {
    	  normalized = angle % 360;
      }
      if (angle < 0)
      {
    	  normalized = 360 - Math.abs(angle%360);
      }

      // Compute normalized value of angle

      // Your work here


      // Print out the normalized value of the angle 
      System.out.println(normalized);
      
      in.close();
   }
}