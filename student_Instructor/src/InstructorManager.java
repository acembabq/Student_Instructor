public class InstructorManager extends UserManager {

    public  void add(User user) {
        System.out.println("Instructor " + user.getFirstName() + " " + user.getLastName() + " added!");
    }

    public void addCourse() {
        System.out.println("Course added");
    }

    public void deleteCourse() {
        System.out.println("Course deleted");
    }
}
