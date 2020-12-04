package HomeworkSeven;

/**
Describes a vehicle with a self-contained propulsion unit.
 */
public class Vehicle
{
    private String make;
    private String model;
    private String year;
    private String type;
    private int wheelCount;
    private String engineType;
    private String fuel;

    /**
       Constructs a vehicle
       @param aMake the vehicle's make
       @param aModel the vehicle's model
       @param aType the type of the vehicle
       @param numWheels the number of wheels on this vehicle
       @param aFuel the type of fuel used by this vehicle
    */

    public Vehicle(String aMake, String aModel, String aYear,
            String aType, int numWheels, String aEngineType, String aFuel)
    {
       /*
          TODO: Modify the constructor to throw an IllegalArgumentException
          if the conditions of the problem statement are not met.
       */
	    make = aMake;
       model = aModel;
       year = aYear;
       type = aType;
       wheelCount = numWheels;
       engineType = aEngineType;
       fuel = aFuel;
       if (aType.equalsIgnoreCase("motorcycle") && wheelCount != 4){throw new IllegalArgumentException();}
       if (aType.equalsIgnoreCase("truck") && wheelCount < 4){throw new IllegalArgumentException();}
    }

    /**
       Formats the vehicle information for printing
       @returns a string sutiable for printing
    */
    public String formatForPrinting()
    {
        return "Make: " + make + "\n"
                + "Model: " + model + "\n"
                + "Year: " + year + "\n"
                + "Type: " + type + "\n"
                + "Number of wheels: " + wheelCount + "\n"
                + "Engine type: " + engineType + "\n"
                + "Fuel: " + fuel + "\n";
    }

   /**
      The following method checks your constructor. We use the exception
      handling mechanism to determine whether (a) the
      constructor completed normally, or (b) an exception occurred.
   */
   public static String check(String aMake, String aModel, String aYear,
            String aType, int numWheels, String aEngineType, String aFuel)
   {
      try
      {
         Vehicle aVehicle = new Vehicle(aMake,aModel,aYear,aType,
                 numWheels,aEngineType,aFuel);
         return "Constructor completed normally";
      }
      catch (Exception exception)
      {
         return "Exception in constructor";
      }
   }
}
