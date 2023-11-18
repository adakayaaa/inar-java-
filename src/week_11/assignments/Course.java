package week_11.assignments;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> list= new ArrayList<>();
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
            if (list.get(i).compareTo(student)==0) {
                tempIndex = i;
                break;
            }
        }

        this.list.remove(tempIndex);
    }


    public void clean() {
        this.list.clear();
    }

    public void printCourse(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println( list.get(i) +" ");
        }
    }
}