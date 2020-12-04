package TestEight;

/**
A coin with a monetary value.
*/

/*
TODO: Add a static field that counts the number of coin objects
that have been constructed. Add a static method objectCount that
reports the count.
*/



public class Coin
{
public static int coinCount = 0;
private double value;
private String name;

/**
   Constructs a coin.
   @param aValue the monetary value of the coin.
   @param aName the name of the coin
*/
public Coin(double aValue, String aName) 
{ 
   value = aValue; 
   name = aName;
   coinCount++;
}

/**
   Gets the coin value.
   @return the value
*/
public double getValue() 
{
   return value;
}

/**
   Gets the coin name.
   @return the name
*/
public String getName() 
{
   return name;
}

/**
   Returns a string representation of the object.
   @return name and value of coin
*/
public String toString()
{
   return "Coin[value=" + value + ",name=" + name + "]";
}
public static int objectCount(){
	return coinCount;
}
// This method is used to check your work. Do not modify it.

public static int check(int dimes, int quarters)
{
   Coin[] coins = new Coin[dimes + quarters];
   for (int i = 1; i <= dimes; i++)
      coins[i] = new Coin(0.10, "dime");
   for (int i = 1; i <= quarters; i++)
      coins[dimes] = new Coin(0.25, "quarter");
   return Coin.objectCount();
}
}

