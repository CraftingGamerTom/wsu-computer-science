package first;

import java.util.Scanner;
/**
Computes a sum of odd integers between two bounds. 
Input: a, the lower bound (may be odd or even).
Input: b, the upper bound (may be odd or even).
Output: sum of odd integers between a and b (inclusive).
*/
public class KeithOddSum
{
public static void main(String[] args)
{
   // Read values for a and b
   Scanner in = new Scanner(System.in);
   System.out.println("Please enter a number: ");
   int a = in.nextInt();
   System.out.println("Please enter another number: ");
   int b = in.nextInt();
   int sum = 0;

    for (int c = a; c <= b; c++)
    {
        if (c % 2 == 1 || c % 2 == -1)
          sum = sum + c;
    }
    System.out.println(sum);
}
}