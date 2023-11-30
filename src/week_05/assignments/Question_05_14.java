package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        int minNumber = Math.min(number1, number2);
        int greatCommonDivisor = 1;

        while (greatCommonDivisor <= minNumber) {

            if (number1 % minNumber == 0 && number2 % minNumber == 0) {
                greatCommonDivisor *= minNumber;
            }

            minNumber--;
        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + greatCommonDivisor);
    }
}

