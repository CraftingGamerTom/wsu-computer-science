package TestTwo;

/*
Complete the program below named CountSevens so that it reads in an integer value, counts the number of digits in that number that have the value 7, and prints out the final count. For example, the integer value, 57687728, would have 3 digits with the value 7.

Hint: you might consider using integer division or the modulus operator to separate out each digit of n.

import java.util.Scanner;


   Counts the number of digits with value 7 in the decimal 
   representation of the integer n
*/
import java.util.Scanner;

public class CountSevens
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int input = in.nextInt();
      int count = 0;
      
      
      while (input != 0)
      {
    	 int track = input;
    	 input /= 10;
    	 input *= 10;
    	 
    	 if (track - input == 7)
    	 {
    		 count++;
    	 }
    	 input /= 10;

      }
      
      System.out.println(count);

      in.close();


   }
}