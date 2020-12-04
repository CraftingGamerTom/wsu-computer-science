import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 0.1
 * @author TomRokickiii
 * Tests the invoice class.
 */
public class InvoiceTest {

    /**
     * Creates an Invoice
     * adds Products and FixedPriceItems
     * Finally, it tests formating
     */
    @Test
    public void testAll() {
        Address a = new Address(
                "Thomas Rokicki", "100 Main Street", 
                "Rutland", "Massachusetts", "01543");
        Invoice invoice = new Invoice(a);
        String constant = "                     I N V O I C E\n\nThomas Rokicki"
                + "\n100 Main Street\nRutland, Massachusetts 01543\n"
                + "\nDescription                      Price  Qty   "
                + "Total\nTestItem                        100.00    2  200.00"
                + "\nTestFixedItem                    20.00        20.00"
                + "\n\nAMOUNT DUE: $  220.0";
        invoice.add(new Product("TestItem", 100.00), 2);     
        invoice.add(new FixedPriceItem("TestFixedItem", 20.00));
        
        assertTrue(invoice.format().equals(constant));
        

    }
}
