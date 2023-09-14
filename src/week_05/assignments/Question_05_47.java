package week_05.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String digit = input.nextLine();

        if (digit.length() != 12) {
            System.out.println(digit + " is an invalid input");
            System.exit(1);
        }

        int totalNumber = 0;


        for (int i = 0; i <= 10; i += 2) {
            totalNumber += Integer.parseInt(digit.substring(i, i + 1));
        }
        for (int i = 1; i <= 11; i += 2) {
            totalNumber += 3 * Integer.parseInt(digit.substring(i, i + 1));
        }

        int d13 = 10 - totalNumber % 10;

        if (d13 == 10) {
            System.out.println("The ISBN-13 number is " + digit + "0");
        } else {
            System.out.println("The ISBN-13 number is " + digit + "" + d13);
        }
    }
}
