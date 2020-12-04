import javax.swing.JFrame;

public class MenuFrameViewer
{
   public static void main(String[] args)
   {
      MenuFrame frame = new MenuFrame();
      frame.setBounds(50,50,400,200);
      frame.setTitle("MenuFrameViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}