package TestThree;

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
	   int minutes = milTime;
	   int hours = milTime;
	   String output = "";
	   String timeStamp = "";
	   //Split military time
	   minutes = milTime - ((minutes / 100) * 100);
	   
	   hours /= 100;
	   
	   //System.out.print(hours + " " + hold1);
	   //loop to change 24hr to 12 hr and add time stamp
	   if (hours >= 12)
	   {
		   hours = hours - 12;
		   timeStamp = " pm";
		   if (hours == 0)
		   {
			   hours = 12;
		   }
		   
		   
	   }
	   else if (hours <  12)
	   {
		   if (hours == 0)
		   {
			   hours = 12;
		   }
		   timeStamp = " am";
	   }
	   
	   //if hold1 == 0 print nothing for hold1 and remove semi colon
	   //if hold1 < 10 put a zero in front of it
	   
	   
	   
	   if (minutes == 0)
	   {
		   output = hours + timeStamp;
		   
	   }
	   else if (minutes < 10)
	   {
		   output = hours + ":0" + minutes + timeStamp;
	   }
	   else
	   {
		   //output = Integer.toString(hold1);
		   output = hours + ":" + minutes + timeStamp;
	   }
	   
      return output;
   }
}