import java.util.ArrayList;

/**
 * @author TomRokickiii
 * @version 0.1 Represents a sports team
 * 
 */

public class Team {
    /**
     * Holds the players in an ArrayList players. 
     */
    ArrayList<Player> players = new ArrayList<Player>();

    /**
     * Creates a new team.
     */
    public Team() {
        // No constructors needed.
        // team roster consisting of 6 players.

    }

    /**
     * Produces a listing of all team members and their positions.
     * 
     * @return a formatted list of all team members and their positions
     */
    public String listTeam() {
        String list = "[";
        for (int i = 0; i < players.size(); i++) {
            list += players.get(i).getName();
            list += "-";
            list += players.get(i).getPosition();
            if (i < 5) {
                list += ", ";
            }
        }
        list += "]";

        return list;
    }

    /**
     * Adds a new player to the team roster.
     * 
     * @param aPlayer
     *            a Player object
     */
    public void addPlayer(Player aPlayer) {
        if (players.size() < 6) {
            players.add(aPlayer);
        }
    }
}
