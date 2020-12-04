package TestThree;

/*
The "733t hax0rs" like to make their text look cool by replacing characters with similar-looking symbols: e becomes 3, i becomes 1, l becomes 7, and o becomes 0.

For example, Hello is turned into H3770.

Complete the following code:
*/
	
public class ReplaceTest
{
   /**
      A method to replace letters as follows:
      the letter e becomes 3, 
      the letter i becomes 1,
      the letter l becomes 7, 
      the letter o becomes 0.
      @param str a string
      @return the string with the characters replaced
   */
   public static String replace(String str)
   {

	   String answer = str;
	   answer = str.replace('e', '3');
	   answer = answer.replace('i', '1');
	   answer = answer.replace('l', '7');
	   answer = answer.replace('o', '0');
	   return answer;
   }
}