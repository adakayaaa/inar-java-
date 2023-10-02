package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int[] numberOfStudents = new int[number];

        System.out.println("Enter " + number + " scores: ");
        int max = numberOfStudents[0];
        for (int i = 0; i < numberOfStudents.length; i++) {
            numberOfStudents[i] = input.nextInt();
            if (numberOfStudents[i] > max) {
                max = numberOfStudents[i];
            }
        }

        for (int i = 0; i < numberOfStudents.length; i++) {
            if (numberOfStudents[i] >= max - 10) {
                System.out.println("Student " + i + "score is " + numberOfStudents[i] + " and the grade is A");
            } else if (numberOfStudents[i] >= max - 20) {
                System.out.println("Student " + i + "score is " + numberOfStudents[i] + " and the grade is B");
            } else if (numberOfStudents[i] >= max - 30) {
                System.out.println("Student " + i + "score is " + numberOfStudents[i] + " and the grade is C");
            } else if (numberOfStudents[i] >= max - 40) {
                System.out.println("Student " + i + "score is " + numberOfStudents[i] + " and the grade is D");
            } else {
                System.out.println("Student " + i + "score is " + numberOfStudents[i] + " and the grade is F");
            }
        }
    }
}

