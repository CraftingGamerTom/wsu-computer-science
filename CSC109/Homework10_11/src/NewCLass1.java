import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewCLass1 extends JFrame{
    public NewCLass1(){
        JButton button = new JButton();
        JPanel panel = new JPanel();
        panel.add(button);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
