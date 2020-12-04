package TestNine;

/**
Represents an automobile.
*/
public class Auto extends Vehicle// TODO: Inherit from Vehicle
{
	private String vin;
	private String plate;
// TODO: Declare instance variables

public Auto(String vin, String plate)
{
	super(vin);
	this.vin = vin;
	this.plate = plate;
   // TODO: Complete the constructor
}

// TODO:  implement the getID() method for autos
public String getID(){
	return "VIN=" + vin + ",plate=" + plate;
}
}