package HomeworkSix;
/*
Write a method that computes the frequency (as a percentage between 0.0 and 1.0) of each letter A-Z or a-z in a string. Don't distinguish between upper- and lowercase letters. Return an array of length 26. The ith element contains percentage of the letter 'a' + i or 'A' + i among the letters in the string. The string may contain other characters that you should simply skip.

Complete the following code:
*/
public class Letters
{
	/*
	public static void main(String[] args)
	{
		String input = "Hello, World!";
		double[] output = letterFrequencies(input);
		System.out.print("[");
		for (int i = 0; i < output.length; i++)
		{
			
			System.out.print(",  " + output[i]);
			
		}
		System.out.println("]");
	}
	*/
   /**
      Counts the frequencies of letters A-Za-z in a string
      @param str a string
      @return an array of 26 percentages. The i-th count is the percentage of occurrences
      of 'A' + i or 'a' + i among all letters (a number between 0.0 and 1.0).
   */
   public /*static*/ double[] letterFrequencies(String str)
   {
	  char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      double[] average = new double[26];
      str = str.toUpperCase();
      double lengthOfString = getLetters(str);
      
      //System.out.println("***String Made all UpperCase: " + str); //Debug tool
      
      for (int a = 0; a < characters.length; a++)
      {
    	  double count = 0;
    	  for(int b = 0; b < str.length(); b++)
    	  {
    		  
    		  if (characters[a] == str.charAt(b))
    		  {
    			  count++;
    		  }
    	  }
    	  average[a] = count / lengthOfString;
      }
      
      return average;
   }
   
   public /*static*/ double getLetters(String toCount)
   {
	   double ret = 0;
	   
	   for (int i = 0; i < toCount.length(); i++)
	   {
		   char c = toCount.charAt(i);
		   if ((c >= 'A') && (c <= 'Z'))
		   {
			   ret++;
		   }
	   }
	   
	   return ret;
   }
}