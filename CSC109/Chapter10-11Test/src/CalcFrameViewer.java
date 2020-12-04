import javax.swing.JFrame;

public class CalcFrameViewer
{
   public static void main(String[] s)
   {
      CalcFrame frame = new CalcFrame();
      frame.setSize(400, 75);
      frame.setTitle("CalcFrameViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}