import java.util.ArrayList;

public class Frequency {

    // Proper way.
    private String[] ageGroup = new String[5];
    private int[] count = new int[5];
    private int[] totalCount = new int[5];
    private double[] frequency = new double[5];

    // Hoi Loi's stupid way.
    private String professorAgeGroup;
    private int professorCount;
    private int professorTotalCount;
    private double professorFrequency;

    private ArrayList<Response> allResponses;
    private int chartType;

    /**
     * Grabs all the Responses for Reference, and uses the chart type to
     * determine what data to track.
     * 
     * @param allResponses
     *            ArrayList of All Responses.
     * @param chartType
     */
    Frequency(ArrayList<Response> allResponses, int chartType) {
        this.allResponses = allResponses;
        this.chartType = chartType;
        setData(this.chartType);
        ageGroup[0] = "<=20";
        ageGroup[1] = "21-23";
        ageGroup[2] = "24-26";
        ageGroup[3] = "27-29";
        ageGroup[4] = ">=30";
    }

    /**
     * This is a non-default method the instructions asked me to make. Currently
     * does nothing.
     * 
     * @param ageGroup
     *            the age group.
     * @param count
     *            how many have *something*.
     * @param totalCount
     *            total count of people from the defined age group.
     * @param frequency
     *            The percentage of how many people have something from the
     *            desired age group.
     */
    public Frequency(String ageGroup, int count, int totalCount, double frequency) {
        setProfessorAgeGroup(ageGroup);
        setProfessorCount(count);
        setProfessorTotalCount(totalCount);
        setProfessorFrequency(frequency);
    }

    private void setProfessorCount(int count) {
        this.professorCount = count;
        
    }

    private void setProfessorAgeGroup(String ageGroup) {
        this.professorAgeGroup = ageGroup;
        
    }

    private void setProfessorFrequency(double frequency) {
        this.professorFrequency = frequency;
        
    }

    private void setProfessorTotalCount(int totalCount) {
        this.professorTotalCount = totalCount;
        
    }
    public int getCount() {
        return professorCount;
    }
    public int getTotal() {
        return professorTotalCount;
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
            } else if (chartType == 1) {
                hasWhatever = currentResponse.getHasChildren();
            } else if (chartType == 2) {
                hasWhatever = currentResponse.getHasPC();
            } else {
                hasWhatever = 0;
                System.out.println("Chart Type Error.");
            }
            // Records data based on Age Group.
            if (age <= 20) {
                count[0] += hasWhatever;
                totalCount[0]++;
            }
            if (age > 20 && age < 24) {
                count[1] += hasWhatever;
                totalCount[1]++;
            }
            if (age > 23 && age < 27) {
                count[2] += hasWhatever;
                totalCount[2]++;
            }
            if (age > 26 && age < 30) {
                count[3] += hasWhatever;
                totalCount[3]++;
            }
            if (age >= 30) {
                count[4] += hasWhatever;
                totalCount[4]++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(count[i] + " / " + totalCount[i]);
        }
        for (int index = 0; index < 5; index++) {
            if (!(totalCount[0] == 0)) {
                frequency[index] += ((double) (count[index]) / (double) (totalCount[index])) * 100;
            } else {
                frequency[index] += (double) 0 * 100;
            }
        }

    }

    /**
     * Getter method to be called when the chart is drawn.
     * 
     * @return frequency The frequency data stored in an array based on age
     *         groups.
     */
    public double[] getFrequency() {
        return frequency;
    }
    

}
