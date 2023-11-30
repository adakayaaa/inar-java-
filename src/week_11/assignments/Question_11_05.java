package week_11.assignments;

import java.util.ArrayList;

public class Question_11_05 {
    public static void main(String[] args) {
        week_11.assignments.Course course = new Course("Course Inar Academy");
        ArrayList<String> list= course.getList();

        System.out.println("After adding student to the course..");
            course.addStudent("Nisanur Altuntas");
        course.addStudent("Gürkan Serteser");
        course.addStudent("Sinan Cetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Denis");
        course.addStudent("Berkan Eris");

        course.printCourse();
        System.out.println("Number of students: " + course.getNumberOfStudents());

        System.out.println("-------------------------------------------");

        System.out.println("After dropping student to the course..");
        course.dropStudents("Sinan Cetin");
        course.dropStudents("Mehmet Toprak");
        course.dropStudents("Berkan Eris");

        course.printCourse();
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}

