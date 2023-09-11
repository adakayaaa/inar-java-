package week_05.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double depositAmount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        double monthlyPercentageYield = annualPercentageYield / 1200;

        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();
        int monthsCount = 1;
        System.out.println("Month                   CD Value");

        for (int i = 1; i <= numberOfMonths; i++) {
            depositAmount += depositAmount * monthlyPercentageYield;
            System.out.printf("%-5d\t\t\t\t\t%-9.2f\n" ,monthsCount, depositAmount);
            monthsCount++;
        }

    }
}
