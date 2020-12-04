
/**
 * Creates an employee object for data management.
 * 
 * @version 0.1
 * @author TomRokickiii
 *
 */
public class Employee {

    private String name;
    private double salary;

    /**
     * Creates a new Employee Object
     * 
     * @param name
     *            the name of the employee.
     * @param salary
     *            How much the employee earns.
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets name
     * 
     * @return name for the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Gets salary
     * 
     * @return salary integer for the employee's wage.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Creates a formated string for the employees name and wage.
     * 
     * @return a string containing wage and name of employee.
     */
    public String toString() {
        return "Employee[name=" 
                + this.getName() + ",salary=" 
                + this.getSalary() + "]";
    }
}
