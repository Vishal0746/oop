
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

class Person1 {
    private String firstName;
    private String lastName;
    
    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person1 {
    private int employeeId;
    private String jobTitle;
    
    public Employee1(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}


 class Main11 {
    public static void main(String[] args) {
        Person1 person = new Person1("John", "Doe");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());
        
        Employee1 employee = new Employee1("Jane", "Smith", 12345, "Manager");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
