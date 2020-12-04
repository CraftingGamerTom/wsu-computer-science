package HomeworkEight;

public class CarTester
{
	// Use the following class as your tester class:

	/**
	 * This program tests the Car class.
	 */
	public static void main(String[] args) {
		Car myHybrid = new Car(50); // 50 miles per gallon
		myHybrid.addGas(20);
		myHybrid.drive(100); // consumes 2 gallons
		double gasLeft = myHybrid.getGasInTank();

		// TODO: Print actual and expected gas level
		//System.out.println(gasLeft);
		

	}
}