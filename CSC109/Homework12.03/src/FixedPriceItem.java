/**
 * @version 0.1
 * @author TomRokickiii
 * A Fixed price item (Shipping, etc)
 */
public class FixedPriceItem extends Product {
    /**
     * Creates a Fixed Price Item.
     * @param item What the item is (Shipping, etc).
     * @param price Sets the price of the item
     */
    public FixedPriceItem(String item, double price) {
        super(item, price);
    }
    /**
     * Getter for Price
     * @return super.getPrice the price of the object.
     */
    public double getPrice() {
        return super.getPrice();
    }

}
