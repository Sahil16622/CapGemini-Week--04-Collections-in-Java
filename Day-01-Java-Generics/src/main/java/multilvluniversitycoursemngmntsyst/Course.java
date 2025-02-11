package multilvluniversitycoursemngmntsyst;

// Generic Course class to manage different courses
class Course<T extends CourseType> {
    private String courseCode;
    private T courseType;

    public Course(String courseCode, T courseType) {
        this.courseCode = courseCode;
        this.courseType = courseType;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseType;
    }
}

