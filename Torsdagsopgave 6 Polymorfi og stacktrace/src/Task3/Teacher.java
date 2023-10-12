package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }


    public ArrayList<String> getCanTeach() {
        return canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}