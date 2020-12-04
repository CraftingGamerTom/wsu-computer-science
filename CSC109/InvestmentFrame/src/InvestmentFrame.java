import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InvestmentFrame extends JFrame {
    private double balance;
    private JButton button;
    private JLabel label;
    private JTextField txtInt;
    private double intRate;
    
    public void addInterest(){
        balance = balance + intRate * balance;
    }
    public InvestmentFrame() 
    {
        balance = 10000;
        button = new JButton("Button");
        label = new JLabel("Balance: 0");
        txtInt = new JTextField(10);
        intRate = 0;
        

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String txt = txtInt.getText();
                try{
                    intRate = Double.parseDouble(txt);
                    addInterest();
                    label.setText("Balance " + balance);
                }catch(Exception ex){
                    label.setText("Please enter a number");
                    txtInt.setText("");
                }

            }
        });
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        panel.add(txtInt);
        add(panel);
    }
    
    public static void main(String args[])
    {
        InvestmentFrame frame = new InvestmentFrame();
        frame.setVisible(true);
        frame.setSize(1000, 800);
    }

}
