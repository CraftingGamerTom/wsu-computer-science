/**
   Describes a product with a description and a price.
*/
public class Product
{  
   /**
      Constructs a product from a description and a price.
      @param aDescription the product description
      @param aPrice the product price
   */
   public Product(String aDescription, Money aPrice)
   {  
      description = aDescription;
      price = aPrice;
   }
   
   /**
      Gets the product description.
      @return the description
   */
   public String getDescription()
   {  
      return description;
   }

   /**
      Gets the product price.
      @return the unit price
   */
   public Money getPrice()
   {
      return price;
   }
   
   private String description;
   private Money price;
}