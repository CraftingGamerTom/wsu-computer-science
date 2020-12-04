package HomeworkFive;

import java.util.Scanner;

/*
3! = 3 × 2! 
= 3 × 2 × 1!
= 3 × 2 × 1
= 3 × 2
= 6
By convention, 0! is 1.

Complete the following code:
*/
	
public class ComputeFact
{
/**
  A method to compute n factorial (n!) recursively
  @param n a number >= 0
  @return the value of n!
*/
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	
	System.out.println(factorial(n));
	
	in.close();
	}

public static int factorial(int n)
{
	int hold1 = n;

	if (n == 0 || n == 1)
	{
		hold1 = 1;
	}
	else 
	{
		do
		{	  
			hold1 = hold1 * (n - 1);
			n--;
		}	
		while(n > 1);
	}
  
  return hold1;
}
}