package HomeworkSix;

import java.util.ArrayList;

public class ArrayOps
{

	/*

	Linear Search

	      Here is a main method for solving:
	      
	      	public static void main(String[] args)
		{
			int[] input = {2, 234, 56, -5, 76};
			
			System.out.println(findValue(input, 56));
		}


	Complete the method, named findValue, in the class named ArrayOps.java. There are two parameters to this method: the first is an integer array and the second is a integer value.

	This method should use a linear search to try to find an instance of the integer value parameter within the array. If the value is in the array, the method returns the subscript of the array where the value was found. If the value is not in the array, the value of the length of the array is returned (as that is a higher value than any of the array subscripts).

	Complete the following code:
	*/
	
   /**
      This method performs a linear search on the array identified by
      the first parameter, while looking for the value indicated by
      the second parameter.
      
      @param values, an array of integers
      @param valueToFind, an integer to look for in the array values
      @ return, the index (subscript) of the array where the value
            was found OR the length of the array if it was not found.
   */
   public static int findValue(int values[], int valueToFind)
   {
	   int answer = -1;
	   
	   System.out.println("Value To Find: " + valueToFind);

      for (int i = 0; i < values.length; i++)
      {
    	  if (values[i] == valueToFind)
    	  {
    		  return i;
    		  
    	  }
    	  else
    		  
    	  {
    		  answer = values.length;
    	  }
      }
      return answer;

   }
   
   /*
    
    Find Larger sum of 2D array
    
    Complete the method, named bigSum, in the class named ArrayOps.java. The only parameter to this method is a two-dimensional array of integers with only 2 rows. This method should sum each row of integers separately, and then decide which of the two sums is larger. This larger sum is the return value for this method.

	For example, suppose the array contains the following data:

[ [ 25, 16, 14 ]
  [ 13, 27, 22 ]  ]
The sum of the first row is (25 + 16 + 14) = 55, while the sum of the second row is (13 + 27 + 22) = 62. Comparing, we see that the sum of the second row is the larger sum; hence, the method returns the integer 62.

You might think of this as comparing the test grades of two students.

Complete the following code:
    
    */
   
   /*
   public static void main(String[] args)
   {
	   int[][] input = {{25, 16, 14}, {13, 27, 22}};
	   System.out.println(bigSum(input));
   }
   */
   
   /**
   This method sums up both rows of a two-dimensional array
   (the only parameter to the method) and returns the greater sum.
   @param theArray, a 2-D array of integers
   @return, the greater row sum
*/
      public static int bigSum(int[][] theArray)
      {
	   // your work here
		   int one = 0;
		   int two = 0;
	   // loop though theArray, summing first row 
		
		   for (int b = 0; b < theArray[0].length; b++)
		   {
			   one += theArray[0][b];
		   }
		   for (int b = 0; b < theArray[1].length; b++)
		   {
			   two += theArray[1][b];
		   }
		   /*
		   for (int a = 0; a < theArray.length; a++)
		   {
	
			   
			   for (int b = 0; b < theArray[0].length; b++)
			   {
				   one += theArray[0][b];
			   }
			   for (int b = 0; b < theArray[1].length; b++)
			   {
				   two += theArray[1][b];
			   }
			   
		   }
		   */
		   
		   if (one < two)
		   {
			   return two;
		   }
		   else 
		   {
			   return one;
		   }
	   
	   }
	
   

   
	/*
	 
	 Consider an array of integers. We need to copy that array into an ArrayList, in reversed order. To do this, you need to complete the method, named copyReverse, in the class named ArrayOps.java. There is only one parameter to this method: the original array of integers. The method returns the new ArrayList, with the contents reversed in order from the original array.

For example, consider the following array of integers:

[3, 9, 27, 81]
When you call the copyReverse method with this array, the return value should be a new ArrayList containing the same elements, but in reversed order:
[81, 27, 9, 3]
Complete the fol
	 
	 */
	
	/**
    This method goes through the array of integers identified by
    the only parameter, creating a new ArrayList from the array,
    but in reverse order.
    @param theArray, an array of integers
    @return reversedArr, the new ArrayList of Integers

 */
	public static ArrayList<Integer> copyReverse(int[] anArray)
	{
	    
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		for (int i = anArray.length - 1; i >= 0; i--){reverse.add(anArray[i]);}
		return reverse;
		
	}
	
	/*
	
	Copy Array to ArrayList, excluding duplicates
	
	*/
	
