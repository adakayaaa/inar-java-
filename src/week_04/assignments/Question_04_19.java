package week_04.assignments;

import java.util.*;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String number = input.next();

        if (number.length() != 9){
            System.out.println("You must enter 9 digits");
            System.exit(1);
        }

        int d1 = Integer.parseInt(number.substring(0, 1));
        int d2 = Integer.parseInt(number.substring(1, 2));
        int d3 = Integer.parseInt(number.substring(2, 3));
        int d4 = Integer.parseInt(number.substring(3, 4));
        int d5 = Integer.parseInt(number.substring(4, 5));
        int d6 = Integer.parseInt(number.substring(5, 6));
        int d7 = Integer.parseInt(number.substring(6, 7));
        int d8 = Integer.parseInt(number.substring(7, 8));
        int d9 = Integer.parseInt(number.substring(8));


        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 == 10) {
            System.out.println("The ISBN-10 number is " + number + "X");
        } else {
            System.out.println("The ISBN-10 number is " + number + d10);
        }

    }
}
