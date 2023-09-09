package week_05.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();

        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate     Monthly Payment       Total Payment  ");
        double monthlyInterestRate=5;

        while (8 >= monthlyInterestRate) {
          double monthlyPayment = loanAmount * (monthlyInterestRate/1200) /
                    (1- 1/ Math.pow (1+(monthlyInterestRate/1200) , numberOfYears *12)) ;

          double totalPayment = monthlyPayment * numberOfYears * 12 ;

            System.out.printf("%-5.3f%-14s%-15.2f%15.2f", monthlyInterestRate, "%", monthlyPayment, totalPayment);
            monthlyInterestRate += 0.125;
            System.out.println();
        }

    }
}