	/*
	public static void main(String[] args)
	{
		//int[] input = {1, 35, 321, 355, 123, 5, 35};
		int[] input = {3,5,5,5,3,3,5,3,5};
		System.out.println(copyArray(input));
	}
	*/

	
	/**
     * This method goes through the array of integers identified by the only
     * parameter, creating a new ArrayList from the array, eliminating
     * duplicates from the original array.
     *
     * @param theArray, an array of integer
     * @return uniqueIntAL, the new ArrayList
     *
     */
    public static ArrayList<Integer> copyArrayTwo(int[] anArray) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < anArray.length; i++) 
        {
            output.add(anArray[i]);
        }

        for (int a = 0; a < output.size(); a++) 
        {
            for (int b = 0; b < output.size(); b++) 
            {
                if (a != b) 
                {
                    if (output.get(a) == output.get(b)) 
                    {
                        output.remove(b);
                    } 
                    else 
                    {
                        b++;
                    }
                    
                } 
                else 
                {
                    b++;
                }

            }

        }

        return output;

    }
	
	/**
     * This method goes through the array of integers identified by the only
     * parameter, creating a new ArrayList from the array, eliminating
     * duplicates from the original array.
     *
     * @param theArray, an array of integer
     * @return uniqueIntAL, the new ArrayList
     *
     */
    public static ArrayList<Integer> copyArrayThree(int[] anArray) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < anArray.length; i++) 
        {
            output.add(anArray[i]);
        }

        for (int a = 0; a < output.size(); a++) 
        {
            for (int b = 0; b < output.size(); b++) 
            {
                if (a != b) 
                {
                    if (output.get(a) == output.get(b)) 
                    {
                        output.remove(b);
                    } 
                    /*else 
                    {
                        b++;
                    }
                    */
                } /*
                else 
                {
                    b++;
                }*/

            }

        }

        return output;

    }
	
	/**
    This method goes through the array of integers identified by
    the only parameter, creating a new ArrayList from the array,
    eliminating duplicates from the original array.
    @param theArray, an array of integer
    @return uniqueIntAL, the new ArrayList

*/
	public static ArrayList<Integer> copyArray(int[] anArray) 
	{
		
		ArrayList<Integer> output = new ArrayList<>();
		
		for (int i = 0; i< anArray.length; i++)
		{
			output.add(anArray[i]);
		}
		
		//System.out.println(output); //debug tool
		
		int a = 0;
		while (a < output.size())
		{
			
			int next = a+1;
			//System.out.println(a + "     " + next); //debug tool
			
			while (next < output.size())
			{
				if (output.get(a) == output.get(next))
				{
					//System.out.println("break    Removed:  " + output.get(a)); //debug tool
					output.remove(a);
					next = a+1;
					
				}
				else
				{
					//System.out.println("next   " + next); //debug tool
				next++;
				}
			}
			a++;
		}
			
		return output;

	}
	
	public static ArrayList<Integer> copyArrayOne(int[] anArray)
	{
		// your work here

		boolean duplicate = true;
		// declare the new ArrayList
		ArrayList<Integer> foo = new ArrayList<>();
		
		/*
		for(int i = 0; i < anArray.length; i++)
		{
			foo.add(anArray[i]);
		}
		*/
		//System.out.println(anArray.length);
		
		for (int a = 0; a < anArray.length + 1; a++)
		{
			if (duplicate == false)
			{
				//System.out.println("***not-duplicate: " + anArray[a - 1]);
				foo.add(anArray[a - 1]);
			}
			for (int b = a + 1; b < anArray.length; b++)
			{
				duplicate = false;
				if (anArray[a] == anArray[b])
				{
					//System.out.println("***duplicate:  " + anArray[a] + " | " + anArray[b]);
					duplicate = true;
					break;
				}
				//System.out.println("test: " + b);
					
			}
			
		}
		

		return foo;
	}
	
	/**
    This method adds up the integer values in an array,
    with the integer sum returned at the end of the method.
    @param values, an array of integers, may be positive or negative
    @ return, the sum of the integers
 */
 public static int sumArray(int values[])
 {

	 int total = 0;
    for (int index = 0; index < values.length; index++){
    	total += values[index];
    }
    return total;
 }
 
 /**
 This method goes through the array of integers identified by
 the first parameter, while counting the number of occurrences
 of the second parameter, a single integer, within the array.
 @param theArray, an array of integers
 @param theChar, an integer whose occurrences within the array
    need to be counted
 @ return, the count of the occurrences of the integer represented
 by the second parameter in the array of integers.
*/
public static int countOccurs(int[] theArray, int theInt)
{
 int count = 0;

 for (int index = 0; index < theArray.length; index++){
	 if (theArray[index] == theInt){
		 count++;
	 }
 }
 return count;
}
	
}