import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame
{
    
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenu editMenu;
   private JMenu aboutMenu;
   
   private JMenuItem openFileItem;
   private JMenuItem backgroundChange;
   
   public MenuFrame()
   {
      menuBar = new JMenuBar();
      fileMenu = new JMenu("File");
      fileMenu.setMnemonic('F');
      editMenu = new JMenu("Edit");
      aboutMenu = new JMenu("About");
      openFileItem = new JMenuItem("Open File");
      backgroundChange = new JMenuItem("Turn Background Yellow");
      
      ChangeBackground cb = new ChangeBackground();
      backgroundChange.addActionListener(cb);
      
      fileMenu.add(openFileItem);
      fileMenu.add(backgroundChange);
      
      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      menuBar.add(aboutMenu);
   }
   
   class ChangeBackground implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        getContentPane().setBackground(Color.YELLOW);
        
    }
       
   }
}