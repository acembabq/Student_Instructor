public class Main {

    public static void main(String[] args) {
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student();
        student1.setFirstName("Doğukan");
        student1.setLastName("Çoban");
        student1.setCity("Istanbul");
        student1.setEMail("DoukanBabaProGamerPVP@gmail.com");
        student1.setPhoneNumber("05559993322");
        student1.setStudentNumber("15");

        studentManager.add(student1);

        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("Samet");
        instructor1.setLastName("Yiyen");
        instructor1.setCity("California");
        instructor1.setEMail("SonKelesleTekAtici1871@gmail.com");
        instructor1.setPhoneNumber("05329993355");
        instructor1.setBranch("Edebiyat");
        instructor1.setSalary(5000);

        instructorManager.add(instructor1);

    }
}
