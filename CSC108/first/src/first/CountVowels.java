package first;

import java.util.Scanner;

/**
   Reads a string and counts all vowels contained in that string.
   Vowels are A E I O U a e i o u. 

   Input: the value of s, a string
   Output: the number of all the vowels in s
*/
public class CountVowels
{
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();

		int charCount = 0;
		int count = 0;

		
		for (charCount = 0; charCount < s.length(); charCount++) 
		{
			char ch = s.charAt(charCount);
			//System.out.println("part1");
			switch (ch)
			{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				count++;
				break;
			}
		}

		System.out.println(count);
	}
}