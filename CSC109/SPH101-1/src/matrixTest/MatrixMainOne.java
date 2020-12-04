package matrixTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MatrixMainOne {
    private static MatrixComponent mc = new MatrixComponent();
    static int delay = 1000; //Milliseconds
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setTitle("Matrix Program");
        frame.add(mc);
        
        ActionListener refresh  = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                mc.repaint();
            }
        };
        new Timer(delay, refresh).start();
        
        frame.setVisible(true);

    }
}
