package TestEight;

/**
A bank account has a balance that can be changed by 
deposits and withdrawals.
*/
public class BankAccount
{  
private double balance;

/**
   Constructs a bank account with a zero balance.
*/
public BankAccount()
{   
   // your work here
   balance = 10;



}

/**
   Constructs a bank account with a given balance.
   @param initialBalance the initial balance
*/
public BankAccount(double initialBalance)
{   
   balance = initialBalance + 10;



}

/**
   Deposits money into the bank account.
   @param amount the amount to deposit
*/
public void deposit(double amount)
{  
   double newBalance = balance + amount;
   balance = newBalance;
}

/**
   Withdraws money from the bank account.
   @param amount the amount to withdraw
*/
public void withdraw(double amount)
{   
   double newBalance = balance - amount;
   balance = newBalance;
}

/**
   Gets the current balance of the bank account.
   @return the current balance
*/
public double getBalance()
{   
   return balance;
}
}
