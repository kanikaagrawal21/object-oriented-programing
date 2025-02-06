package ClassAndObjectLevelOne;

import javax.xml.namespace.QName;

class Employee {

    private int empid;
    private String ename;

    // Setter methods
    public void setId(int empid) {
        this.empid = empid;
    }

    public void setName(String ename)
    {
        this.ename = ename;
    }

    // Getter methods
    public int getId() {
        return empid;
    }

    public String getName() {
        return ename;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(78);
        e.setName("John");

        System.out.println("Employee id: " + e.getId());
        System.out.println("Employee Name: "
                + e.getName());
    }
}
