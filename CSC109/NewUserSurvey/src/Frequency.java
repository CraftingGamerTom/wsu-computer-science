/**A
 * Creates a Frequency Object.
 * @author TomRokickiii
 * @version 0.1
 *
 */
public class Frequency {
    private String ageGroup;
    private int count;
    private int totalCount;
    private double theFrequency;
    /**
     * @return the ageGroup
     */
    public String getxLabel() {
        return ageGroup;
    }
    /**
     * @param setAgeGroup the ageGroup to set
     */
    public void setxLabel(String setAgeGroup) {
        this.ageGroup = setAgeGroup;
    }
    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }
    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    /**
     * @return the totalCount
     */
    public int getTotal() {
        return totalCount;
    }
    /**
     * @param setTotalCount the totalCount to set
     */
    public void setTotal(int setTotalCount) {
        this.totalCount = setTotalCount;
    }
    /**
     * @return the frequency
     */
    public double getRelative() {
        return theFrequency;
    }
    /**
     * @param relFrequency the frequency to set
     */
    public void setRelative(double relFrequency) {
        this.theFrequency = relFrequency;
    }
    /**
     * Creates a frequency object.
     * @param ageGroup string containing the age group.
     * @param count the count of people who has something.
     * @param totalCount total count of people.
     * @param relFrequency the frequency.
     */
    public Frequency(String ageGroup, 
            int count, 
            int totalCount, 
            double relFrequency) {
        this.ageGroup = ageGroup;
        this.count = count;
        this.totalCount = totalCount;
        this.theFrequency = relFrequency;
    }
    /**
     * Creates a frequency object (default)
     */
    public Frequency() {
        this.ageGroup = "";
        this.count = 0;
        this.totalCount = 0;
        this.theFrequency = 0.0;
    }
}
