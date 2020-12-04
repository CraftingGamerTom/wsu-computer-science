package TestNine;

/**
   Represents a vehicle of any type.
*/

public class Vehicle
{
   private String id;
   private double mileage;

   public Vehicle(String anId)
   {
      id = anId;
      mileage = 0;
   }

   public void move(double milesMoved)
   {
      mileage = mileage + milesMoved;
   }

   public String getID()
   {
      return id;
   }
   
   public double getMileage()
   {
      return mileage;
   }
}