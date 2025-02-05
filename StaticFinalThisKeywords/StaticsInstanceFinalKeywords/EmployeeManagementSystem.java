package StaticsInstanceFinalKeywords;

// Employee class
class Employee {
    // Static variable shared by all employees
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;  // To track total employees

    // Final variable for employee ID (cannot be changed after assignment)
    final int id;
    String name;
    String designation;

    // Constructor using 'this' to initialize instance variables
    Employee(int id, String name, String designation) {
        this.id = id;  // 'this' differentiates instance variable from parameter
        this.name = name;
        this.designation = designation;
        totalEmployees++;  // Increase employee count on creation
    }

    // Method to display employee details
    void displayEmployee() {
        if (this instanceof Employee) {  // Check if object is an instance of Employee class
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    // Static method to display total number of employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee(101, "Alice", "Software Engineer");
        Employee emp2 = new Employee(102, "Bob", "Project Manager");

        // Display employee details
        emp1.displayEmployee();
        System.out.println();
        emp2.displayEmployee();
        System.out.println();

        // Display total number of employees
        Employee.displayTotalEmployees();
    }
}
