package HomeworkNine;

import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;

   /**
      Constructs a choice question with a given text and no choices.
      @param questionText the text of this question
   */
   public ChoiceQuestion(String questionText)
   {
      super(questionText);
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
      }
   }
   
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
   }
   public boolean choiceChecker(ArrayList<String> theChoices){
	   for (int i = 0; i < this.choices.size(); i++){
		   if (this.choices.get(i) != theChoices.get(i)){
			   return false;
		   }
	   }
	   return true;
   }
   /*
   @Override
	public boolean equals(Question theChoiceQuestion){
		
		if (this.getQuestion().equals(theChoiceQuestion.getQuestion()) && choiceChecker(choices)){
			return true;	
		}
			return false;
	}
	*/
   @Override
   public boolean equals(Object choiceQuestion) {
       if (this == choiceQuestion) {
           return true;
       } else if (choiceQuestion == null) {
           return false;
       } else if (choiceQuestion instanceof ChoiceQuestion) {
           ChoiceQuestion q = (ChoiceQuestion) choiceQuestion;
           if ((q.choices.size() != choices.size()) || (q.choices == null && choices != null) || (q.choices != null && choices == null)) {
               return false;
           }
           if ((q.getAnswer() == null && this.getAnswer() == null) || (q.getAnswer().equals(this.getAnswer())) && ((q.getQuestion() == null && getQuestion() == null) || q.getQuestion().equals(getQuestion()))) {
               return true;
           }
       }
       return false;
   }
	@Override
	public String toString(){
		String choiceString = "";
		for (int i = 0; i < this.choices.size(); i++){
			choiceString += this.choices.get(i);
			if (i < this.choices.size()-1){
				choiceString += ", ";
			}
			
		}

		return "ChoiceQuestion[text=" + this.getQuestion() + ",answer=" + this.getAnswer() + "][choices=[" + choiceString + "]]";
	}
}

