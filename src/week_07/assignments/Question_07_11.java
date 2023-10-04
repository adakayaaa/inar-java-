package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.printf("%-5s%1.2f", "The mean is ", mean(numbers));
        System.out.printf("\n%-5s%1.5f", "The standard deviation is ", deviation(numbers));
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        double meanOfNumber = sum / 10;
        return meanOfNumber;
    }

    public static double deviation(double[] x) {
        double deviationOfNumber = 0;
        for (int i = 0; i < x.length; i++) {
            deviationOfNumber += Math.pow(x[i] - mean(x), 2);
        }

        return Math.sqrt(deviationOfNumber / 9);
    }
}
