package HomeworkNine;

public class Employee {

	private String name;
	private double salary;
	
	/**
	 * Creates a new Employee Object
	 * @param name
	 * @param salary
	 */
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	/**
	 * Gets name
	 * @return
	 */
	public String getName(){
		return name;
	}
	/**
	 * Gets salary
	 * @return
	 */
	public double getSalary(){
		return salary;
	}
	
	public String toString(){
		return "Employee[name=" + this.getName() + ",salary=" + this.getSalary() + "]";
	}
}
