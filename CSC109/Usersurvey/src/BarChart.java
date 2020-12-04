import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Creates a bar chart object.
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class BarChart {

    private int graphFrameWidth = 500;
    private int graphFrameHeight = 600;
    /**
     * creates a Bar chart using default constructor. 
     */
    public BarChart() {
        //Default constructor that has no code 
        //because having a barChart class is stupid as hell.
    }
    /**
     * This creates a new array of responses from a file, 
     * displays the chart, then returns the chart.
     * @param fileName Hoi Loi's file name.
     * @return displayChart Does the same shit as the hasPC.
     */
    public Frequency[] hasWorkFrequency(String fileName) {
        ArrayList<Response> allResponses = readFile(fileName);
        return displayChart("Work", allResponses, 0);
    }
    /**
     * This creates a new array of responses from a file, 
     * displays the chart, then returns the chart.
     * @param fileName Hoi Loi's file name.
     * @return displayChart does the same shit as the hasPCFrequency.
     */
    public Frequency[] hasKidsFrequency(String fileName) {
        ArrayList<Response> allResponses = readFile(fileName);
        return displayChart("Have Kids", allResponses, 1);
    }
    /**
     * This creates a new array of responses from a file, 
     * displays the chart, then returns the chart.
     * @param fileName How Loi's file name.
     * @return displayChart Will return an array 
     * of frequencies from the called method.
     */
    public Frequency[] hasPCFrequency(String fileName) {
        ArrayList<Response> allResponses = readFile(fileName);
        return displayChart("Have PC", allResponses, 2);
    }
    /**
     * Creates the chart.
     * @param f a double 
     * @return chart a JComponent for chart.
     */
    public JComponent getJComponent(double[] f) {
        JComponent chart = new ChartComponent(f);
        return chart;
    }
    /**
     * This reads Hoi Loi's bullshit txt file and reads it in. 
     * @param fileName for Hoi Lois file
     * @return allResponses an array of responses
     */
    private ArrayList<Response> readFile(String fileName) {
        File csvFile = new File(fileName);
        ArrayList<Response> allResponses = new ArrayList<Response>();
        Scanner scanner;
        try {
            scanner = new Scanner(csvFile);
            scanner.useDelimiter(",|\n");
            scanner.nextLine();
            while (scanner.hasNext()) {
                Response theResponse = new Response(
                        scanner.next(), //College
                        scanner.nextInt(), // Age
                        scanner.next(), // Gender
                        scanner.nextInt(), // Has Job
                        scanner.nextInt(), // Has Children
                        scanner.nextInt()); // Has PC
                allResponses.add(theResponse);

            }
            scanner.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return allResponses;
    }
    /**
     * Displays the chart, creates an array of frequencies
     * @param title The name for the window created.
     * @param allResponses ArrayList of Responses
     * @param chartType PC, Work, or Kids.
     * @return frequencies the array of frequencies
     */
    private Frequency[] displayChart(
            String title, 
            ArrayList<Response> allResponses, 
            int chartType) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.setSize(graphFrameWidth, graphFrameHeight);
        jframe.setTitle(title);

        FrequencyTable pcTable = new FrequencyTable(
                allResponses, chartType);
        JComponent chart = new ChartComponent(
                pcTable.getFrequency());
        Frequency[] frequencies = pcTable.getFrequencyTable();

        jframe.add(chart);

        jframe.setVisible(true);
        return frequencies;
    }
    /**
     * Prints the frequency table.
     * @param frequencies an array of frequencies.
     */
    public void printArray(Frequency[] frequencies) {
        for (int index = 0; index < 5; index++) {
            System.out.print("[");
            System.out.print(frequencies[index].getxLabel());
            System.out.print(", ");
            System.out.print(frequencies[index].getCount());
            System.out.print(", ");
            System.out.print(frequencies[index].getTotal());
            System.out.print(", ");
            System.out.print(frequencies[index].getRelative());
            System.out.println("]");
        }
    }
}
