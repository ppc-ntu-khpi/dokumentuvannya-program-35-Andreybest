package domain;

/**
 * Employee with information about his job
 * @author liketaurus
 */
public class Employee {

    /**
     * Returns all information about employee as string
     * @return string with information about employee
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Creates a new instance of the Employee class.
     * @param name Employee name
     * @param jobTitle Employee name of a job
     * @param level Level of employee
     * @param dept Department where he works
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Creates a new instance of the Employee class with empty fields (except ID).
     * WARNING! Please set values after you create new instance of class, or else you can get exceptios or null values in methods of this object
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Set jobs name of Employee
     * @param job Employee job name
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Get the name of employee job
     * @return string of emloyee job name
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Get the name of employee
     * @return string of emloyee name
     */
    public String getName() {
        return name;
    }

    /**
     * Set level of employee
     * @param level Level (or year) of employee
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Get level of employee
     * @return level of employee 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Get department of employee
     * @return name of department where employee works
     */
    public String getDept() {
        return dept;
    }

    /**
     * Set name of department where employee works
     * @param dept Department name
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    /**
     * Set employees name.
     * If provided name provided wrong characters, name "John Doe" will be set instead.
     * @param name Name of employee
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
