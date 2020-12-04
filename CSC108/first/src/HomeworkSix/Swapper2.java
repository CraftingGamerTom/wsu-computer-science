package HomeworkSix;

public class Swapper2

/*
Your task is to complete a method that swaps the first and second half of an array of integers. For example, if the array contains the values
1 4 9 16 25 36
then after calling the method, it should contain the values
16 25 36 1 4 9
If the array contains an odd number of elements, leave the middle element in place. For example,
1 4 9 16 25 36 45
becomes
25 36 45 16 1 4 9
Complete the following code:
*/

{
   /**
      This method swaps the first and second half of the given array.
      @param values an array
   */
   public static void swapFirstAndSecondHalf(int[] values)
   {
	   int temp = 0;
	   int halfLength = values.length/2;
	   int jump;
	   if (values.length % 2 == 0)
	   {
		   jump = 0;
	   }
	   else
	   {
		   jump = 1;
	   }
		//Swaps First and Second Half
		for (int i = 0; i < (halfLength); i++)
		{
			temp = values[i];
			values[i] = values[halfLength + i + jump];
			values[halfLength + i + jump] = temp;
		}
		




   }
   
   
   // This method is used to check your work
   public static int[] check(int[] values)
   {
      swapFirstAndSecondHalf(values);
      return values;
   }
}