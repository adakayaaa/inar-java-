package week_04.assignments;

import java.util.*;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters");
        String majors = input.next();
        char majorCharacter = majors.charAt(0);
        char numberCharacter = majors.charAt(1);

        if (majorCharacter == 'M') {
            System.out.print("Mathematics ");
        } else if (majorCharacter == 'C') {
            System.out.print("Computer Science ");
        } else if (majorCharacter == 'I') {
            System.out.print(" Information Technology ");
        } else {
            System.out.print("invalid input");
        }

        if (numberCharacter == '1') {
            System.out.println("Freshman");
        } else if (numberCharacter == '2') {
            System.out.println("Sophomore");
        } else if (numberCharacter == '3') {
            System.out.println("Junıor ");
        } else if (numberCharacter == '4') {
            System.out.println("Senior ");
        } else {
            System.out.println("invalid input");
        }
    }
}

