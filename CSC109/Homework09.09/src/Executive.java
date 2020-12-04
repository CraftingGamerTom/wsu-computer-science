/**
 * Class for creating a Executive object
 * 
 * @author TomRokickiii
 * @version 0.1
 */
public class Executive extends Manager {

    /**
     * Creates an Executive Object.
     * 
     * @param name
     *            the name of the Executive.
     * @param salary
     *            How much the Executive makes.
     * @param department
     *            The department the Executive is from.
     */
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    /**
     * Over rides the toString Method from Manager to add more to it.
     * 
     * @return String containing a formated String.
     */
    @Override
    public String toString() {
        // return this.getName() + " " + department + " " + this.getSalary();
        return "Executive[super=Manager[super=Employee[name=" 
                + this.getName() + ",salary=" + this.getSalary()
                + "],department=" + this.getDepartment() + "]]";
    }
}
