//The following class is used to check your work:

import javax.swing.JFrame;

public class HelloViewer
{
   public static void main(String[] args)
   {
      HelloFrame frame = new HelloFrame();
      frame.setTitle("HelloViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}