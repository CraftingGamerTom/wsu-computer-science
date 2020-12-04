import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests the Team Object Class.
 * @author TomRokickiii
 * @version 0.1
 */
public class TeamTest {

    /**
     * Creates a new Team object then tests all the methods.
     */
    @Test
    public void test() {
        Team t = new Team();
        
        Player p1 = new Player("John", "Center");
        
        //Adds 6 players
        t.addPlayer(p1);
        t.addPlayer(p1);
        t.addPlayer(p1);
        t.addPlayer(p1);
        t.addPlayer(p1);
        t.addPlayer(p1);
        t.addPlayer(p1);
        
        assertTrue(t.listTeam().equals("[John-Center, "
                + "John-Center, John-Center, "
                + "John-Center, John-Center, John-Center]"));
    }

}
