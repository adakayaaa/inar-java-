package week_05.assignments;

import java.util.*;

public class Question_05_09 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int student = 1;

        String name1 = " ";
        String name2 = " ";
        int score = 0;
        int score1 = 0;
        System.out.println("Enter each student's name and score ");

        while (student <= numberOfStudents) {
            System.out.println("Student: " + student);
            System.out.print("   Name: ");
            String nameStudent = input.next();
            System.out.print("  Score: ");
            int score2 = input.nextInt();

            if (score2 > score1) {
                score =score1;
                score1 = score2;

                name1=nameStudent;
                name1 = name2;

            }
            student++;

        }
        System.out.println("Student with the highest score: " + name1);
        System.out.println("Student with the second highest score: " + name2);
    }
}
