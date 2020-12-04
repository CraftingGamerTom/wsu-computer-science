package first;

import java.util.Scanner;

public class PalFind {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int point1 = 0;
		int point2 = 1;
		boolean check = false;
		
		for (point1 = 0; point1 <= input.length()/2; point1++)
		{
			String pt1 = input.substring(point1, point2); //Assigns a character from the first half of the word
			String pt2 = input.substring(input.length()-point2, input.length() - point1); //Assigns a character from the second half of the word
			
			point2++; // both point1 and point2 need to increase at the rate (point1 increases on every loop)
		
			//System.out.println(pt1 + " " + pt2); //Test to see assigned characters
			
			if (pt1.equalsIgnoreCase(pt2))
			{
				check = true;
				//System.out.println("testYes"); //Test to see when this statement runs
				
			}
			else
			{
				check = false;
				//System.out.println("testNo"); //Test to see when this statement runs
				break;
			}
			
		}
		
		//System.out.println(check); // Test for boolean value
		
		if (check == false)
		{
			System.out.println("No");
		}
		if (check == true)
		{
			System.out.println("Yes");
		}
		
		in.close();
		
		/*
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		String[] inString = new String[input.length()]; 
		inString = input.split("");
		
		boolean execute = true;
		for (int i = 0; i < input.length()/2; i++)
		{
			int point = 0;
			
			System.out.println(inString[point]);
			System.out.println(inString.length - point);
		
			if (inString[point].equals(inString.length-point))
			{
				execute = true;
				System.out.println("ttrue");
			}
			
			if (!inString[point].equals(inString.length-point))
			{
				execute = false;
				System.out.println("tfalse");
			}
			point++;
		}
		if (execute == true)
			{
				System.out.println("yes");
			}
		else if (execute == false)
		{
			System.out.println("no");
		}
		
		*/
	}
}

/*
A palindrome is a string that is the same spelled forward as it is spelled backward. So, "abcba" is a palindrome, as are "eye" and "madam".

Complete the PalFind program below so that it reads in a string of characters, checks character-by-character to see whether or not the string is a palindrome, and then prints either "Yes" or "No". 

In other words, if the input string is "abba" or "wallow", the output would be "Yes". 
If the input string is "FBI" or "garbage", the output would be "No".

You may ignore punctuation, in that the test strings used for this program do not contain any. You may also modify the whole string to all uppercase or all lowercase before you begin the check.

Note: The strings may be of odd or even length, as in "cat", "dad", "racecar", or "Hannah".

import java.util.Scanner;

/**
   Reads a string, checks to see if it is a palindrome, and prints
      "Yes" or "No", accordingly. 
   Input: the value of s, a string
   Output: "Yes" or "No"

public class PalFind
{
   public static void main(String[] args)
   {
      // Read string and convert to lowercase
      Scanner in = new Scanner(System.in);
      String ins = in.nextLine();

      // your work here
 



   }
}
*/