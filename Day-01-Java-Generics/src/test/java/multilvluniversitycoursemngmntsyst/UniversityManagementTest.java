package multilvluniversitycoursemngmntsyst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class UniversityManagementTest {

    @Test
    void testCourseCreation() {
        // Creating courses
        Course<ExamCourse> math101 = new Course<>("MATH101", new ExamCourse("Mathematics"));
        Course<AssignmentCourse> cs102 = new Course<>("CS102", new AssignmentCourse("Programming Fundamentals"));

        // Checking course codes
        assertEquals("MATH101", math101.getCourseCode());
        assertEquals("CS102", cs102.getCourseCode());

        // Checking course types
        assertEquals("Mathematics", math101.getCourseType().getName());
        assertEquals("Programming Fundamentals", cs102.getCourseType().getName());
    }

    @Test
    void testCourseCatalogFunctionality() {
        CourseCatalog catalog = new CourseCatalog();
        Course<ResearchCourse> bio201 = new Course<>("BIO201", new ResearchCourse("Genetics Research"));

        // Adding course to catalog
        catalog.addCourse(bio201);

        // Ensure the course is added (size should be 1)
        assertEquals(1, catalog.courses.size());
    }

    @Test
    void testDisplayCourses() {
        CourseCatalog catalog = new CourseCatalog();
        Course<ExamCourse> math101 = new Course<>("MATH101", new ExamCourse("Mathematics"));
        catalog.addCourse(math101);

        // Capture output from displayCourses()
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        catalog.displayCourses();

        // Restore normal output
        System.setOut(System.out);

        // Verify that the correct course details are printed
        String expectedOutput = "MATH101 - ExamCourse: Mathematics\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}

