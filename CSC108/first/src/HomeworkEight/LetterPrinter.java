package HomeworkEight;

public class LetterPrinter
{
	   public static void main(String[] args)
	   {
		
		   String sender = "Mary";
		   String recipient = "John";
		   Letter test = new Letter(sender, recipient);
		   
		   test.addLine("I am sorry we must part.");
		   test.addLine("I wish you all the best.");
		   
		   test.getText();
		   //System.out.println(test.getText());
		   
	   }
}

