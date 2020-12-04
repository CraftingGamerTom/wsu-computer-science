package HomeworkSix;

public class Grades
{
	   /*
    Compute Test Averages from 2 1D Arrays
    
    Your teacher has created two arrays, each holding the results of tests, say Test 1 and Test 2. You need to create a new array which holds the averages of these two tests. You may assume that the first element of the first test array refers to the student who also has the grade in the first element of the second test, and the last element in each array are the grades the last student earned for each test. All students received grades for both tests, meaning both test arrays are of the same length.

Complete the method, named makeAverage, in the class named Grades.java. There are two parameters to this method: the first is the integer array representing the grades of the first test, and the second is the array containing the grades of the second test. The new average array should be returned by the method. The grades should be treated as double variables.

For example, consider the test grades for the five students in the following arrays:

  [ 87 ]    [ 91 ]
  [ 76 ]    [ 76 ]
  [ 94 ]    [ 95 ]
  [ 82 ]    [ 86 ]
  [ 72 ]    [ 67 ]
The first student has an exam average of 89.0 (= (87+91)/2 = 178/2), the second student has an exam average of 76.0 (= (76+76)/2 = 152/2), the third student has an exam average of 94.5 (= (94+95)/2 = 189/2), etc. Hence, the new average array should match the following:

  [ 89.0 ] 
  [ 76.0 ]
  [ 95.5 ]
  [ 84.0 ]
  [ 69.5 ]
Complete the following code:
    
   */
   
   /**
   This method examines the two arrays of test grades (double)
   identified by the two parameters, and creates an array
   containing the average values of these two arrays.
   The test scores for each student (given in the same row in each test
   array) are combined to find the average score for each student. 
   This average is placed in the corresponding row in the new array.
   @param test1, the array of scores for the first test
   @param test2, the array of scores for the second test
   @return, the array containing the average scores
*/
	public static double[] makeAverage(double[] test1, double[] test2)
	{

		double[] average = new double[test1.length];
		
		for (int i = 0; i < test1.length && i < test2.length; i++)
		{
			average[i] = (test1[i] + test2[i])/2;
		}
		return average;
		
	}
}
//Logic Error for labrat - the code needs to except variable amount of inputs .... the last test case needs to return an array with the size of 1