import java.util.Scanner;

class Person {
    String name;
    int age;

    void acceptData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}

class Employee extends Person {
    String designation;
    double salary;

    void acceptData() {
        super.acceptData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class Main18 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Accept data for 5 employees
        System.out.println("Enter data for 5 employees:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].acceptData();
        }

        // Display the names of employees with a salary greater than 5000
        System.out.println("\nEmployees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.salary > 5000) {
                System.out.println(employee.name);
            }
        }
    }
}
