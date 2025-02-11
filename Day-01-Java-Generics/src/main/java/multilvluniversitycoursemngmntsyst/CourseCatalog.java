package multilvluniversitycoursemngmntsyst;

import java.util.ArrayList;
import java.util.List;
// CourseCatalog to handle all types of courses
class CourseCatalog {
    public List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}