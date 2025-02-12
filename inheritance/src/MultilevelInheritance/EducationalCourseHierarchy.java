package MultilevelInheritance;

class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    String getCourseDetails() {
        return "Course: " + courseName + ", Duration: " + duration + " weeks";
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    String getCourseDetails() {
        return super.getCourseDetails() + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    String getCourseDetails() {
        return super.getCourseDetails() + ", Fee: $" + fee + ", Discount: " + discount + "%";
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course basicCourse = new Course("Java Basics", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Python Advanced", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 200, 20);

        System.out.println(basicCourse.getCourseDetails());
        System.out.println(onlineCourse.getCourseDetails());
        System.out.println(paidCourse.getCourseDetails());
    }
}
