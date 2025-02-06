package LevelTwo;
class Student{

    private String name;
    private int rollNumber;
    private int marks;
    public void student( String name,int rollNumber,int marks){

        this.name=name;
        this.marks=marks;
        this.rollNumber=rollNumber;

    }
    public String calculateGrade(){
        if(marks>90)return "A+" ;
        else if(marks>80 && marks<90) return "A";
        else if(marks>70 && marks<80) return "B";
        else if(marks>60 && marks<70) return "c";
        else if (marks>50 && marks<60) return "D";
        else return "fail";

        }
        public void displayMarks(){
            System.out.println("\nStudent Report:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }

    }


public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.calculateGrade();

        student.displayMarks();

    }
}
