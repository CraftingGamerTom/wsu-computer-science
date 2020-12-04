import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class QuestionTest {

    /**
     * A test case for Set, Get, and check answer.
     */
    @Test
    public void testSetAndGetAnswer() {
        Question question0 = new Question(
                "This is question text.");
        question0.setAnswer("Correct Response.");
        String answerText = question0.getAnswer();
        assertTrue(question0.checkAnswer(answerText));
    }

    /**
     * A test case for equals, equalsQuestion, and display.
     */
    @Test
    public void testGetAndDisplayQuestion() {
        Question question0 = new Question(
                "This is question text.");
        assertTrue(question0.getQuestion().equals(
                "This is question text."));
        assertTrue(question0.equals(question0));
        String questionString = question0.toString();
        assertFalse(questionString.equals("nothing"));
        question0.display();

    }

}
