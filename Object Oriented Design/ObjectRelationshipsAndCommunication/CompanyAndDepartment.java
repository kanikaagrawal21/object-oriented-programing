package ObjectRelationshipsAndCommunication;
import java.util.*;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void showDepartments() {
        for (Department dept : departments) {
            System.out.println("Department: " + dept.getName());
            dept.showEmployees();
        }
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void showEmployees() {
        for (Employee emp : employees) {
            System.out.println("  Employee: " + emp.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CompanyAndDepartment {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");

        Department itDept = new Department("IT");
        itDept.addEmployee("Alice");
        itDept.addEmployee("Bob");

        Department hrDept = new Department("HR");
        hrDept.addEmployee("Charlie");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.showDepartments();
    }
}
