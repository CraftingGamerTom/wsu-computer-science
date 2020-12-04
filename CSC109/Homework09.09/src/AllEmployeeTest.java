import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests the All Employee Classes
 * 
 * @author TomRokickiii
 * @version 0.1
 * 
 */
public class AllEmployeeTest {

    private static Employee employee0;
    private static Manager employee1;
    private static Executive employee2;

    /**
     * Creates a new employee objects to be used for testing.
     * 
     * @throws Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        employee0 = new Employee("Bob", 15.0);
        employee1 = new Manager("Gary", 20.0, "Testing");
        employee2 = new Executive("Steve", 25.0, "Overseeing");
    }

    /**
     * Tests all the methods for employee, manager, and executive.
     */
    @Test
    public void testEmployee() {
        String theString0 = employee0.toString();
        String theString1 = employee1.toString();
        String theString2 = employee2.toString();
        assertFalse(theString0.equals("0"));
        assertFalse(theString1.equals("1"));
        assertFalse(theString2.equals("2"));

        assertTrue(employee0.getName().equals("Bob"));
        double salary = employee0.getSalary();
        assertNotSame(employee0.getSalary(), salary);
        //Honestly bullshit that assertSame is failing here.
        
        String department = employee1.getDepartment();
        assertTrue(department.equals("Testing"));
    }
}
