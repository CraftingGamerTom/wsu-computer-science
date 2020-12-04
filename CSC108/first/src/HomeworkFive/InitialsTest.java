package HomeworkFive;

/*
Complete the getInitials method in the InitialsTest class below. For example, if name is read as three strings: "Harry", "Joseph", and "Hacker", then the call to the getInitials method with the three names as parameters should return the string "HJH".

Complete the following code:
*/

import java.util.Scanner;

public class InitialsTest
{
   /**
      Gets the initials of this name
      @params first, middle, and last names
      @return a string consisting of the first character of the first, middle,
      and last name
   */
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String one = "", two = "", three = "", in = "";
		
		one = input.next();
		two = input.next();
		three = input.next();
		
		//getInitials(one, two, three);
		//System.out.println(in);
		
		System.out.println(getInitials(one, two, three));
		
		input.close();
	}
   public static String getInitials(String one, String two, String three)
   {
	   String in = "";
	   in = one.substring(0, 1);
	   in += two.substring(0, 1);
	   in += three.substring(0, 1);

	   
	   //System.out.println("test" + in);
      return in;

   }
}