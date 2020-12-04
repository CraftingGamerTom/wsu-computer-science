//There is one cube on the top, four cubes in the next layer, nine cubes in the one below that, and so on. Your task is to recursively compute the volume of such a pyramid. Assume that each cube has volume 1. You know the volume of the bottom layer. Add the volume of the pyramid that is obtained by removing the bottom layer.

//Complete the following code:

public class Pyramid
{
   public Pyramid(int sideLength)
   {
      length = sideLength;
   }

   public int getVolume()
   {
      if(length == 0) {
          return 0;
      }
      else{
          Pyramid p = new Pyramid(length-1);
          return (length * length) + p.getVolume(); 
      }
   }

   private int length;

   // this method is used to check your work

   public static int check(int n)
   {
      Pyramid p = new Pyramid(n);
      return p.getVolume();
   }
}