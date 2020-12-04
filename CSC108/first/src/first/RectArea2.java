package first;

import java.util.Scanner;

public class RectArea2 {
	public static void main(String[] arguments){

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the width of the rectagle: ");
		double width = in.nextDouble();
//		System.out.println("Width set to: " + width);
		System.out.println("Please enter the height of the rectagle: ");
		double height = in.nextDouble();
//		System.out.println("Height set to: " + height);
		
		/*	
		for (int i = 0; i < height; i++){
				
			for (int j = 0; j < width; j++){
				System.out.print("X");
			}
			System.out.println();
		}
		*/
		double area = width * height;
		System.out.println("Area of the rectangle is: " + area);
		
		
		in.close();
	}
	
}

/* 
 * import java.util.Scanner;


   A program that prompts for the height and width of a rectangle
   and prints the area of that rectangle.  
   All variables should be of type double.

public class RectArea2
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      // Display prompt for rectangle width
      System.out.print("Please enter the width of the rectangle: ");

      // Read height of rectangle
      double width = ...;

      // Display prompt for rectangle height
      System.out.print("Please enter the height of the rectangle: ");

      // Read height of rectangle
      
      ...

      // Compute and print result
      
      ...

   }
}
Show Work is not available for this question
 */