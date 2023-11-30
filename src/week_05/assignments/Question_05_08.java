package week_05.assignments;

import java.util.*;

public class Question_05_08 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int student = 1;

        String name = " ";
        int score = 0;
        System.out.println("Enter each student's name and score ");

        while (student <= numberOfStudents) {
            System.out.println("Student: " + student);
            System.out.print("   Name: ");
            String nameStudent = input.next();
            System.out.print("  Score: ");
            int score1 = input.nextInt();

            if (score1 > score) {
                score = score1;
                name = nameStudent;
            }
            student++;

        }
        System.out.println("Student with the highest score: " + name);

    }
}

