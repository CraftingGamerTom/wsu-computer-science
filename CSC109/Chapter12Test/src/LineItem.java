/**
   Describes a quantity of an article to purchase.
*/
public class LineItem
{  
   /**
      Constructs an item from the product and quantity.
      @param aProduct the product
      @param aQuantity the item quantity
   */
   public LineItem(Product aProduct, int aQuantity)
   {  
      theProduct = aProduct;
      quantity = aQuantity;
   }
   
   /**
      Computes the total cost of this line item.
      @return the total price
   */
   public Money getTotalPrice()
   {
      Money m = theProduct.getPrice();
      for (int i = 2; i <= quantity; i++)
         m.add(theProduct.getPrice());
      return m;
   }
   
   /**
      Formats this item.
      @return a formatted string of this item
   */
   public String format()
   {  
      return String.format("%-30s%8s%5d%8s", 
            theProduct.getDescription(), theProduct.getPrice().format(), 
            quantity, getTotalPrice().format());
   }

   private int quantity;
   private Product theProduct;
}
