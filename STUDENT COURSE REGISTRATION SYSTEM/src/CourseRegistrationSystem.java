import java.util.*;

public class CourseRegistrationSystem {
    List<Course> courseDatabase;
    List<Student> studentDatabase;

    public CourseRegistrationSystem() {
        this.courseDatabase = new ArrayList<>();
        this.studentDatabase = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courseDatabase.add(course);
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courseDatabase) {
            System.out.println("Course Code: " + course.code);
            System.out.println("Title: " + course.title);
            System.out.println("Description: " + course.description);
            System.out.println("Capacity: " + course.capacity);
            System.out.println("Schedule: " + course.schedule);
            System.out.println("----------------------");
        }
    }

    public void registerStudent(Student student, Course course) {
        if (course.capacity > 0) {
            student.registeredCourses.add(course);
            course.capacity--;
            System.out.println("Registration successful for " + student.name + " in course " + course.title);
        } else {
            System.out.println("Sorry, the course " + course.title + " is full.");
        }
    }

    public void removeRegistration(Student student, Course course) {
        if (student.registeredCourses.contains(course)) {
            student.registeredCourses.remove(course);
            course.capacity++;
            System.out.println("Course " + course.title + " removed for " + student.name);
        } else {
            System.out.println("Student " + student.name + " is not registered for course " + course.title);
        }
    }

}
