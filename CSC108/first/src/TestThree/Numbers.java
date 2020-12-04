package TestThree;

/*
Write a method that counts how many digits of a given number are a 7. For example, countSevens(1770) should return 2.

Complete the following code:
*/
public class Numbers
{
	/*
	public static void main(String[] args)
	{
		
		System.out.println(countSevens(17702));
	}
	*/
	
   /**
      Counts the number of 7s in a number
      @param number a number >= 0
      @return the number of digits in n that are 7
   */
   public static int countSevens(int number)
   {
      String input = Integer.toString(number);
      int count = 0;
      
      for (int i = 0; i < input.length(); i++)
      {
    	  char temp = input.charAt(i);
    	  if (temp == '7')
    	  {
    		  count++;
    	  }
      }
      return count;
   }
}