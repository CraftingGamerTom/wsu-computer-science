package matrixTest;

import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class MatrixComponent extends JComponent {

    int xCord = 0;
    int yCord = 0;
    String numbers = "";
    Random rand = new Random();
    String[] numberArray = new String[15];
    int[] YArray = new int[15];
    String numberHold;
    
    String numberHold1;
    String numberHold2;
    
    public MatrixComponent() {

    }

    public void paintComponent(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));

        //Sets the Y-Cords
        YArray[0] = 0;
        for (int index = 1; index < 15; index++) {
            YArray[index] = YArray[index - 1] + 20;
        }

        // Builds a string of random numbers after reseting the value
        numberArray[0] = "";
        for (int index2 = 0; index2 < 30; index2++) {
            Integer storedNumber = rand.nextInt(10);
            numberArray[0] += storedNumber.toString();
        }
        // Grabs the bottom numbers to store them
        // Moves all numbers up one index
        // Paints them

        String numberHold = numberArray[0];
        for (int index = 1; index < 13; index++) {
            String numberHold1 = numberArray[index];
            numberArray[index] = numberHold;
            numberHold = numberHold1;

            if ((index - 1) >= 0 && numberArray[index - 1] != null) {
                numberHold = numberArray[index - 1];
            }
            numberArray[index] = numberHold;

            if (numberArray[index] != null) {
                g.drawString(numberArray[index], xCord, YArray[index]);
            }
        }
        System.out.println(numberHold);
    }
}
