package HomeworkFive;

import java.util.Scanner;

public class ComputeFact2 {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int ans = 0;
		int answer = ComputeFact(input);
		
		System.out.println(answer);
			
		in.close();
	}

	/**
	 * Calculates a factorial
	 * 
	 * @param input
	 * @return the factorial value
	 */
	public static int ComputeFact(int input)
	{
	
		int ans = 1;
		int tmp = 0;
		System.out.println("input " + input + " tmp " + tmp +  " ans " + ans);
		if(input < 1)
		{
			return 1;
		}
		else {
			
		//ans = input * (input -1);
		tmp = ComputeFact(input - 1);
		ans = input * tmp;
		System.out.println("input: " + input + " tmp: " + tmp +  " ans: " + ans);
		return ans;
		}
	}
	
	public static int factorial(int n)
	{
		int hold1 = n;

		if (n == 0 || n == 1)
		{
			hold1 = 1;
		}
		else 
		{
			do
			{	  
				hold1 = hold1 * (n - 1);
				factorial(n - 1);
			}	
			while(n > 1);
		}
	  
	  return hold1;
	}
}
