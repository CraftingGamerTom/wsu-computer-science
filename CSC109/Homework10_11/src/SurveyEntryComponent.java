import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class SurveyEntryComponent extends JComponent{
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       
       JPanel panel0 = new JPanel();
       
       JButton button0 = new JButton();
       button0.setText("Im text");
       
       panel0.add(button0);
       
    }

}
