import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame
{
   private JTextField input;
   private JLabel output;
   private JComboBox function;

   public CalcFrame()
   {
      function = new JComboBox();
      // Your work here
      input = new JTextField(10);
      input.setText("10");
      output = new JLabel("Select a function");
      setLayout(new FlowLayout());
      
      function.addItem("abs");
      function.addItem("sqrt");
      function.addItem("log10");
      
      DoMath dm = new DoMath();
      function.addActionListener(dm);
      
      add(function);
      add(input);
      add(output);
   }
   public class DoMath implements ActionListener {
       int index;
       
       public void actionPerformed(ActionEvent e) {
           index = function.getSelectedIndex();
           output.setText(doTheMathWork(index).toString());
           System.out.println(index);
       }
   }
   
   public Double doTheMathWork(int index) {
       Double output = 0.0;
       String initialInput = (input.getText());
       Double dub = Double.parseDouble(initialInput);
       
       if (index == 0) {
           output = Math.abs(dub);
       }
       if (index == 1) {
           output = Math.sqrt(dub);
       }
       if (index == 2) {
           output = Math.log10(dub);
       }

       
       return output;
   }
}