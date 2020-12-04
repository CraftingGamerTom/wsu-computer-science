import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class to test FillInQuestion Object.
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class FillInQuestionTest {

    /**
     * Tests the additional features FillInQuestion has.
     */
    @Test
    public void testSearch() {
        FillInQuestion question1 = new FillInQuestion(
                "_James Gosling_ was the inventor of Java.");
        assertTrue(question1.getAnswer().equals("James Gosling"));
    }

}
