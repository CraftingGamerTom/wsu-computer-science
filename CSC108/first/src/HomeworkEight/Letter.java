package HomeworkEight;



/*
Provide a class for authoring a simple letter. In the constructor, supply the names of the sender and the recipient: 
public Letter(String from, String to)
Supply a method 
public void addLine(String line)
to add a line of text to the body of the letter.

Supply a method 
public String getText()
that returns the entire text of the letter. The text has the form: Dear recipient name : blank line first line of the body second line of the body 
. . .
last line of the body blank line Sincerely, blank line sender name Also supply a program LetterPrinter that prints this letter. 
Dear John:

I am sorry we must part.
I wish you all the best.

Sincerely,

Mary
Construct an object of the Letter class and call addLine twice.

Hints: (1) Use the concat method to form a longer string from two shorter strings. (2) The special string "\n" represents a new line. For example, the statement 
body = body.concat("Sincerely,").concat("\n");
adds a line containing the string "Sincerely," to the body.

Your main class should be called LetterPrinter.

Complete the following class in your solution:
*/

/**
   This class models a simple letter.
 */
public class Letter
{
   private String sender;
   private String recipient;
   private String body = "";

   /**
      Constructs a letter with a given sender and recipient.
      @param from the sender
      @param to the recipient
   */
   public Letter(String from, String to)
   {
      sender = from;
      recipient = to;
   }
   
   /**
      Adds a line to the body of this letter. 
   */   
   public void addLine(String line)
   {   
		  body = body.concat(line).concat("\n");   
   }
   
   /**
      Gets the text of this letter.
   */
   public String getText() 
   {
	   String completeLetter = "Dear " + recipient + ":\n\n" + body + "\nSincerely,\n\n" + sender;
	   return completeLetter;
   }

}


//Show Work is not available for this question