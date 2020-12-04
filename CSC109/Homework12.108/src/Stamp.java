/**
 * Stamp class represents a single postage stamp.
 * @author TomRokickiii
 * @version 0.1
 */
public class Stamp extends AbstractMeasurable {
    /**
     * The Stored Description of the Stamp.
     */
    private String description;
    /**
     * The face value of the stamp.
     */
    private double faceValue;
    /**
     * The Country the stamp is from.
     */
    private String issuingCountry;

    /**
     * Creates a Stamp Object.
     * 
     * @param aDesc
     *            Description of the Stamp.
     * @param aValue
     *            Value of the Stamp.
     * @param aCountry
     *            Country the stamp is from.
     */
    public Stamp(String aDesc, double aValue, String aCountry) {
        description = aDesc;
        faceValue = aValue;
        issuingCountry = aCountry;
    }

    /**
     * Gets the value of the stamp.
     * 
     * @return faceValue the value of the stamp.
     */
    public double getValue() {
        return faceValue;
    }

    /**
     * Gets the country the stamp is from.
     * 
     * @return issuingCountry the country the stamp is from.
     */
    public String getCountry() {
        return issuingCountry;
    }

    /**
     * 
     * Gets the Description of the Stamp.
     * 
     * @return description the description of the stamp.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Another way to get the faceValue.
     * 
     * @return faceValue the value of the stamp.
     */
    public double getMeasure() {
        return faceValue;
    }
}
