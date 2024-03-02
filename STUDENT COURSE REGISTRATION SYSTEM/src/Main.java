public class Main {
    public static void main(String[] args) {

        CourseRegistrationSystem registrationSystem = new CourseRegistrationSystem();

        // Adding some sample courses
        registrationSystem.addCourse(new Course("CS101", "Introduction to Programming", "Basic programming concepts", 30, "Mon/Wed/Fri 10:00 AM"));
        registrationSystem.addCourse(new Course("MATH201", "Calculus I", "Limits, derivatives, and integrals", 25, "Tue/Thu 2:00 PM"));

        // Adding some sample students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        // Displaying available courses
        registrationSystem.displayCourses();

        // Registering students for courses
        registrationSystem.registerStudent(student1, registrationSystem.courseDatabase.get(0));
        registrationSystem.registerStudent(student2, registrationSystem.courseDatabase.get(1));

        // Displaying available courses after registration
        registrationSystem.displayCourses();

        // Removing registration for a course
        registrationSystem.removeRegistration(student1, registrationSystem.courseDatabase.get(0));

        // Displaying available courses after removal
        registrationSystem.displayCourses();

    }
}