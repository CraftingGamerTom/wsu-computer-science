package first;

import java.util.Scanner;

/**
   Counts the number of words in a line.
   Input: a string containing the line
   Output: the number of words in the line
*/
public class CountWords
{
   public static void main(String[] args)
   {
      int count = 0;

      Scanner in = new Scanner(System.in);
      while (in.hasNext())
      {
    	  //System.out.println("test1");
    	  String destroy = in.next();
    	  //System.out.println(destroy);
    	  count++;
    	  //System.out.println("test2");
      }
      
      //System.out.println("exited");
      System.out.println(count);
      //This works but it needs a ctrl-z for it to exit from the while loop

   }
}
