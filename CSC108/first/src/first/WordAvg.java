package first;

import java.util.Scanner;

/**
   Determines the average number of characters for words in a string.   
   Input: a string of one or more lines containing words
   Output: the average number of characters per word in the string 
      to two decimal places
*/
public class WordAvg
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      double wordLength = 0;
      double totalLength = 0;
      double wordCount = 0;
      double averageWords;

      while (in.hasNext())
      {
         String word = in.next();

         wordLength = word.length();
         totalLength += wordLength;
         wordCount++;


      }

      //System.out.println(wordCount);
      //System.out.println(totalLength);
      averageWords = totalLength / wordCount;
      System.out.printf("%.2f", averageWords); //Will not print until document is done or user presses CTRL-Z
      in.close();

   }
}