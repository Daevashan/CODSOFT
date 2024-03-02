import java.util.*;


public class Student {
    String id;
    String name;
    List<Course> registeredCourses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

}
