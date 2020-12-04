package first;

import java.util.Scanner;

public class Coins {
	 public static void main(String[] args)
	   {
	      // Define constants
	      final String P_TYPE = "P";
	      final String N_TYPE = "N";
	      final String D_TYPE = "D";
	      final String Q_TYPE = "Q";
	      
	      double answer = 0;

	      // Read a number and type of coin 
	      System.out.println("Enter number and type of coins: ");

	      Scanner in = new Scanner(System.in);
	      int numCoins = in.nextInt();
	      String typCoin = in.next();
	      
	      if (typCoin.equals(P_TYPE))
	      {
	    	  answer = numCoins * 0.01;
	      }
	      if (typCoin.equals(N_TYPE))
	      {
	    	  answer = numCoins * 0.05;
	      }
	      if (typCoin.equals(D_TYPE))
	      {
	    	  answer = numCoins * 0.10;
	      }
	      if (typCoin.equals(Q_TYPE))
	      {
	    	  answer = numCoins * 0.25;
	      }
	      if (!typCoin.equals(P_TYPE) && !typCoin.equals(N_TYPE) && !typCoin.equals(D_TYPE) && !typCoin.equals(Q_TYPE))
	      {
	    	  System.out.println("Error");
	      }
	      else 
	      {
	    	  System.out.printf("$%.2f\n", answer);
	      }

	      // Determine and print worth of coin pile

	      in.close();

	      
	   }

}
/*
Suppose you have a lot of change in your pocket. You pull it all out and separate the coins into different piles: one for all the pennies, one for nickels, one for dimes, and one for quarters. Then you determine the worth of each pile.

Complete the program below, so the it prompts for and reads in the number of coins in one of the piles, as well as a String containing a single letter to indicate the type of coin in that pile: "P" for pennies, "N" for nickels, "D" for dimes, and "Q" for quarters. The program then computes the value of that pile of coins and prints it out.

P : one penny is worth one cent,
N : one nickel is worth five cents,
D : one dime is worth ten cents, and
Q : one quarter is worth twenty-five cents.
Hence, for example, if the input is 17 followed by the letter 'N', then there are seventeen nickels, worth eighty-five cents. This example would produce the output 0.85.

Your program should also include input validation, printing the word "Error" if the coin type is not valid.

Complete the following code:

import java.util.Scanner;

/** 
   This program reads a student's final class average,
   and prints out the appropriate letter grade..

public class Coins
{
   public static void main(String[] args)
   {
      // Define constants
      final String P_TYPE = "P";
      final String N_TYPE = "N";
      final String D_TYPE = "D";
      final String Q_TYPE = "Q";

      // Read a number and type of coin 
      System.out.println("Enter number and type of coins: ");

      Scanner in = new Scanner(System.in);
      int numCoins = in.nextInt();
      String typCoin = in.next();

      // Determine and print worth of coin pile

      // Your work here

      System.out.printf("$%.2f\n", value);
   }
}
*/