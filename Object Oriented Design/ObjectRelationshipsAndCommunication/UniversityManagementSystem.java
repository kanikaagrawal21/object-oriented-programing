package ObjectRelationshipsAndCommunication;// University system modeling relationships among Students, Professors, and Courses
import java.util.*;

// Student class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Courses course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getName());
    }

    public String getName() {
        return name;
    }
}

// Professor class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Courses course) {
        course.setProfessor(this);
        System.out.println("Professor " + name + " assigned to " + course.getName());
    }

    public String getName() {
        return name;
    }
}

// Course class (Aggregation: Can exist without students or professors)
class Courses {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Courses(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }
}

// Main class to demonstrate the university system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Professor professor = new Professor("Dr. Smith");

        Courses course = new Courses("Computer Science");

        student1.enrollCourse(course);
        student2.enrollCourse(course);
        professor.assignCourse(course);
    }
}
