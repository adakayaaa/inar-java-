package week_02.assignments;

import java.util.*;

public class Question_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rage in percentage: ");
        double annualInterestRage = input.nextDouble();
        double monthlyInterestRage = annualInterestRage/1200;

        System.out.println("Enter number of years: ");
        int years= input.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow ((1+ monthlyInterestRage), (years*12));

        System.out.println("Accumulated value is " + futureInvestmentValue);



    }
}

