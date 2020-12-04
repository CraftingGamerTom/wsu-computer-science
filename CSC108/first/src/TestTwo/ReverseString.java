package TestTwo;

/*
Complete the ReverseString program below so that it reads in a string of characters, reverses the order of the characters, and prints out the reversed string.
In other words, if the input string is "123456", the output string would be "654321". If the input string is "How now, brown cow", the output string would be "woc nworb ,won woH".
*/

import java.util.Scanner;

/**
   Reads a string, reverses the order the characters within the
   string, and prints out the result.
   Input: the value of s, a string
   Output: the string reversed
*/
public class ReverseString
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      String rs = "";

      for (int i = 0; i < s.length(); i++)
      {
    	  rs = rs + (s.substring(s.length()-(i+1), s.length()-i));
      }
      
      System.out.println(rs);



   }
}