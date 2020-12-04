/**
 * @version 0.1
 * @author TomRokickiii A Sentence Object. Stores a string and can return the
 *         string in reverse.
 */
public class Sentence {
    /**
     * A String
     */
    private String sentenceString;
    /**
     * The stored product of the reverse method.
     */
    private String reverseSentence = "";
    /**
     * Tracks whether the string has been reversed or not.
     */
    private boolean didReverse = false;

    /**
     * Creates a sentence object.
     * 
     * @param sentenceString the string to be stored.
     */
    public Sentence(String sentenceString) {
        this.sentenceString = sentenceString;
    }

    /**
     * Reverses the String. (Currently will not know if the string was reversed
     * twice to call the proper return route in getText.
     */
    public void reverse() {
        didReverse = true;
        reverseSentence = sentenceString.charAt(0) + reverseSentence;
        sentenceString = sentenceString.substring(1, sentenceString.length());
        if (sentenceString.length() > 0) {
            reverse();
        } 
        else {
            return;
        }

    }

    /**
     * Returns the text. There is a bug where if the string is reversed an odd
     * amount of times it does not know to go through the else statement.
     * 
     * @return reverseSentence if the reverse method has been called. returns
     *         sentenceString if the reverse method has not been called.
     */
    public String getText() {
        if (didReverse) {
            return reverseSentence;
        } 
        else {
            return sentenceString;
        }

    }
}
