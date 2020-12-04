/**
 * @version 0.1
 * @author TomRokickiii 
 * A Player Object. 
 * Contains the players name and which
 *         position they play.
 */
public class Player {
    private String name;
    private String position;

    /**
     * Creates a player object.
     * 
     * @param aName
     *            The name of the player
     * @param aPosition
     *            THe position the player plays
     */
    public Player(String aName, String aPosition) {
        name = aName;
        position = aPosition;
    }

    /**
     * Gets the players name
     * 
     * @return name a String containing the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the position of the player
     * 
     * @return position a String containing the player position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Returns a Formated String with the player's name and position
     * 
     * @return name + position (Eg. Tony-Center).
     */
    public String toString() {
        return name + "-" + position;
    }
}
