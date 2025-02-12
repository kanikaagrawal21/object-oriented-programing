package ObjectRelationshipsAndCommunication;

import java.util.*;

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.showDepartment();
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(" - " + faculty.getName());
        }
    }


    class Department {
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public void showDepartment() {
            System.out.println(" - Department: " + name);
        }
    }

     static class Faculty {
        private String name;

        public Faculty(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class UniversityWithFacultiesAndDepartment {
        public static void main(String[] args) {
            University university = new University("Global Tech University");

            university.addDepartment("Computer Science");
            university.addDepartment("Mathematics");

            Faculty professorA = new Faculty("Dr. Smith");
            Faculty professorB = new Faculty("Dr. Johnson");

            university.addFaculty(professorA);
            university.addFaculty(professorB);

            university.showDetails();
        }
    }
}