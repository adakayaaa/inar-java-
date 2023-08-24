package week_02.assignments;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        System.out.println("Enter height in inches: ");

        double weightInPounds = input.nextDouble();
        double heightInPounds = input.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInPounds * 0.0254;

        double bodyMassIndex = weightInKilograms /
                (Math.pow (heightInMeters ,2));

        System.out.println("BMI is " + bodyMassIndex);

    }
}
