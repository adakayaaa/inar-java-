package week_05.assignments;

import java.util.*;

public class Question_05_09 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int student = 1;

        String nameHighestStudent = " ";
        String nameSecondHighestStudent = " ";
        int scoreHighest = 0;
        int scoreSecondHighest = 0;
        System.out.println("Enter each student's name and score ");

        while (student <= numberOfStudents) {
            System.out.println("Student: " + student);
            System.out.print("   Name: ");
            String nameOfStudent = input.next();
            System.out.print("  Score: ");
            int scoreOfStudent = input.nextInt();

            if (scoreOfStudent> scoreHighest){
                scoreSecondHighest = scoreHighest;
                nameSecondHighestStudent = nameHighestStudent;

                scoreHighest= scoreOfStudent;
                nameHighestStudent = nameOfStudent;
            }
            student++;

        }
        System.out.println("Student with the highest score: " + nameHighestStudent);
        System.out.println("Student with the second highest score: " + nameSecondHighestStudent);
    }
}

