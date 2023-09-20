package week_06.assigments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double tempMax = Math.max(num1, num2);
        double max = Math.max(tempMax, num3);

        double tempMin = Math.min(num1, num2);
        double min = Math.min(tempMin, num3);

        double mid;
        if (num1 != max && num1 != min) {
            mid = num1;

        } else if (num2 != max && num2 != min) {
            mid = num2;

        } else {
            mid = num3;
        }

        System.out.println(min + " " + mid + " " + max);
    }
}
