public class StudentManager extends UserManager {

    public void add(User user) {
        System.out.println("Student " + user.getFirstName() + " " + user.getLastName() + " added!");
    }

    public void course(Instructor instructor) {
        System.out.println("The course taken from " + instructor.getFirstName() + " "
                + instructor.getLastName() + " successfully!");
    }
}

