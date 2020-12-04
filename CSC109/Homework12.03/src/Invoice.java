import java.util.ArrayList;

/**
 * @version 0.1
 * @author TomRokickiii
 * 
 */
public class Invoice {

    private Address address;
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<Integer> productQuantity = new ArrayList<Integer>();

    private ArrayList<FixedPriceItem> fixedPriceItemList 
        = new ArrayList<FixedPriceItem>();

    private ArrayList<Double> liPrice = new ArrayList<Double>();

    /**
     * Creates an Invoice Object
     * 
     * @param anAddress
     *            The address of the business.
     */
    public Invoice(Address anAddress) {
        this.address = anAddress;
    }

    /**
     * Adds a product to the invoice.
     * 
     * @param aProduct
     *            The product to add to the invoice.
     * @param quantity
     *            Amount of items to add
     */
    public void add(Product aProduct, int quantity) {
        productList.add(aProduct);
        productQuantity.add(quantity);
    }

    /**
     * Adds one Fixed Price Item. Keeps track of the quantity of items to
     * maintain proper index.
     * 
     * @param aFixedPriceItem
     *            The name of the
     */
    public void add(FixedPriceItem aFixedPriceItem) {
        fixedPriceItemList.add(aFixedPriceItem);
    }

    /**
     * Formats the invoice to be printed
     * 
     * @return sb.toString() Returns a String containing the formated Invoice.
     */
    public String format() {
        double total = 0.0;
        StringBuilder sb = new StringBuilder();
        sb.append("                     I N V O I C E\n\n"); //21 spaces
        sb.append(address.format());
        sb.append("\n");
        String bar1 = String.format("\n%-30s%8s%5s%8s\n", 
                "Description", "Price", "Qty", "Total");
        sb.append(bar1);
        // ------------
        liPrice.clear();
        // ------------
        for (int index = 0; index < productList.size(); index++) {
            LineItem item = new LineItem(productList.get(index), 
                    productQuantity.get(index));
            liPrice.add(item.getTotalPrice());
            sb.append(item.format());
            sb.append("\n");
        }
        for (int index = 0; index < fixedPriceItemList.size(); index++) {
            
            String itemString = String.format("%-30s%8.2f%5s%8.2f", 
                    fixedPriceItemList.get(index).getDescription(), 
                    fixedPriceItemList.get(index).getPrice(), "",
                    fixedPriceItemList.get(index).getPrice());
            sb.append(itemString);
            liPrice.add(fixedPriceItemList.get(index).getPrice());
            sb.append("\n");
        }

        for (int index = 0; index < liPrice.size(); index++) {
            total += liPrice.get(index);
        }
        sb.append("\n");
        sb.append("AMOUNT DUE: $  " + total);

        return sb.toString();
    }
}
