/**
 * Computes the maximum of a set of data values.
 * @version 0.1
 * @author TomRokickiii
 */
public class DataSet {
    private int[] values;
    private int first;
    private int last;

    /**
     * Constructs a DataSet object.
     * 
     * @param values
     *            the data values
     * @param first
     *            the first value in the data set
     * @param last
     *            the last value in the data set
     */
    public DataSet(int[] values, int first, int last) {
        this.values = values;
        this.first = first;
        this.last = last;
    }

    /**
     * Gets the maximum in the set of data values
     * 
     * @return the maximum value in the set
     */
    public int getMaximum() {
      //Will be wrong if max number is smaller than -999999999.
        int maxSearch = -999999999; 
        if (first > last) {
            return maxSearch;
        }

        if (values[first] < values[last]) {
            maxSearch = values[last];
        } 
        else {
            maxSearch = values[first];
        }
        DataSet data = new DataSet(values, first + 1, last - 1);
        int maxReturned = data.getMaximum();

        if (maxSearch < maxReturned) {
            maxSearch = maxReturned;
        }
        
        return maxSearch;

    }

}