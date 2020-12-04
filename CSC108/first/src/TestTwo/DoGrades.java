package TestTwo;

/*
Complete the program below so that it prompts for and reads in a student's final class average (0.0 to 100.0), and prints out the letter grade the student should receive, based on the following table:

A : greater than 90.0, up to 100.0
B : greater than 80.0, up to 90.0
C : greater than 70.0, up to 80.0
D : greater than 60.0, up to 70.0
F : 0.0 up to 60.0
For example, if a student's final class average is 84.6, he has earned a letter grade of B.

Complete the following code:
*/
import java.util.Scanner;

/** 
   This program reads a student's final class average,
   and prints out the appropriate letter grade.
*/
public class DoGrades
{
   public static void main(String[] args)
   {
      // Print prompt to enter a final class average 
      System.out.println("Enter final class average: ");

      // Read in final class average
      Scanner in = new Scanner(System.in);
      Double input = new Double(in.nextDouble());
      int average = input.intValue();
      String letter = "";
      
      average = average / 10;
      
      switch (average)
      {
      case 10:
    	  letter = "A";
    	  break;
      case 9:
    	  letter = "A";
    	  break;
      case 8:
    	  letter = "B";
    	  break;
      case 7:
    	  letter = "C";
    	  break;
      case 6:
    	  letter = "D";
    	  break;
      default: 
    	  letter = "F";
      }
      
      System.out.println(letter);

    

      }
   }