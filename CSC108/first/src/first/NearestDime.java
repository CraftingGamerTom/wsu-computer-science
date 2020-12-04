package first;

import java.util.Scanner;

public class NearestDime {
	   public static void main(String[] args)
	   {
	      System.out.print("Please enter the price: ");
	      Scanner in = new Scanner(System.in);
	      double price = in.nextDouble();
	      int pennies = (int) Math.round(price * 100);

	      // Determine dollar and cents worth of pennies 
	      int cents = pennies % 100;
	      int dollars = pennies / 100;
    

	      // Round cents to nearest dime
	      int dimes = 0;
	      if (cents % 10 >= 5)
	      {
	    	 dimes = (cents / 10) +1;
	      }
	      if (cents % 10 < 5)
	      {
	    	 dimes = (cents / 10);
	      }
	      
  
	      /*
	       //Testing outputs
	      System.out.println("price " + price);
	      System.out.println("pennies " + pennies);
	      System.out.println("cents " + cents);
	      System.out.println("dollars " + dollars);
	      System.out.println("dimes " + dimes);
	      */
	      
	      
	      // Print revised price
	      double revised = dollars + dimes * 0.1;
	      System.out.printf("%.1f\n", revised);      
	      
	      
	      in.close();
	   }

}

/*
import java.util.Scanner;

/** 
   This program reads a price in dollars and cents,
   rounds the price to the nearest dime,
   and prints out the revised price.

public class NearestDime
{
   public static void main(String[] args)
   {
      System.out.print("Please enter the price: ");
      Scanner in = new Scanner(System.in);
      double price = in.nextDouble();
      int pennies = (int) Math.round(price * 100);

      // Determine dollar and cents worth of pennies 
      int cents;
      int dollars;

      // Your work here     

      // Round cents to nearest dime
      int dimes;

      // Your work here     

      // Print revised price
      double revised = dollars + dimes * 0.1;
      System.out.printf("%.2f\n", revised);      
   }
}
*/