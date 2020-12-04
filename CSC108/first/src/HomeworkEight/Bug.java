package HomeworkEight;

/*
Write a class Bug that models a bug moving along a horizontal line. The bug moves either to the right or left. Initially, the bug moves to the right, but it can turn to change its direction. In each move, its position changes by one unit in the current direction. Provide a constructor 
public Bug(int initialPosition)
and methods 
public void turn()
public void move()
public int getPosition()
Sample usage: 
Bug bugsy = new Bug(10);
bugsy.move(); // now the position is 11
bugsy.turn();
bugsy.move(); // now the position is 10 Your BugTester should construct a bug, make it move and turn a few times, and print the actual and expected position.

Complete the following class in your solution:
*/

 /**
   This class models a bug that crawls along a horizontal line.
*/
public class Bug
{
   private int position;
   private String direction = "right";
   /**
      Constructs a bug with a given position, facing right.
      @param initialPosition the initial position
   */
   public Bug(int initialPosition)
   {
      position = initialPosition;
   }
   
   /**
      Moves the bug by one unit in the current direction.
   */
   public void move()
   {
	   if (direction.equals("left")){
		   position--;
	   }
	   if (direction.equals("right")){
		   position++;
	   }
   }
   
   /**
      Flips the direction of this bug. 
   */
   public void turn()
   {
	      if(direction.equals("right")){
	    	  direction = "left";
	      }else if(direction.equals("left")){
	    	  direction = "right";
	      }      
   }
   
   /**
      Gets the current position of this bug.
      @return the position
   */
   public int getPosition()
   {
      return position;
   }
}

//Use the following class as your tester class:
/*
public class BugTester
{
	  public static void main(String[] args)
	   {
	      Bug lady = new Bug(10);
	      
	      // make the bug move and turn a few times
	      lady.move();
	      lady.move();
	      lady.move();
	      lady.move();
	      lady.move();
	      lady.move();
	      lady.turn();
	      lady.move();
	      lady.move();
	      lady.turn();
	      lady.move();
	      
	      // print the actual and expected position
	      System.out.println(lady.getPosition());
	      System.out.println("Expected: 15");
	   }
}
*/