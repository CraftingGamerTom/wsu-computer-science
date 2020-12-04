
/**
 * A question with a text and an answer.
 * 
 * @author TomRokickiii
 * @version 0.1
 */
public class Question {
    private String text;
    private String answer;

    /**
     * Constructs a question with a given text and an empty answer.
     * 
     * @param questionText
     *            the text of this question
     * 
     */
    public Question(String questionText) {
        text = questionText;
        answer = "";
    }

    /**
     * Sets the answer for this question.
     * 
     * @param correctResponse
     *            the answer
     */
    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    /**
     * Checks a given response for correctness.
     * 
     * @param response
     *            the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    /**
     * Displays this question.
     */
    public void display() {
        System.out.println(text);
    }

    /**
     * Gets the question test variable
     * 
     * @return test
     */
    public String getQuestion() {
        return text;
    }

    /**
     * Gets the answer text and returns it
     * 
     * @return returns the answer text.
     */
    public String getAnswer() {
        return answer;
    }

    /*
    /**
     * Checks if a question is equal to another question.
     * @param theQ Question to be checked.
     * @return a boolean for if the question is equal to another question.
     */
    /*
    public boolean equals(Question theQ) {
        if (this == theQ) {
            return true;
        } 
        else if (theQ == null) {
            return false;
        } 
        else if (theQ instanceof Question) {
            Question q = (Question) theQ;
            if ((q.answer == null && answer == null)
                    || (q.answer.equals(answer)) 
                    && ((q.text == null) 
                            || q.text.equals(text))) {
                return true;
            }

        }
        return false;

    }
    */
    /**
     * Converts a string to a string in a new format.
     * 
     * @return a new string
     */
    public String toString() {
        return "Question[text=" + text + ",answer=" + answer + "]";
    }

}
