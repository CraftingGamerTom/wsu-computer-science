
/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test Class for MultiChoiceQuestion
 * 
 * @author TomRokickiii
 * @version 0.1
 */
public class MultiChoiceQuestionTest {

    private static MultiChoiceQuestion question0;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        question0 = new MultiChoiceQuestion("Which countries are in Africa?");
        question0.addChoice("Ghana", true);
        question0.addChoice("Canada", false);
        question0.addChoice("Benin", true);
        question0.addChoice("Denmark", false);
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        // Not sure is I need to keep this to be honest.
    }

    /**
     * Test method for addChoice
     */
    @Test
    public void testAddChoice() {
        MultiChoiceQuestion question1 
            = new MultiChoiceQuestion("instance Test Question");
        question1.addChoice("test1", true);
        question1.addChoice("test2", false);
        assertTrue(question1.checkAnswer("1"));
        assertFalse(question1.checkAnswer("2"));
        assertFalse(question1.checkAnswer("12"));
    }

    /**
     * Test method for
     * {@link chapter9_1_HW.MultiChoiceQuestion#checkAnswer(java.lang.String)}.
     */
    @Test
    public void testCheckAnswerMultiSpace() {
        /*
         * System.out.println("multiCheckAnswer"); String correctResponse = "";
         * Question instance = new Question("This is a question?");
         * instance.setAnswer(correctResponse); boolean answer =
         * instance.checkAnswer(correctResponse); assertTrue(answer);
         * correctResponse = "answer"; instance.setAnswer(correctResponse);
         * answer = instance.checkAnswer(""); assertFalse(answer);
         */
        System.out.println("multiCheckAnswer");
        System.out.println("+display check");
        question0.display();
        System.out.println("+sets answer");
        question0.setAnswer("setsAnswer");
        assertFalse(question0.checkAnswer("1 2"));
        assertFalse(question0.checkAnswer("12"));
        assertTrue(question0.checkAnswer("13"));
        

    }

    /**
     * Test method for checking Answer.
     * 
     */
    @Test
    public void testCheckAnswerMultiNoSpace() {
        System.out.println("checkAnswerNoSpace");
        assertTrue(question0.checkAnswer("13"));
    }

    /**
     * Test method for checking mmethod.
     * 
     */
    @Test
    public void testCheckAnswerMultiSpaceBad() {
        System.out.println("checkAnswerSpaceBad");
        assertFalse(question0.checkAnswer("1 2"));
    }

    /**
     * Test method for question text
     * 
     */
    @Test
    public void testQuestionText() {
        System.out.println("getText");
        assertTrue("Which countries are in Africa?".equals(
                question0.getQuestionText()));
        assertFalse("".equals(question0.getQuestionText()));
    }

}
