package multilvluniversitycoursemngmntsyst;

// Main class to test functionality
public class UniversityManagement {
    public static void main(String[] args) {
        CourseCatalog catalog = new CourseCatalog();

        // Creating different courses
        Course<ExamCourse> math101 = new Course<>("MATH101", new ExamCourse("Mathematics"));
        Course<AssignmentCourse> cs102 = new Course<>("CS102", new AssignmentCourse("Programming Fundamentals"));
        Course<ResearchCourse> bio201 = new Course<>("BIO201", new ResearchCourse("Genetics Research"));

        // Adding courses to catalog
        catalog.addCourse(math101);
        catalog.addCourse(cs102);
        catalog.addCourse(bio201);

        // Displaying all courses
        System.out.println("University Course Catalog:");
        catalog.displayCourses();
    }
}
