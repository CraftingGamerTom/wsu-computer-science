package TestNine;

/**
A quarter with a state theme.
*/
public class Quarter extends Coin
{
private String state;
private static String theName = "Quarter";

/**
   Constructs a quarter.
   @param aValue the monetary value of the quarter.
   @param aName the name of the quarter
*/
public Quarter(String aState) 
{ 
	super(0.25, theName);
   state = aState;
}

public String getDescription()
{
   return super.getDescription() + ", state=" + state;
		   //Quarter, value=0.25, state=California
}
}
