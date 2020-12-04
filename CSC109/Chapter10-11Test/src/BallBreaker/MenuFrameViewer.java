package BallBreaker;

import javax.swing.JFrame;

public class MenuFrameViewer
{
   public static void main(String[] args)
   {
      MenuFrame frame = new MenuFrame();
      frame.setTitle("MenuFrameViewer");
      frame.setBounds(100,100, 300,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}