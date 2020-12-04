package HomeworkEight;

/*
		
Programming Problem 8.06 Car with LabRat
This question requires the use of a Java WebStart application called LabRat. For information about this application and to check that you have the proper system requirements, click "System Requirements". In order to complete the problem, click on "Launch LabRat" below. The LabRat wizard will guide you through the steps for working on the problem. If you leave or are timed out of WileyPlus while working on the problem, log back in, come back to this question and click on "Check and Upload Your Work". You will be directed to the proper place in the wizard and you will be able to run a preliminary evaluation report and then upload your work for grading and review by your instructor.

SYSTEM REQUIREMENTS
LAUNCH LABRAT
CHECK AND UPLOAD YOUR WORK
Implement a class Car with the following properties. A car has a certain fuel efficiency (measured in miles/gallon or liters/km - pick one) and a certain amount of fuel in the gas tank. The efficiency is specified in the constructor, and the initial fuel level is 0. Supply a method drive that simulates driving the car for a certain distance, reducing the amount of gasoline in the fuel tank. Also supply methods getGasInTank, returning the current amount of gasoline in the fuel tank, and addGas, to add gasoline to the fuel tank. Sample usage: 
Car myHybrid = new Car(50); // 50 miles per gallon 
myHybrid.addGas(20); // Tank 20 gallons 
myHybrid.drive(100); // Drive 100 miles
double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank You may assume that the drive method is never called with a distance that consumes more than the available gas. Supply a CarTester class that tests all methods.

Complete the following class in your solution:
 */

/**
 * A car can drive and consume fuel.
 */
public class Car {
	private double gas = 0;
	private double efficiency;

	/**
	 * Constructs a car with a given fuel efficiency.
	 * 
	 * @param anEfficiency
	 *            the fuel efficiency of the car
	 */
	public Car(double anEfficiency) {
		efficiency = anEfficiency;
	}

	/**
	 * Adds gas to the tank.
	 * 
	 * @param amount
	 *            the amount of fuel to add
	 */
	public void addGas(double amount) {
		gas += amount;
	}

	/**
	 * Drives a certain amount, consuming gas.
	 * 
	 * @param distance
	 *            the distance driven
	 */
	public void drive(double distance) {
		if (gas - (distance / efficiency) >= 0) {
			gas = gas - (distance / efficiency);
		} else {
			while (gas - (distance / efficiency) < 0) {
				distance--;
			}
			gas = gas - (distance / efficiency);
		}

	}

	/**
	 * Gets the amount of gas left in the tank.
	 * 
	 * @return the amount of gas
	 */

	public double getGasInTank() {
		return gas;
	}
}


