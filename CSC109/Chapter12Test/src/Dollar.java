/**
   Describes an amount in dollars and cents.
*/
public class Dollar implements Money
{
   /**
      Constructs an amount in the dollar currency.
      @param dollars the number of whole dollars
      @param cents the number of cents
   */        
   public Dollar(int dollars, int cents)
   {
      this.cents = 100 * dollars + cents;
   }
   
   public void add(Money other)
   {
      assert other instanceof Dollar;
      Dollar otherDollar = (Dollar) other;
      cents += otherDollar.cents;
   }
   
   public String format()
   {
      int c = Math.abs(cents);
      String r = String.format("$%d.%02d", c / 100, c % 100);
      if (cents >= 0) return r;
      else return "(" + r + ")";
   }
   
   private int cents;
}
