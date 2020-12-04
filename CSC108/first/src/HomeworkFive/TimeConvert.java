package HomeworkFive;

import java.util.Scanner;

/*
Your task is to write a method that converts military time to ordinary time. For example,

1935 becomes 7:35 pm
935 becomes 9:35 am
1900 becomes 7 pm
0035 becomes 12:35 am
Complete the following code:
*/

/*
 * If it is three digits must ad a zero to front
 * switch statement to determine what to output
 * need something to split the int into two parts
 * 
 */
import java.util.Scanner;

public class TimeConvert
{
   /**
      A method to extract the minutes portion of an
      integer representing Military time.
      @param milTime, the military time provided: hhmm
      @return a string of the form 9:35 am or 7 pm
   */
	public static void main(String[] args)
	{
	 Scanner in = new Scanner(System.in);
	 int input = in.nextInt();
	 
	 System.out.println(militaryToOrdinaryTime(input));
	 
	 in.close();
	}
   public static String militaryToOrdinaryTime(int milTime)
   {
	   //Initialize variables
	   String output = "";
	   int hold1 = milTime;
	   int hold2 = milTime;
	   String timeStamp = "";
	   //Split military time
	   hold1 = hold1 / 100;
	   hold1 = hold1 * 100;
	   hold1 = milTime - hold1;
	   
	   hold2 = hold2 / 100;
	   
	   //System.out.print(hold2 + " " + hold1);
	   //loop to change 24hr to 12 hr and add time stamp
	   if (hold2 > 12)
	   {
		   hold2 = hold2 - 12;
		   timeStamp = " pm";
		   
		   
	   }
	   else if (hold2 <=  12)
	   {
		   timeStamp = " am";
	   }
	   
	   output = hold2 + ":" + hold1 + timeStamp;
	   
      return output;
   }
}