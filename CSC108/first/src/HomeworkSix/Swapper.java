package HomeworkSix;

import java.util.Arrays;
import java.util.Scanner;

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
public class Swapper
{
	public static void main(String[] args)
	{
		
		int[] input = readInput();
		System.out.println("DEBUG***" + input);
		int[] arrayOutput = swapFirstAndSecondHalf(input);
		System.out.println(arrayOutput);
		
	}
	
   /**
      This method swaps the first and second half of the given array.
      @param values an array
   */
	public static int[] readInput()
	{
		final int INITIAL_SIZE = 1;
		Scanner in = new Scanner(System.in);
		int inputArray[] = new int[INITIAL_SIZE];
		int currentSize = 0;
		while (in.hasNextInt());
		{
			//Grows array if it is completely full
			if (currentSize >= inputArray.length)
			{
				inputArray = Arrays.copyOf(inputArray, 2 * inputArray.length);
			}
			inputArray[currentSize] = in.nextInt();
			currentSize++;
			System.out.println("DEBUG***" + currentSize);
		}
		
		in.close();
		return inputArray;
	}
	
	public static int[] swapFirstAndSecondHalf(int[] values) 
	{
		int temp = 0;
		int halfLength = values.length/2;
		//Swaps First and Second Half
		for (int i = 0; i < (halfLength); i++)
		{
			temp = values[i];
			values[i] = halfLength + i;
			values[halfLength + i] = temp;
		}
		return values;
	
	}

}