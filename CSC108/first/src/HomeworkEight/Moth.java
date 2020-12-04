package HomeworkEight;

/*
Implement a class Moth that models a moth flying across a straight line. The moth has a position, the distance from a fixed origin. When the moth moves toward a point of light, its new position is halfway between its old position and the position of the light source. Supply a constructor 
public Moth(double initialPosition)
and methods 
public void moveToLight(double lightPosition)
public void getPosition()
Your MothTester should construct a moth, move it toward a couple of light sources, and check that the moth's position is as expected.

You need to supply the following class in your solution:

Moth
Use the following class as your tester class:
*/

public class Moth
{

   
   private double position;
   
   public Moth(double initialPosition){
	   
	   position = initialPosition;
   }
   
   public void moveToLight(double lightPosition){
	   position += ((lightPosition-position)/2);
   }
   
   public double getPosition(){
	   return position;
   }
   
}

