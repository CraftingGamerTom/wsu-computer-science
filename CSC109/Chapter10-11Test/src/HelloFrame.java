import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloFrame extends JFrame
{
   public HelloFrame()
   {
      comboBox = new JComboBox();
      comboBox.addItem("public");
      comboBox.addItem("static");
      comboBox.addItem("void");
      comboBox.setEditable(true);
      
      JPanel panel = new JPanel();
      panel.add(comboBox);
      
      ComboBoxListener cbl = new ComboBoxListener();
      comboBox.addActionListener(cbl);
      
      label = new JLabel("Hello, World!");

      add(panel, BorderLayout.NORTH);
      add(label, BorderLayout.SOUTH);
      pack();      
   }
   
   private class ComboBoxListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         label.setText("Hello, " + comboBox.getSelectedItem().toString() + " World!"); 
      }
   }
   
   private JComboBox comboBox;
   private JLabel label;
}
