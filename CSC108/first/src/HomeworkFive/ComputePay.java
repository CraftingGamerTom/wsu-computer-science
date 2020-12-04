package HomeworkFive;

/*
If an employee has worked forty hours or less, the pay is just the number of hours worked multiplied with the hourly wage. If he has worked more than forty hours, he qualifies for overtime pay, which is his regular 40-hour pay plus 1.5 times his hourly wage times the overtime hours.

For example, if Cassie is paid ten dollars an hour and works only twenty hours, then her pay is two hundred dollars (or ten dollars/hour times twenty hours).

But if Ben is paid eight dollars an hour and works for fifty hours, his pay is three hundred sixty dollars regular pay (eight dollars/hour times forty hours) PLUS one hundred twenty dollars for overtime pay (1.5 times eight dollars/hour times ten hours overtime), making his total pay four hundred and forty dollars.

Complete the following code:
*/
import java.util.Scanner;

public class ComputePay
{
   /**
      Compute pay (including overtime) for worker. Hours in excess of 40 hours
      are paid at time-and-a-half.
      @param wage the hourly wage for the employee
      @param hoursWorked the number of hours worked by employee in one week
      @return the amount of pay employee earned
   */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double wage = in.nextDouble();
		double hoursWorked = in.nextDouble();
		double output = 0.0;
		
		output = payForWeek(wage, hoursWorked);
		
		System.out.println(output);
		
		in.close();
	}
	
   public static double payForWeek(double wage, double hoursWorked)
   {
	   double pay = 0.0;
	   
	   
      if (hoursWorked > 40)
      {
    	  pay = 40 * wage;
    	  pay += (hoursWorked - 40) * (wage * 1.5);
      }
      else 
      {
    	  pay = wage * hoursWorked;
      }
 
      return pay;
   }
}