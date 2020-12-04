package first;

import java.util.Scanner;

public class StringGames {
	public static void main(String[] args){
		System.out.println("Please enter a string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String output = str.substring((str.length()/2)-1, (str.length()/2)+2);
		System.out.println(str.substring(str.length()-1) + str.charAt(0) + output);
		
		in.close();
	}

}

/**
A program reads in a string,
prints out the last character of the string,
followed by the first character, and then
followed by the three middle character of the string.
All input strings should be of odd length.

public class StringGames
{
public static void main (String[] args)
{
   // Display prompt for input string
   System.out.println("Please enter a string: ");

   // Read string
   Scanner in = new Scanner(System.in);
   String input = in.next();

   // Put together new string and print

   // Your work here

}
}
*/