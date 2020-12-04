import java.util.LinkedList;
import java.util.Queue;

/*
You need to supply the following class in your solution

Pair
Complete the following class in your solution:
*/
/**
 * @version 0.1
 * @author TomRokickiii 
 * This is the Grid Class
 */
public class Grid {
    private static final int SIZE = 10;
    /**
     * provided array
     */
    int[][] pixels = new int[SIZE][SIZE];

    /**
     * Flood fill, starting with the given row and column.
     * @param row the row
     * @param column the column
     */
    public void floodfill(int row, int column) {
        Queue<Pair> q = new LinkedList<>();
        int start = 0;
        int index = 1;
        // Exit statement
        if (pixels[row][column] != start) {
            return;
        }
        q.add(new Pair(column, row));
        while (!q.isEmpty()) {
            Pair p = q.remove();
            if (pixels[p.getyCord()][p.getxCord()] == start) {
                pixels[p.getyCord()][p.getxCord()] = index;
                index++;

                // search and destroy >:D

                if (p.getyCord() > 0) {
                    q.add(new Pair(p.getxCord(), p.getyCord() - 1));
                }
                if (p.getxCord() < SIZE - 1) {
                    q.add(new Pair(p.getxCord() + 1, p.getyCord()));
                }
                if (p.getyCord() < SIZE - 1) {
                    q.add(new Pair(p.getxCord(), p.getyCord() + 1));
                }
                if (p.getxCord() > 0) {
                    q.add(new Pair(p.getxCord() - 1, p.getyCord()));
                }
            }
        }
    }

    /**
     * Converts to string.
     * 
     * @return r a string
     */
    public String toString() {
        String r = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                r = r + String.format("%3d", pixels[i][j]);
            }
            r = r + "\n";
        }
        return r;
    }
}
