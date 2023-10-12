package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Math");
        ArrayList<String> currentCourses1 = new ArrayList<>();
        currentCourses1.add("Physic");

        Student s1 = new Student("s1", passedCourses1, currentCourses1);

        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("English");
        ArrayList<String> currentCourses2 = new ArrayList<>();
        currentCourses2.add("Danish");

        Student s2 = new Student("s2", passedCourses2, currentCourses2);


        ArrayList<String> canTeach11 = new ArrayList<>();
        canTeach11.add("Math");
        ArrayList<String> currentCourses11 = new ArrayList<>();
        currentCourses11.add("Physic");

        Teacher t1 = new Teacher("t1", canTeach11, currentCourses11);

        ArrayList<String> canTeach22 = new ArrayList<>();
        canTeach22.add("English");
        ArrayList<String> currentCourses22 = new ArrayList<>();
        currentCourses22.add("Danish");

        Teacher t2 = new Teacher("t2", canTeach22, currentCourses22);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

    }
}
