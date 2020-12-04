import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Creates a bar chart object.
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class BarChart {
    /**
     * creates a Bar chart using default constructor.
     */
    public BarChart() {
        // Default constructor that has no code.
    }

    /**
     * This creates a new array of responses from a file, displays the chart,
     * then returns the chart.
     * 
     * @param fileName
     *            Hoi Loi's file name.
     * @return displayChart Does the same shit as the hasPC.
     */
    public Frequency[] hasWorkFrequency(String fileName) {
        try {
            Frequency[] tbl = readFile(fileName, 3);
            ChartComponent cc = new ChartComponent(tbl);
            cc.createFrame("Work");
            return tbl;
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This creates a new array of responses from a file, displays the chart,
     * then returns the chart.
     * 
     * @param fileName
     *            Hoi Loi's file name.
     * @return displayChart does the same shit as the hasPCFrequency.
     */
    public Frequency[] hasKidsFrequency(String fileName) {
        try {
            Frequency[] tbl = readFile(fileName, 4);
            ChartComponent cc = new ChartComponent(tbl);
            cc.createFrame("Has Kids");
            return tbl;
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This creates a new array of responses from a file, displays the chart,
     * then returns the chart.
     * 
     * @param fileName
     *            How Loi's file name.
     * @return displayChart Will return an array of frequencies from the called
     *         method.
     */
    public Frequency[] hasPCFrequency(String fileName) {
        try {
            Frequency[] tbl = readFile(fileName, 5);
            ChartComponent cc = new ChartComponent(tbl);
            cc.createFrame("Has PC");
            return tbl;
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This reads Hoi Loi's bullshit txt file and reads it in.
     * 
     * @param fileName
     *            for Hoi Lois file
     * @return allResponses an array of responses
     */
    private Frequency[] readFile(
            String fileName, int column) throws FileNotFoundException {
        Frequency[] tbl = new Frequency[5];

        tbl[0] = new Frequency();
        tbl[0].setxLabel("<=20");

        tbl[1] = new Frequency();
        tbl[1].setxLabel("21-23");

        tbl[2] = new Frequency();
        tbl[2].setxLabel("24-26");

        tbl[3] = new Frequency();
        tbl[3].setxLabel("27-29");

        tbl[4] = new Frequency();
        tbl[4].setxLabel(">=30");
        Scanner scanner;
        try {
            File csvFile = new File(fileName);
            scanner = new Scanner(csvFile);
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] colms = line.split(",");
                String ageColm = colms[1];
                try {
                    int age = Integer.parseInt(ageColm);
                    if (age <= 20) {

                        int count = Integer.parseInt(colms[column]);
                        tbl[0].setCount(tbl[0].getCount() + count);
                        tbl[0].setTotal(tbl[0].getTotal() + 1);
                    } 
                    else if (age <= 23) {
                        int count = Integer.parseInt(colms[column]);
                        tbl[1].setCount(tbl[1].getCount() + count);
                        tbl[1].setTotal(tbl[1].getTotal() + 1);
                    } 
                    else if (age <= 26) {
                        int count = Integer.parseInt(colms[column]);
                        tbl[2].setCount(tbl[2].getCount() + count);
                        tbl[2].setTotal(tbl[2].getTotal() + 1);
                    } 
                    else if (age <= 29) {
                        int count = Integer.parseInt(colms[column]);
                        tbl[3].setCount(tbl[3].getCount() + count);
                        tbl[3].setTotal(tbl[3].getTotal() + 1);
                    } 
                    else if (age >= 30) {
                        int count = Integer.parseInt(colms[column]);
                        tbl[4].setCount(tbl[4].getCount() + count);
                        tbl[4].setTotal(tbl[4].getTotal() + 1);
                    }
                } 
                catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }
            scanner.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
        for (int i = 0; i < tbl.length; i++) {
            if (tbl[i].getTotal() != 0) {
                tbl[i].setRelative(((double) tbl[i].getCount() 
                        / (double) tbl[i].getTotal()) * 100);

            }
        }

        return tbl;

    }

    /**
     * Prints the frequency table.
     * 
     * @param frequencies
     *            an array of frequencies.
     */
    public void printArray(Frequency[] frequencies) {
        for (int index = 0; index < frequencies.length; index++) {
            System.out.print(frequencies[index].getxLabel());
            System.out.print(frequencies[index].getCount());
            System.out.print(frequencies[index].getTotal());
            System.out.print(frequencies[index].getRelative());
        }
    }
}
