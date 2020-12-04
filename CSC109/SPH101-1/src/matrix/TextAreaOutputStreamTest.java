package matrix;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

@SuppressWarnings("serial")
public class TextAreaOutputStreamTest extends JPanel {

    private JTextArea textArea = new JTextArea(15, 30);
    private TextAreaOutputStream taOutputStream = new TextAreaOutputStream(textArea, "Matrix");

    public TextAreaOutputStreamTest() {
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
        System.setOut(new PrintStream(taOutputStream));

        int timerDelay = 100;
        new Timer(timerDelay, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                String numbers = "";
                Random rand = new Random();
                for (int index = 0; index < 500; index++) {
                    Integer storedNumber = rand.nextInt(10);
                    numbers = numbers + storedNumber.toString();

                }
                System.out.println(numbers);
                numbers = "";
            }
        }).start();

    }

    private static void createAndShowGui() {
        JFrame frame = new JFrame("Matrix");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TextAreaOutputStreamTest());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }
}
