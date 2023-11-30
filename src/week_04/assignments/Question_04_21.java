package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN: ");
        String socialSecurityNumber = input.next();
        if (socialSecurityNumber.length() != 11) {
            System.out.println("You have to enter a SSN");
            System.exit(1);
        }
        String number1 = socialSecurityNumber.substring(3, 4);
        char d1 = number1.charAt(0);

        String number2 = socialSecurityNumber.substring(6, 7);
        char d2 = number2.charAt(0);

        if ((d1 == 45) && (d2 == 45)) {
            System.out.println(socialSecurityNumber + " is a valid social security number");

        } else {
            System.out.println(socialSecurityNumber + " is a an invalid social security number ");
        }
    }
}

