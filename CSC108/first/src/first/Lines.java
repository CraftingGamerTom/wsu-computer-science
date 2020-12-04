package first;

import java.util.Scanner;

public class Lines {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double x1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y1 = in.nextDouble();
		double y2 = in.nextDouble();
		
		double xMinus = x1 - x2;
		double xTotal = xMinus * xMinus;
		double yMinus = y1 - y2;
		double yTotal = yMinus * yMinus;
		double lengthSquared = xTotal + yTotal;
		double length = Math.sqrt(lengthSquared);
		
		System.out.println(length);
		
		in.close();
	}
}

/**
import java.util.Scanner;

   This program reads in four double variables, x1, y1, x2, and y2,
   which represent the end points of a line segments, namely,
      x1 is the x-coordinate of the starting point,
      y1 is the y-coordinate of the starting point,
      x2 is the x-coordinate of the ending point, and
      y2 is the y-coordinate of the ending point.
   The length of the line segment joining (x1, y1) and (x2, y2)
   is computed using the Pythagorean theorem.

public class Lines
{
   public static void main (String[] args)
   {
      // Read coordinates
      Scanner in = new Scanner(System.in);
      double x1 = in.nextDouble();
      double y1 = in.nextDouble();
      double x2 = in.nextDouble();
      double y2 = in.nextDouble();

      // Compute and print out the length of the line segment

      // Your work here

      ...
      
      System.out.println(length);
   }
}
*/