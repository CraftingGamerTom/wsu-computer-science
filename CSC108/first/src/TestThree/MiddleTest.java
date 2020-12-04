package TestThree;

/*
Complete the getMiddle method that gets the middle character from a string if the string length is odd, or the middle character pair if it is even.

For example, getMiddle("Java") returns "av", and getMiddle("program")returns "g".

If the string parameter is empty, return the empty string.

Complete the following code:
*/


public class MiddleTest
{
   /**
      Gets the middle character or character pair from this string 
      when possible.
      @param str a string
      @return the middle character (if the string length is odd) or
      the middle two characters (if it is even), or the empty string if str is
      empty.
   */
   public static String getMiddle(String str)
   {
      String answer = str;
      if (str.length() <= 2)
      {
    	  return str;
      }
      if(str.length() % 2 == 0)
      {
    	  answer = str.substring((str.length()/2) - 1, (str.length()/2) + 1 );
      }
      else
      {
    	  answer = str.substring((str.length()/2), (str.length()/2) + 1);
      }
      
      return answer;
   }
}