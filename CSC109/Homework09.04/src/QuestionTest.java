
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author TomRokickiii
 * @version 0.1
 */
public class QuestionTest {
    /**
     * Question object used throughout test
     */
    static Question testQuestion;

    /**
     * Sets up Class
     * @throws Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        testQuestion = new Question("This is a question String?");
    }

    /**
     * Test method for {@link Question#setAnswer(java.lang.String)}.
     */
    @Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        String correctResponse = "";
        Question instance = new Question("This is a question?");
        instance.setAnswer(correctResponse);
        boolean answer = instance.checkAnswer(correctResponse);
        assertTrue(answer);
        correctResponse = "answer";
        instance.setAnswer(correctResponse);
        answer = instance.checkAnswer("");
        assertFalse(answer);
    }

    /**
     * Test method for {@link Question#checkAnswer(java.lang.String)}.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        String correctResponse = "";
        Question instance = new Question("This is a question?");
        instance.setAnswer(correctResponse);
        boolean answer = instance.checkAnswer(correctResponse);
        assertTrue(answer);
        correctResponse = "answer";
        instance.setAnswer(correctResponse);
        answer = instance.checkAnswer("");
        assertFalse(answer);
        System.out.println("display");
        testQuestion.display();
    }

}
