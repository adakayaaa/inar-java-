package week_05.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();

        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = input.nextInt();

        double monthlyPayment = loanAmount * (annualInterestRate/1200) /
                (1- 1/ Math.pow (1+(annualInterestRate/1200) , numberOfYears *12)) ;
        System.out.println("Monthly Payment: " + monthlyPayment);

        double totalPayment = monthlyPayment * numberOfYears * 12 ;
        System.out.println("Total Payment: " + monthlyPayment);

        System.out.println("Payment#            Interest            Principal        Balance");
    }
}
