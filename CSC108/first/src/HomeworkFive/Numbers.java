package HomeworkFive;

import java.util.Scanner;

/*
Write a method that combines two numbers with an operator that is given as a string "+", "-", "*", "/", or "^" (raising to a power). For example, evaluate("^", 10, 2) should return 100.

Complete the following code:
*/
public class Numbers
{
   /**
      Combines two numbers with a given operator.
      @param op one of "+", "-", "*", "/", or "^" (for power)
      @param first the first argument
      @param second the second argument
      @return the result of evaluating the operator with the arguments
   */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//initialize variables
		String op = in.next();
		double first = in.nextDouble();
		double second = in.nextDouble();
		
		//print answer
		System.out.println(evaluate(op, first, second));
		in.close();
	}
	
   public static double evaluate(String op, double first, double second)
   {
	   double answer = 0;
	   
      if(op.equals("+"))
      {
    	  answer = first + second;
    	  
      }
      if(op.equals("-"))
      {
    	  answer = first - second;
    	  
      }
      if(op.equals("*"))
      {
    	  answer = first * second;
    	  
      }
      if(op.equals("/"))
      {
    	  answer = first / second;
    	  
      }
      if(op.equals("^"))
      {
    	  answer = Math.pow(first, second);
    	  
      }
      return answer;
   }
}