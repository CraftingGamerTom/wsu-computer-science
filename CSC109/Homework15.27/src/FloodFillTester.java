//Use the following class as your tester class:

public class FloodFillTester
{
   public static void main(String[] args)
   {
      Grid gr = new Grid();
      gr.floodfill(3, 4);
      String[] rows = gr.toString().split("\n");
      System.out.println(rows[2]);
      System.out.println("Expected:  46 31 18  8  2  7 17 30 45 61");
      System.out.println(rows[3]);
      System.out.println("Expected:  40 25 13  5  1  3  9 19 32 47");
      System.out.println(rows[4]);
      System.out.println("Expected:  56 39 24 12  4 10 20 33 48 62");
   }
}