package first;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args)
	   {
	      // Print prompt to enter three integer values
	      System.out.print("Please enter three integer values: ");

	      // Read in the three integer values
	      Scanner in = new Scanner(System.in);
	      int value1 = in.nextInt();
	      int value2 = in.nextInt();
	      int value3 = in.nextInt();
	      
	      
	      
	      int answer = compute(value1, value2, value3);
	      System.out.println(answer);
	      
	      in.close();

	      //It would make more sense to create an array of ints
	   }
	public static int compute(int value1, int value2, int value3)
	{
		int pt1 = 0;
	    int pt2 = 0;
	      
	    if (value1 > value2)
	    {
	      pt1 = value2;
	    }
	    else if (value1 <= value2)
	    {
	      pt1 = value1;
	     
	    }
	    
	    if (pt1 > value3)
	    {
	   	  pt2 = value3;
	    }
	    if (pt1 <= value3)
	    {
	   	  pt2 = pt1;
	    }
	    
	    return pt2;
	}
}

/*
Complete the program below so that it prompts for and reads in three integer values, and then prints out the smallest of the three.

For example, one sample run of this program looks like the following:

Please enter three integer values: 66 22 34
Smallest: 22 
Complete the following code:

import java.util.Scanner;

/** 
   This program reads three integer values
   and prints out the smallest of the three.
   If the values are equal, print out only one of them.

public class Smallest
{
   public static void main(String[] args)
   {
      // Print prompt to enter three integer values
      System.out.print("Please enter three integer values: ");

      // Read in the three integer values
      Scanner in = new Scanner(System.in);
      int value1 = in.nextInt();
      int value2 = in.nextInt();
      int value3 = in.nextInt();

      // Determine and print out the smallest value
   }
}
*/