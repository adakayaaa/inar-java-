package week_13.assignments;

import java.util.ArrayList;

public class Course implements Cloneable {
    private String courseName;
    private ArrayList<String> list = new ArrayList<>();
    private int numberOfStudents;



    public Course(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getList() {
        return this.list;
    }

    public int getNumberOfStudents() {
        return this.list.size();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addStudent(String student) {
        this.list.add(student);
    }

    public void dropStudents(String student) {
        int tempIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(student) == 0) {
                tempIndex = i;
                break;
            }
        }

        this.list.remove(tempIndex);
    }


    public void clean() {
        this.list.clear();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course course = (Course) super.clone();
        course.list = new ArrayList<>(this.list);
        return course;

    }

    public void printCourse() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}

