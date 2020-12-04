/**
   This interface describes money in some currency.
*/
public interface Money
{
   /**
      Adds an amount of money to this money instance.
      @param the other money instance      
      Precondition: this amount and other belong to the same currency
   */   
   void add(Money other);
   
   /**
      Formats this money instance.
      @return a formatted string describing the value of this money instance.
   */
   String format();
}