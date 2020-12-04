package TestTwo;

/*
Given a number x, complete the program below named Power that computes the value of xn, where n is an integer. While the value of the double variable x can be positive or negative, the value of the integer n should be non-negative.

Input: x, the value to be raised to the nth power. 
Input: n, the value of the power. 
Output: xn, the value of x raised to the nth power.
*/
import java.util.Scanner;

/**
   Computes x^n (x raised to the nth power). Although the value
   of x can be positive or negative, the value of the integer n
   should be non-negative.

   Input: x, the double value to be raised to the nth power.
   Input: n, the integer value to which x is to be raised.
   Output: x^n -- the value of x raised to the nth power.
*/
public class Power
{
   public static void main(String[] args)
   {
      // Read value for n
      Scanner in = new Scanner(System.in);
      double x = in.nextDouble();
      int n = in.nextInt();

      double answer = Math.pow(x, n);
      System.out.println(answer);


   }
}