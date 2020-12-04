import java.awt.Color;

import javax.swing.JFrame;

public class MyJFrame extends JFrame{

    final int FRAME_WIDTH =1000;
    final int FRAME_HEIGHT = 800;
    
    public MyJFrame(){

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Student Survey");
        getContentPane().setBackground(Color.GRAY);
        getRootPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SurveyEntryComponent ageEntry = new SurveyEntryComponent();
        add(ageEntry);

        setVisible(true);
    }

}
