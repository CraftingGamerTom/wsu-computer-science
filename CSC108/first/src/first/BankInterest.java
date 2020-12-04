package first;

import java.util.Scanner;

public class BankInterest {
	public static void main(String[] args)
	   {
	      // Define constants
	      final double HI_RATE = 2.75;
	      final double MD_RATE = 2.00;
	      final double LO_RATE = 1.00;
	      final double ZERO_RATE = 0.00;
	      final double DEB_CHG = -25.00;

	      final double HI_LIMIT = 100000.00;
	      final double MD_LIMIT = 25000.00;
	      final double LO_LIMIT = 10000.00;
	      final double ZERO_LIMIT = 0.00;

	      // Print prompt to enter a current balence
	      System.out.print("Enter current balance: ");

	      // Read balance
	      Scanner in = new Scanner(System.in);
	      double balance = in.nextDouble();
	      in.close();
	      double newBalance = 0;

	      // Determine interest rate (or charge) based on current balance
	      //   to compute new balance

	      if (balance > HI_LIMIT)
	      {
	    	  newBalance = balance + (balance * (HI_RATE/100));
	      } 
	      else if (balance > MD_LIMIT)
	      {
	    	  newBalance = balance + (balance * (MD_RATE/100));
	      }
	      else if (balance > LO_LIMIT)
	      {
	    	  newBalance = balance + (balance * (LO_RATE/100));
	      }
	      else if (balance >= ZERO_LIMIT)
	      {
	    	  newBalance = balance + ZERO_RATE;
	      }
	      else if (balance < ZERO_LIMIT)
	      {
	    	  newBalance = balance + DEB_CHG;
	      }
			

	      System.out.printf("%.2f\n", newBalance);
	   }
}

/*
Complete the program below so the it prompts for and reads in the balance of a member's account. Determine and apply the interest due the account, printing out the new balance. If the balance is less than $0.00, add the penalty to that balance and print it out.

Complete the following code:

import java.util.Scanner;

/** 
   This program updates an account balance, according to the table below:
         Balance      Interest Rate    Charge  
     > $100,000.00	 2.75 %	       $ 0.00
     > $25,000.00	 2.00 %	       $ 0.00
     > $10,000.00	 1.00 %	       $ 0.00
    >= $0.00	         0.00 %	       $ 0.00
     < $0.00	         0.00 %	      $ 25.00
   and prints out the new balance.

public class BankInterest
{
   public static void main(String[] args)
   {
      // Define constants
      final double HI_RATE = 2.75;
      final double MD_RATE = 2.00;
      final double LO_RATE = 1.00;
      final double ZERO_RATE = 0.00;
      final double DEB_CHG = -25.00;

      final double HI_LIMIT = 100000.00;
      final double MD_LIMIT = 25000.00;
      final double LO_LIMIT = 10000.00;
      final double ZERO_LIMIT = 0.00;

      // Print prompt to enter a current balence
      System.out.print("Enter current balance: ");

      // Read balance
      Scanner in = new Scanner(System.in);
      double balance = in.nextDouble();

      // Determine interest rate (or charge) based on current balance
      //   to compute new balance

      // Your work here

      System.out.printf("%.2f\n", newBalance);
   }
}
*/