public class MarsRobot {
	String status;
	int speed;
	float temperature;
	String name;
	
	void checkTemperature() {
		if (temperature < -80){
			status = "return home";
			speed = 5;
		}
	}
	
	void showAttributes() {
		System.out.println(name + " status: " + status);
		System.out.println(name + " speed: " + speed);
		System.out.println(name + " temperature: " + temperature);
	}
}
