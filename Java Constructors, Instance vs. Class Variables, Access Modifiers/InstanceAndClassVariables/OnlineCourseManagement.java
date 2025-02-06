package InstanceAndClassVariables;
class Course{
    String courseName;
    int duration;
    int fee;
    static String instituteName ;

    Course(String courseName,int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;

    }
    void displayCourseDetail(){
        System.out.println("course Name"+courseName);
        System.out.println("duration"+duration);
        System.out.println("fee"+fee);
    }
}
public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course c = new Course("math",3,300);
        c.displayCourseDetail();
    }
}
