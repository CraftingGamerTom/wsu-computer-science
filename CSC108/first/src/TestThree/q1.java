package TestThree;

import java.util.Scanner;

public class q1 {
	public static int someMethod(int x)
	{
	   int result = 0;
	   if (x > 10)
	   {
	      result = x;
	   }
	   else
	   {
	      result = someMethod(4 * x);
	   }
	   return result;
	}
	public static void main(String[] args)
	{
	   System.out.println("someMethod(2) = " + someMethod(2));
	}
}

