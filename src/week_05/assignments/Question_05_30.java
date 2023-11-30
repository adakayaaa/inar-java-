package week_05.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g.,100): ");
        double amount = input.nextDouble();
        double originalAmount = amount;
        System.out.print("Enter an annual interest rate (e.g.,5): ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter the number of months (e.g.,6): ");
        int month = input.nextInt();

        for (int i = 1; i < month; i++) {
            amount = (amount + originalAmount) * (1 + monthlyInterestRate);


        }
        System.out.println("Amount in savings account after " + month + " months " + (int) (amount * 100) / 100.0);
    }
}

