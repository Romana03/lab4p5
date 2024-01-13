public class Professor extends Person {
    private String[] courses;

    // Constructor pentru clasa Professor
    public Professor(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    // Getter pentru proprietatea 'courses'
    public String[] getCourses() {
        return courses;
    }

    // Setter pentru proprietatea 'courses'
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
