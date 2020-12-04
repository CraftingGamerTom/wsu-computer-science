
/**
   A program that reads in a temperature in degrees Fahenheit
      and converts it to the equivalent temperature in Celsius
      and also the equivalent temperature in Kelvin.
   For example, if the input is F = 68.0 degrees Fahrenheit,
      then the conversions should show that C = 20.0 degrees Celsius
      and K = 293.0 degrees Kelvin.
public class ConvertTemp
{
   public static void main (String[] args)
   {
      // Define constants

      // Your work here

      // Display prompt for temperature in degrees Farhenheit
      System.out.print("Please enter the temperature ");
      System.out.print("in degrees Farhenheit: ");

      // Read Fahrenheit temperature
      Scanner in = new Scanner(System.in);
      double fahrenheit = in.nextDouble();

      // Compute Celsius and Kelvin equivalents

      // Your work here

      // Print out equivalents
      System.out.println(celsius);
      System.out.println(kelvin);
   }
}
*/
package first;

import java.util.Scanner;

public class ConvertTemp {
	public static void main(String[] arguments){
		
		System.out.print("Please enter the temperature ");
	    System.out.print("in degrees Farhenheit: ");
	    
	    Scanner in = new Scanner(System.in);
	    double fahrenheit = in.nextDouble();
	    
	    double celsius = (5.0/9.0)*(fahrenheit-32.0);
	    double kelvin = celsius + 273.0;
	    
	    System.out.println(celsius);
	    System.out.println(kelvin);
	    
	    in.close();
	}

}
