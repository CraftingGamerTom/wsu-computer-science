
import java.util.ArrayList;

/**
 * A class extending Question that can be used to create a multi-answer multiple
 * choice question.
 * 
 * @author TomRokickiii
 *
 * @version 0.1
 */
public class MultiChoiceQuestion extends Question {

    private String questionText;
    private ArrayList<String> questionList = new ArrayList<String>();
    private ArrayList<Boolean> answerList = new ArrayList<Boolean>();

    /**
     * Creates a new MultiChoiceQuestion
     * 
     * @param question
     *            The question variable to pass on.
     */
    public MultiChoiceQuestion(String question) {
        super(question);
        this.questionText = question;

    }

    /**
     * Gets the private string questionText.
     * 
     * @return questionText
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Adds a possible answer and sets it to whether it is correct or not.
     * 
     * @param answerText
     *            Passes answerText into the list.
     * @param isCorrect
     *            Passes a boolean to define if the added choice is a correct
     *            answer or not.
     */
    public void addChoice(String answerText, Boolean isCorrect) {
        questionList.add(answerText);
        answerList.add(isCorrect);

    }

    // ----------BEGIN QUESTION.JAVA OVERRIDE----------

    /**
     * Checks a given response for correctness.
     * 
     * @param response
     *            the response to check
     * @return true if the response was correct, false otherwise
     */
    @Override
    public boolean checkAnswer(String response) {
        response.trim();
        for (int index = 0; index < response.length(); index++) {
            String seperate = response.substring(index, index + 1);
            if (!seperate.equals(" "))// Insures there is no space between the
                                      // answers
            {
                Integer number = Integer.parseInt(seperate);
                if (!answerList.get(number - 1))// Checks if the answer
                                                // is incorrect
                {
                    return false;
                }
            }

        }
        return true;
    }

    /**
     * Displays this question.
     */
    @Override
    public void display() {
        System.out.println(this.questionText);
        for (int index = 0; index < this.questionList.size(); index++) {
            System.out.print((index + 1) + ": ");
            System.out.println(this.questionList.get(index));
        }

    }
}
