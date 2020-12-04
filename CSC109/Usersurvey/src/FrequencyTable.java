import java.util.ArrayList;
/**
 * Creates a frequencyTable object.
 * @author TomRokickiii
 * @version 0.1
 */
public class FrequencyTable {

    // Proper way.
    private Frequency [] frequency = null;

    private ArrayList<Response> allResponses;

    /**
     * default constructor
     */
    FrequencyTable() {
        initializeTable();
    }

    /**
     * initialize the table elements
     */
    private void initializeTable() {
        frequency = new Frequency[5];
        frequency[0] = new Frequency();
        frequency[1] = new Frequency();
        frequency[2] = new Frequency();
        frequency[3] = new Frequency();
        frequency[4] = new Frequency();
    }

    /**
     * Grabs all the Responses for Reference, and uses the chart type to
     * determine what data to track.
     * 
     * @param allTheResponses
     *            ArrayList of All Responses.
     * @param theChartType the type of chart to be drawn.
     */
    FrequencyTable(ArrayList<Response> allTheResponses, int theChartType) {
        initializeTable();
        this.allResponses = allTheResponses;
        setData(theChartType);
        frequency[0].setxLabel("<=20");
        frequency[1].setxLabel("21-23");
        frequency[2].setxLabel("24-26");
        frequency[3].setxLabel("27-29");
        frequency[4].setxLabel(">=30");
    }

    /**
     * Counts all the data to calculate the frequencies. It saves it in an array
     * based on age.
     * 
     * @param chartType
     *            The desired type of chart. (0 = HasJob, 1 = HasChildren, 2 =
     *            HasPC.
     */
    public void setData(int chartType) {
        for (int index = 0; index < allResponses.size(); index++) {
            Response currentResponse = allResponses.get(index);
            // Decides which type of data to record.
            int hasWhatever;
            int age = currentResponse.getAgeInput();
            if (chartType == 0) {
                hasWhatever = currentResponse.getHasJob();
            } 
            else if (chartType == 1) {
                hasWhatever = currentResponse.getHasChildren();
            } 
            else if (chartType == 2) {
                hasWhatever = currentResponse.getHasPC();
            } 
            else {
                hasWhatever = 0;
                System.out.println("Chart Type Error.");
            }
            // Records data based on Age Group.
            if (age <= 20) {
                frequency[0].setCount(
                        frequency[0].getCount() + hasWhatever);
                frequency[0].setTotal(
                        frequency[0].getTotal() + hasWhatever);
            }
            if (age > 20 && age < 24) {
                frequency[1].setCount(
                        frequency[1].getCount() + hasWhatever);
                frequency[1].setTotal(
                        frequency[1].getTotal() + hasWhatever);
            }
            if (age > 23 && age < 27) {
                frequency[2].setCount(
                        frequency[2].getCount() + hasWhatever);
                frequency[2].setTotal(
                        frequency[2].getTotal() + hasWhatever);
            }
            if (age > 26 && age < 30) {
                frequency[3].setCount(
                        frequency[3].getCount() + hasWhatever);
                frequency[3].setTotal(
                        frequency[3].getTotal() + hasWhatever);
            }
            if (age >= 30) {
                frequency[4].setCount(
                        frequency[4].getCount() + hasWhatever);
                frequency[4].setTotal(
                        frequency[4].getTotal() + hasWhatever);
            }
        }

        // update table with frequencies
        for (int index = 0; index < 5; index++) {
            if (frequency[index].getTotal() == 0) {
                double add = ((double) (
                        frequency[index].getCount()) / (double) (
                                frequency[index].getTotal())) * 100;
                frequency[index].setRelative(
                        frequency[index].getRelative() + add);
            }
        }

    }

    /**
     * Getter method to be called when the chart is drawn.
     * 
     * @return table The frequency data stored in an array based on age
     *         groups.
     */
    public double[] getFrequency() {
        double[] table = new double[5];
        for (int index = 0; index < 5; index++) {
            table[index] = frequency[index].getRelative();
        }
        return table;
    }
    /**
     * gets FrequencyTable
     * @return frequency array of Frequencies
     */
    public Frequency [] getFrequencyTable() {
        return frequency;
    }
}
