/**
 * @author TomRokickiii
 * @version 0.1
 * Computes the maximum of a set of data values.
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
    public int getSum() {
        int sumSearch = 0;
        if (first > last) {
            return sumSearch;
        }

        sumSearch = values[first] + values[last];
        DataSet data = new DataSet(values, first + 1, last - 1);
        int sumReturned = data.getSum();

        sumSearch += sumReturned;

        return sumSearch;

    }

}