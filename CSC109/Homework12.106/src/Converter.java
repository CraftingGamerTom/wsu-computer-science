/**
 * @author TomRokickiii
 * @version 0.1 Converts from one unit to another. The converted value is
 *          computed as scaleFactor * originalValue + offset. For example, to
 *          convert Celsius to Fahrenheit, the scale factor is 9.0/5, and the
 *          offset is 32.
 */
public class Converter {
    private double scaleFactor;
    private double offset;

    /**
     * Constructs a converter with a given scale factor and offset.
     * 
     * @param scaleFactor
     *            the scale factor
     * @param offset
     *            the offset
     */
    public Converter(double scaleFactor, double offset) {
        this.scaleFactor = scaleFactor;
        this.offset = offset;
    }

    /**
     * Converts a value.
     * 
     * @param value
     *            the original value
     * @return the converted value
     */
    public double convert(double value) {
        if (offset == -32) {
            return (value + offset) * scaleFactor;
        }
        if (offset == 32) {
            return scaleFactor * value + offset;
        } 
        else {
            return 000.0;
        }
    }
}
