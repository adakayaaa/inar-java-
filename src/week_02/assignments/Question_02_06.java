package week_02.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");

        int number = input.nextInt();
        int totalDigit = number / 10;
        int currentDigit = totalDigit % 10;

        int newTotalSum = totalDigit / 10;
        int newCurrentDigit = newTotalSum % 10;

        int sumOfTheDigit = currentDigit + newTotalSum + newCurrentDigit;

        System.out.println("The sum of the digits is " + sumOfTheDigit);
    }
}
