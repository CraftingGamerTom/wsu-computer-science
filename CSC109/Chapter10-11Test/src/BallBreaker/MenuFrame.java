package BallBreaker;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame
{
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenu editMenu;
   private JMenu aboutMenu;
   private JMenuItem item1;
   private JMenuItem item2;
   private JMenuItem item3;
   private JMenuItem item4;

   public MenuFrame()
   {
      menuBar = new JMenuBar();
      item1 = new JMenuItem("Open File"); // put in File menu
      item2 = new JMenuItem("Exit"); // put in File menu
      item3 = new JMenuItem("Search"); // put in Edit menu
      item4 = new JMenuItem("About MenuFrame"); // put in About menu
      
      fileMenu = new JMenu("File");
      editMenu = new JMenu("Edit");
      aboutMenu = new JMenu("About");
      
      fileMenu.add(item1);
      fileMenu.add(item2);
      editMenu.add(item3);
      aboutMenu.add(item4);
      
      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      menuBar.add(aboutMenu);
      
      setJMenuBar(menuBar);
      
   }
}
