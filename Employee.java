import java.util.ArrayList;
import java.util.List;

class Employee {
    
    int id;
    String name;
    double salary;

    // Constructor to initialize the Employee object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: Rs." + salary);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee(01, "Ravi Gupta", 55000.00);
        Employee employee2 = new Employee(02, "Suman Sahu", 62000.00);
        Employee employee3 = new Employee(03, "Sujit ", 45000.00);

        // Store them in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        // Display the details of each employee
        for (Employee employee : employeeList) {
            employee.displayDetails();
        }
    }
}
