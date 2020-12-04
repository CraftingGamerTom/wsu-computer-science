/**
 * Describes any class whose objects can be measured, and adds a comparison.
 * @version 0.1
 * @author TomRokickiii
 */
public abstract class AbstractMeasurable implements Measurable, Comparable {
    /**
     * Computes the measure of the object.
     * 
     * @return the measure
     */
    public abstract double getMeasure();

    /**
     * Compares this measurable object against another.
     * 
     * @param otherObject
     *            another measurable object
     * @return -1 if this object measures less than the other, 
     * 0 if they measure
     *         the same, 1 otherwise.
     */
    public int compareTo(Object otherObject) {
        int number;
        if (this.getMeasure() < (
                (AbstractMeasurable) otherObject).getMeasure()) {
            number = -1;
        } 
        else if (this.getMeasure() 
                == ((AbstractMeasurable) otherObject).getMeasure()) {
            number = 0;
        } 
        else {
            number = 1;
        }
        return number;
    }
}
