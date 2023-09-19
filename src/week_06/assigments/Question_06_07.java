package week_06.assigments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("The interest rate: ");
        double interestRate = input.nextDouble();
        double monthlyInterestRate = interestRate / 1200;
        int years;

        for (years = 1; years <= 30; years++) {
            System.out.printf("%-3d%-10.2f", years, futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
            System.out.println();
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureInvestmentValue;
    }

}
