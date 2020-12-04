package HomeworkNine;

public class Executive extends Manager{
	
	public Executive(String name, double salary, String department){
		super(name, salary, department);
	}

	@Override
	public String toString(){
		//return this.getName() + " " + department + " " + this.getSalary();
		return "Executive[super=Manager[super=Employee[name=" + this.getName() + ",salary=" + this.getSalary() + "],department=" + this.getDepartment() + "]]";
	}
}
