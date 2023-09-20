package week_06.assigments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(long number) {
       int newNumber = 0;
        while (number > 0) {
            newNumber += number % 10;
            number = number / 10;

        }
        newNumber += number;
        return newNumber;
    }
}
