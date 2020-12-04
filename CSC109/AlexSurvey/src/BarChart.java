import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bickerstaff2
 */
public class BarChart extends Survey {

    private int b;

    public BarChart() {

    }

    public void hasWorkFrequency(File file) {

        b = 3;
        scanInput();
    }

    public void hasKidsFrequency(File file) {

        b = 4;
        scanInput();
    }

    public void hasPCFrequency(File file) {

        b = 5;
        scanInput();
    }

    public void scanInput() {

        ArrayList<String> freqVals = new ArrayList<String>();

        try {
            if (defaultName.exists()) {
                Scanner in = new Scanner(defaultName);

                
                while (in.hasNext()) {
                    in.useDelimiter(",|\n");
                    in.next();
                    freqVals.add(in.next());
                    in.next();
                    freqVals.add(in.next());
                    freqVals.add(in.next());
                    freqVals.add(in.next());

                }

                in.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(freqVals);

    }
}
