package multilvluniversitycoursemngmntsyst;

import java.util.ArrayList;
import java.util.List;

// Abstract class for different course evaluation types
abstract class CourseType {
    private String name;

    public CourseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}
