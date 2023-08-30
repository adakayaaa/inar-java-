package week_04.assignments;

import java.util.*;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        String letterGrade = input.nextLine();

        if (letterGrade.length() != 1) {
            System.out.println("You have to write one letter.");
            System.exit(1);
        }
        char grade = letterGrade.charAt(0);
        if (grade == 'A') {
            System.out.println("The numeric value for grade A is 4");
        } else if (grade == 'B') {
            System.out.println("The numeric value for grade B is 3");
        } else if (grade == 'C') {
            System.out.println("The numeric value for grade C is 2");
        } else if (grade == 'D') {
            System.out.println("The numeric value for grade D is 1");
        } else if (grade == 'F') {
            System.out.println("The numeric value for grade F is 0 ");
        } else {
            System.out.println(grade + " is an invalid input");
        }
    }
}
