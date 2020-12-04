package first;

import java.util.Scanner;

public class GetVowels {

	/**
	 * Reads a string and prints out all vowels contained in that string. Vowels
	 * are A E I O U a e i o u.
	 * 
	 * Input: the value of s, a string Output: a string containing all the
	 * vowels in s, in the order in which they appear in s
	 */

	public static void main(String[] args) 
	{
		StringBuilder r = new StringBuilder();

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();

		int charCount = 0;

		
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
				r.append(ch);
				break;
			}
		}

		System.out.println(r.toString());
	}
}
// AaBbCcDdEeFfCcDdEeFfCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz
