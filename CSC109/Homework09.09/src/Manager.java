/**
 * Creates a Manager Object for data storage.
 * @author TomRokickiii
 * @version 0.1
 */
public class Manager extends Employee {

    private String department;

    /**
     * Creates new manager class.
     * @param name the Name of the Manager.
     * @param salary How much the manager is paid.
     * @param department Which deparment they work in.
     */
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    /**
     * Gets the department of the manager.
     * @return department a String containing the name of the department.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Overrides the toString method from Employee Class to add more to it.
     * @return String containing the formatted String.
     */
    @Override
    public String toString() {
        // return this.getName() + " " + department + " " + this.getSalary();
        return "Manager[super=Employee[name=" 
                + this.getName() + ",salary=" 
                + this.getSalary() + "],department="
                + department + "]";
    }
}
