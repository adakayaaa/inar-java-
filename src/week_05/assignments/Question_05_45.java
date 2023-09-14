package week_05.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double totalNumber = 0;
        double numberOfDeviaton = 0;
        int numberCount = 1;

        while (numberCount <= 10) {
            double number = input.nextDouble();
            totalNumber += number;
            numberOfDeviaton += Math.pow(number, 2);
            numberCount++;
        }

        double mean = totalNumber / 10;
        double deviation = Math.sqrt((numberOfDeviaton - (Math.pow(totalNumber, 2) / 10)) / 9);

        System.out.printf("%s%.2f", "The mean is ", mean);
        System.out.printf("\n%s%.5f", "The standard deviation is ", deviation);

    }
}
