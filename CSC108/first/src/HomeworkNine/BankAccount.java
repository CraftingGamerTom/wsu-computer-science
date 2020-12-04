package HomeworkNine;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;


public class BankAccount implements Formattable{

	private Double balance;
	
	/**
	 * Creates a New Bank Account Balance
	 * @param balance
	 */
	public BankAccount(double balance){
		this.balance = balance;
	}
	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		// TODO Auto-generated method stub
		String balanceString = Double.toString(balance);
		
		for (int i = balanceString.length(); i < width; i++){
			balanceString = " " + balanceString;
		}
		
		 Appendable a = formatter.out();
		// Appendable is another interface with a method 
		    try {
				a.append(balanceString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	   public static void main(String[] args)
	   {
	      BankAccount account1 = new BankAccount(1000);
	      BankAccount account2 = new BankAccount(55);
	      BankAccount account3 = new BankAccount(345);
	      BankAccount account4 = new BankAccount(99000);

	      System.out.printf("|%10s|%10s|%10s|%10s|%n", account1, account2, account3, account4);
	      System.out.println("Expected: |    1000.0|      55.0|     345.0|   99000.0|");
	   }
	
}
