/**
	      x
	     xxx
	    xxxxx
	   xxxxxxx
	   
	 Complete the following code:
	 A program to draw a filled triangle.
*/
/**
 * Future build will include a method defining the number of spaces based on
 * the amount of preferred levels belonging to the triangle. (If I want to kill free time)
 * For now this code is sufficient for the problem.
 * -Thomas Rokicki 
*/


package first;

public class pyramid {
	public static void main(String args[]){

		String space = "   ";
		String x = "X";
		StringBuilder spaceDelete = new StringBuilder(space);
		
		//Defining variables for the code
		
		try{
			for(int i = 0; i < 4; i++){			// For loop to potentially be able to make any size triangle
				System.out.print(spaceDelete);	// Prints necessary amount of space to create proper shape
				System.out.print(x);			// Prints the current level of the triangle
				System.out.println(spaceDelete);
				x = "X" + x + "X";				// Adds next level of Triangle
				spaceDelete.deleteCharAt(1);  	// Removes a space then shifts positions front.
				}
			}
			catch(IndexOutOfBoundsException e){	// To allow creation of final level of the triangle without error
				System.out.print(x);
			}
			
	    }
	 
	}


