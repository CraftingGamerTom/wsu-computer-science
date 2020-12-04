package first;

import java.util.Scanner;

public class LexiOrder
{
   public static void main(String[] args)
   {
      // Print prompt to enter two words (strings)
      System.out.println("Please enter two words: ");

      // Read in both integer values
      Scanner in = new Scanner(System.in);
      String word1 = in.next();
      String word2 = in.next();

      // Determine the correct alphabetical order of words
      //    and print out the words in one line, in order.

      int lex = word1.compareTo(word2);
      if (lex > 0)
      {
    	  System.out.println(word2);
    	  System.out.println(word1);
      }
      if (lex < 0)
      {
    	  System.out.println(word1);
    	  System.out.println(word2);
      }
      if (lex == 0)
      {
    	  System.out.println(word1);
      }
      
      in.close();


   }
}

/*
For example,

Please enter two words: grade class
Order: class  grade
Complete the following code:

import java.util.Scanner;

public class LexiOrder
{
   public static void main(String[] args)
   {
      // Print prompt to enter two words (strings)
      System.out.println("Please enter two words: ");

      // Read in both integer values
      Scanner in = new Scanner(System.in);
      String word1 = in.next();
      String word2 = in.next();

      // Determine the correct alphabetical order of words
      //    and print out the words in one line, in order.

      // Your work here


   }
}
*/