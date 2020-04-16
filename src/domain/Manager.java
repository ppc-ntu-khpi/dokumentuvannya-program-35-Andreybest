package domain;

/**
 * Manager with assigned employees
 * @author liketaurus
 */
public class Manager extends Employee {

    /**
     * Creates a new instance of the Manager class.
     * @param employees List of assigned to him employees
     * @param name Managers name
     * @param jobTitle Managers name of a job
     * @param level Level of manager
     * @param dept Department where he works
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Returns all information about manager and his employees as string
     * @see Employee#toString()
     * @return string with information about manager and assigned employees
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Creates a new instance of the Manager class.
     * @param employees List of assigned to him employees
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Creates a new instance of the Manager class.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Get all names of assigned employees to this manager
     * @return All employee names as one string 
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Assign employees to this manager
     * @param employees List of assigned employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Get list of employees assigned to this manager
     * @return list of assigned employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
