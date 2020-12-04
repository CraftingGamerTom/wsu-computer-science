/**
 * Class for a FillInQuestion
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class FillInQuestion extends Question {

    /**
     * Creates a FillinQuestion
     * 
     * @param questionText The answer and question to be split and sorted.
     */
    public FillInQuestion(String questionText) {
        super(questionText.replaceAll("\\_.*_", "_____"));

        super.setAnswer(search(questionText));
    }

    /**
     * Looks for the answer in the string and returns it.
     * 
     * @param questionText
     * @return
     */
    private String search(String questionText) {
        String answer = "";

        int answerStart = -1;
        int answerEnd = -1;

        for (int i = 0; i < questionText.length(); i++) {
            if (questionText.charAt(i) == '_') {
                answerStart = i;
                for (int j = i + 1; j < questionText.length(); j++) {
                    if (questionText.charAt(j) == '_') {
                        answerEnd = j;
                        break;
                    }
                }
                break;
            }
        }

        answer = questionText.substring(
                answerStart, answerEnd).replaceAll("\\_", "");

        return answer;
    }

}
