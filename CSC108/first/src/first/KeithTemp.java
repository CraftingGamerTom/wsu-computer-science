package first;

import java.util.Scanner;

public class KeithTemp {
	public static void main (String[] args)
	   {
	      // Define constants
		  double answer;

	      // Your work here

	      // Display prompt for temperature in degrees Farhenheit or Celsius
	      System.out.print("Please enter the temperature in degrees: ");

	      // Read temperature
	      Scanner in = new Scanner(System.in);
	      double temp = in.nextDouble();

	      // Display prompt for character that denotes type of temperature
	      System.out.print("Enter F for Farhenheit or C for Celsius: ");

	      // Read character denoting type of temperature
	      String type = in.next();

	      // Compute and print Celsius or Farhenheit equivalent

	      if  (type.equals("C"))
	      {
	    	  answer = (9.0/5.0) * temp + 32.0;
	    	  System.out.println(answer);
	      }
	      if (type.equals("F"))
	      {
	    	  answer = (5.0/9.0)*(temp -32.0);
	    	  System.out.println(answer);
	      }
	      
	      in.close();

	   }

}
/*
Complete the program below so that it prompts the user for a temperature value, followed by a character that represents the type of temperature:

C for Celsius
F for Farhenheit
If the character represents Fahrenheit temperature (F), convert the temperature value to the equivalent value in Celsius, using the following formula:
C = (5/9)(F - 32.0)
where C represents the Celsius temperature value, and F represents the Farhenheit temperature value.
If the character represents Celsius temperature (C), convert the temperature value to the equivalent value in Farhenheit, using the following formula:

F = (9/5)C + 32.0
with F and C defined the same as above.
Print the converted value.

Complete the following code:

import java.util.Scanner;

/**
   A program that reads in a temperature in degrees that may
      be Fahenheit or may be Celsius.  The second input value
      is the string "F" for Fahrenheit or "C" for Celsius.
      If the string is an "F", the temperature read was
      Farhenheit, which needs to be converted to Celsius.
      If the string is an "C", the temperature read was
      Celsius, which needs to be converted to Fahrenheit.
      The converted temperature is then printed.

public class Temperatures
{
   public static void main (String[] args)
   {
      // Define constants

      // Your work here

      // Display prompt for temperature in degrees Farhenheit or Celsius
      System.out.print("Please enter the temperature in degrees: ");

      // Read temperature
      Scanner in = new Scanner(System.in);
      double temp = in.nextDouble();

      // Display prompt for character that denotes type of temperature
      System.out.print("Enter F for Farhenheit or C for Celsius: ");

      // Read character denoting type of temperature
      String type = in.next();

      // Compute and print Celsius or Farhenheit equivalent

      // Your work here

   }
}

*/