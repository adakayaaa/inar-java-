package week_02.assignments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the monthly saving amount ");

        double monthlySavingAmount = input.nextDouble();
        double annualInterestRate = 0.00417;

        double months1 = monthlySavingAmount * (1 + annualInterestRate);
        double months2 = (monthlySavingAmount + months1) * (1 + annualInterestRate);
        double months3 = (monthlySavingAmount + months2) * (1 + annualInterestRate);
        double months4 = (monthlySavingAmount + months3) * (1 + annualInterestRate);
        double months5 = (monthlySavingAmount + months4) * (1 + annualInterestRate);
        double months6 = (monthlySavingAmount + months5) * (1 + annualInterestRate);

        System.out.println(" After the six month, the account value is " + months6);
    }
}

