/**
 * @version 0.1
 * @author TomRokickiii The Pair Class.
 */
public class Pair {

    private int xCord;
    private int yCord;

    /**
     * Creates a Pair
     * 
     * @param x
     *            the c Cord
     * @param y
     *            the y Cord
     */
    public Pair(int x, int y) {
        setxCord(x);
        setyCord(y);
    }

    /**
     * getter
     * 
     * @return the yCord
     */
    public int getyCord() {
        return yCord;
    }

    /**
     * @param yCord
     *            the yCord to set
     */
    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

    /**
     * getter
     * 
     * @return the xCord
     */
    public int getxCord() {
        return xCord;
    }

    /**
     * @param xCord
     *            the xCord to set
     */
    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

}
