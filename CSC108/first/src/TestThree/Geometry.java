package TestThree;

/*
Given the corner points of a triangle (x1, y1), (x2, y2), (x3, y3), compute the area.

Hint: The area of the triangle with corner points (0, 0), (x1, y1), and (x2, y2) is |x1 · y2 - x2 · y1| / 2.

Complete the following code:
*/


public class Geometry
{

   public static double triangleArea(double x1, double y1,
      double x2, double y2, double x3, double y3)
   {
      double answer = 0;
      
      //Shifts all points by x3 and y3
      x1 = x1 - x3;
      y1 = y1 - y3;
      x2 = x2 - x3;
      y2 = y2 - y3;
      
      answer = Math.abs(((x1 * y2) - (x2 * y1)) / 2);
      
      return answer;
   }
}