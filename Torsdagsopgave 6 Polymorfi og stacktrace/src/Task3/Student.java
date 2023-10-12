package Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else if (currentCourses.contains(course)){
            return false;
        } else{
            currentCourses.add(course);
            return true;
        }
    }
}
