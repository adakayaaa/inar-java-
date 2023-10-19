package week_08.assignments;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        System.out.print("Enter the filing status" +
                " (0-single filer, 1-married jointly or qualifying widow(er)" +
                "2-married separately, 3-head of household) :");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        int income = input.nextInt();

        System.out.println("Tax is $" + computeTax(rates, brackets, status, income));


    }

    public static double computeTax(double[] rates, int[][] brackets, int status, int income) {
        double tax = 0;

        if (income <= brackets[status][0]) {
            tax = income * rates[0];

        } else if (income <= brackets[status][1]) {
            tax = brackets[status][0] * rates[0] +
                    (income - brackets[status][0]) * rates[1];

        } else if (income <= brackets[status][2]) {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1])
                    + (income - brackets[status][1]) * rates[2];

        } else if (income <= brackets[status][3]) {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1]) +
                    ((brackets[status][2] - brackets[status][1]) * rates[2]) +
                    ((income - brackets[status][2]) * rates[3]);

        } else if (income <= brackets[status][4]) {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1]) +
                    ((brackets[status][2] - brackets[status][1]) * rates[2]) +
                    ((brackets[status][3] - brackets[status][2]) * rates[3]) +
                    ((income - brackets[status][3]) * rates[4]);

        } else {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1]) +
                    ((brackets[status][2] - brackets[status][1]) * rates[2]) +
                    ((brackets[status][3] - brackets[status][2]) * rates[3]) +
                    ((brackets[status][4] - brackets[status][3]) * rates[4]) +
                    ((income - brackets[status][4]) * rates[5]);
        }
        return tax;
    }
}
