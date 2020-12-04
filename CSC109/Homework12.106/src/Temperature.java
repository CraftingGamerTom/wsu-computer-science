/**
 * @author TomRokickiii
 * @version 0.1 Temperature class represents a specific temperature value in a
 *          specific scale.
 */

class Temperature {
    private String scale;
    private double value;
    // private static Converter toCelsius = new Converter(9.0 / 5, -32);
    private static Converter toFahrenheit = new Converter(9.0 / 5, 32);

    /**
     * Constructs a temperature.
     * 
     * @param aValue
     *            the temperature value in the given scale
     * @param aScale
     *            "C" for Celsius, "F" for Fahrenheit
     */
    public Temperature(double aValue, String aScale) {
        value = aValue;
        scale = aScale;
    }

    /**
     * Gets the Temperature Scale (Celsius or Fahrenheit)
     * 
     * @return scale a String containing 'C' or 'F'
     */
    public String getScale() {
        return scale;
    }

    /**
     * Gets the Temperature Value - disregards the scale.
     * 
     * @return value a double containing the Temperature
     */
    public double getValue() {
        return value;
    }

    /**
     * Compares two temparatures.
     * 
     * @param other
     *            another Tempeature object to be compared with this one
     * @return -1 if the other object's value is larger than this object's value
     *         0 if the values are equal 1 if the other object's value is
     *         smaller than this object's value.
     */
    public int compareTo(Temperature other) {
        double temp1 = this.getValue();
        double temp2 = other.getValue();
        int comparison;
        if (!this.getScale().equals("F")) {
            temp1 = toFahrenheit.convert(this.getValue());
        }
        if (!other.getScale().equals("F")) {
            temp2 = toFahrenheit.convert(other.getValue());
        }

        if (temp2 > temp1) {
            comparison = -1;
        } 
        else if (temp2 == temp1) {
            comparison = 0;
        } 
        else {
            comparison = 1;
        }
        return comparison;
    }
}
