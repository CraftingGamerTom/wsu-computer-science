package HomeworkNine;

public class Manager extends Employee{

	private String department;
	
	public Manager(String name, double salary, String department){
		super(name, salary);
		this.department = department; 
	}
	
	public String getDepartment(){
		return department;
	}
	
	@Override
	public String toString(){
		//return this.getName() + " " + department + " " + this.getSalary();
		return "Manager[super=Employee[name=" + this.getName() + ",salary=" + this.getSalary() + "],department=" + department + "]";
	}
}
