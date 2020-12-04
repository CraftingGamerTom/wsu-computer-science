package HomeworkNine;

/**
 * A question with a text and an answer.
 */
public class Question {
	private String text;
	private String answer;

	/**
	 * Constructs a question with a given text and an empty answer.
	 * 
	 * @param questionText
	 *            the text of this question
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
	
	public String getQuestion(){
		return text;
	}
	public String getAnswer(){
		return answer;
	}
	/*
	public boolean equals(Question theQuestion){
		if (this.equals(theQuestion.text) && this.equals(theQuestion.answer)){
			return true;	
		}
			return false;
	}
	*/
    public boolean equals(Question theQ) {
        if (this == theQ) {
            return true;
        } else if (theQ == null) {
            return false;
        } else if (theQ instanceof Question) {
            Question q = (Question) theQ;
            if ((q.answer == null && answer == null) || (q.answer.equals(answer)) && ((q.text == null) || q.text.equals(text))) {
                return true;
            }

        }
        return false;

    }
	public String toString(){
		return "Question[text=" + text + ",answer=" +answer + "]";
	}


}
