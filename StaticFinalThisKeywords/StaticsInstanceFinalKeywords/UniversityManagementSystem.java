package StaticsInstanceFinalKeywords;

// Student class
class Student {
    // Static variable shared by all students
    static String universityName = "XYZ University";
    static int totalStudents = 0;  // Counter to track total students

    // Final variable for roll number (cannot be changed after assignment)
    final int rollNumber;
    String name;
    char grade;

    // Constructor using 'this' to initialize instance variables
    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;  // 'this' differentiates instance variable from parameter
        this.name = name;
        this.grade = grade;
        totalStudents++;  // Increment total students on object creation
    }

    // Method to display student details
    void displayStudent() {
        if (this instanceof Student) {  // Check if object is an instance of Student class
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println();
        }
    }

    // Static method to display total students enrolled
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student(101, "Alice", 'A');
        Student student2 = new Student(102, "Bob", 'B');

        // Display student details
        student1.displayStudent();
        student2.displayStudent();

        // Display total number of students
        Student.displayTotalStudents();
    }
}

