package week_04.assignments;

import java.util.*;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        if (9 < value && value < 16) {
            System.out.print("The hex value is ");

            if (value == 10) {
                System.out.println("A");
            } else if (value == 11) {
                System.out.println("B");
            } else if (value == 12) {
                System.out.println("C");
            } else if (value == 13) {
                System.out.println("D");

            } else if (value == 14) {
                System.out.println("E");
            } else if (value == 15) {
                System.out.println("F");
            }
        } else {
            System.out.println("invalid input");
        }
    }
}

