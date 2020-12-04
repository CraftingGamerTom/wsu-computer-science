package first;

import java.util.Scanner;

public class StringsTest {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = in.nextLine();
		
		System.out.println("Please enter a value for n: ");
		int n = in.nextInt();
		
		System.out.println(str.substring(0, n));
		
		in.close();
	}
}

/*
import java.util.Scanner;

/**
   A program reads in a string, followed by an integer n,
   where the value of the integer should be smaller than the
   length of the string.  The program then prints out the last
   n characters of the string.

public class Strings
{
   public static void main (String[] args)
   {
      // Display prompt for string of characters
      System.out.println("Please enter a string: ");

      // Read string
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();

      // Display prompt for integer n
      System.out.println("Please enter a value for n: ");

      // Read n
      int n = in.nextInt();

      // Print last n characters of string

      // Your work here


   }
}
*/