package week_10.live_class;

import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate:");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter amount: ");
        double amount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate,year,amount);
        System.out.println("Monthly payment: " + loan.getMonthlyPayment());
        System.out.println("The total payment: " + loan.getTotalPayment());
        System.out.println("The loan was created on " + loan.getLoanDate());
    }
}
