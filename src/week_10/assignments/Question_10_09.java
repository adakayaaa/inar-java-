package week_10.assignments;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course = new Course("Course Inar Academy");
        course.addStudent("Ozgur Kartal");
        course.addStudent("Ada Kaya");
        course.addStudent("Bilal Topal");
        course.addStudent("Besim Karabiyik");
        course.addStudent("Emir Uyanik");

        String[] students= course.getStudents();
        course.printCourse();

        System.out.println("-------------------------------------------");

        course.dropStudents("Bilal Topal");
        course.dropStudents("Emir Uyanik");

        course.printCourse();




    }
}
