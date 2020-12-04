import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/*
You need to supply the following class in your solution:

Pair
Complete the following class in your solution:
*/
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];

   /**
      Flood fill, starting with the given row and column. 
   */
   public void floodfill(int row, int column)
   {
      Pair p = new Pair(row, column);
      
      Queue q = new PriorityQueue();
      q.add(p);
   }
   
   
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%3d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
   
   public Set<Pair> getSurrounding(Pair p) {
       Set<Pair> s = new HashSet<Pair>();
       int x = p.getxCord();
       int y = p.getyCord();
       
       ArrayList<Pair> pairs = new ArrayList<Pair>();
       
       //Add the pair to an array to track it
       //if this pair is not  in the list add it to the list
       
       //in each if statement below call a method that checks if the new pair is already in the list and if it isnt then add it
       
       
       if(x < SIZE && y+1 < SIZE && x >= 0 && y+1 >= 0) {
           Pair nSide = new Pair(x,y+1);
           s.add(nSide);
       }
       
       if(x+1 < SIZE && y < SIZE && x+1 >= 0 && y >= 0) {
           Pair eSide = new Pair(x+1,y);
           s.add(eSide);
       }
       if(x < SIZE && y-1 < SIZE && x >= 0 && y-1 >= 0) {
           Pair sSide = new Pair(x,y-1);
           s.add(sSide);
       }
       if(x-1 < SIZE && y < SIZE && x-1 >= 0 && y >= 0) {
           Pair wSide = new Pair(x-1,y);
           s.add(wSide);
       }
       
       return s;
   }
}
