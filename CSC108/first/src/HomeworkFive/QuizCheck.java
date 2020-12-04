package HomeworkFive;

import java.util.Scanner;

public class QuizCheck
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int questions = in.nextInt();
		
		System.out.println(checkInputs(input, questions));
		
	}
   /**
      Checks whether a string of quiz answers is valid. It must 
      contain an answer A, B, C, or D for each expected answer, or an 
      X to indicate that no answer was provided.
      @param input the answer string
      @param questions the number of questions in the string
      @return true if the string was valid, false otherwise
   */
   public static boolean checkInputs(String input, int questions)
   {
      boolean checkAns = true;
      boolean checkNum;
      
      //Checks if the number of questions matches nuber of answers
      if (questions == input.length())
      {
    	  checkNum = true;
      }
      else
      {
    	  checkNum = false;
      }
      
      //Checks if the answers given are valid answers
      for (int i = 0; i < input.length(); i++)
      {
    	  String character = input.substring(i, i+1);
    	  
    	  if (!character.equals("A") && !character.equals("B") && !character.equals("C") && !character.equals("D") && !character.equals("X"))
    	  {
    		checkAns = false;
    		break;
    	  }
      }
      
      //Determines if the inputs are valid based on checked information
      if (checkAns && checkNum == true)
      {
    	  return true;
      }
      else
      {
    	  return false;
      }
   }
}
