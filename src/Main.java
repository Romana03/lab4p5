import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Instantierea obiectelor
        Person person = new Person("John Doe", "john.doe@example.com");
        Student student = new Student("Alice Smith", "alice.smith@example.com", new int[]{90, 85, 92});
        Professor professor = new Professor("Dr. Johnson", "johnson@example.com", new String[]{"Mathematics", "Physics"});

        // Afisare informatii despre obiecte
        displayPersonInfo(person);
        displayStudentInfo(student);
        displayProfessorInfo(professor);
    }

    public static void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println();
    }

    public static void displayStudentInfo(Student student) {
        displayPersonInfo(student);
        System.out.println("Grades: " + Arrays.toString(student.getGrades()));
    }

    public static void displayProfessorInfo(Professor professor) {
        displayPersonInfo(professor);
        System.out.println("Courses: " + Arrays.toString(professor.getCourses()));
    }
}