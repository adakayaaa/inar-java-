package week_03.assignments;

import java.sql.SQLOutput;
import java.util.*;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;

        System.out.println("Enter feet: ");
        double heighInFeet = input.nextDouble();
        double feetInMeters = heighInFeet * 0.3048;

        System.out.println("Enter inches: ");
        double heighInInch = input.nextDouble();
        double heighInMeters = (heighInInch * 0.0254) + (feetInMeters);

        double bodyMassIndex = weightInKilograms / Math.pow(heighInMeters, 2);
        System.out.println(" BMI is " + bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println(" Underweight ");
        }else if (18.5 <= bodyMassIndex && bodyMassIndex < 25.0) {
            System.out.println(" Normal ");
        }else if (25.0 <= bodyMassIndex && bodyMassIndex < 30.0) {
            System.out.println(" Overweight ");
        }else {
            System.out.println("Obese ");

        }
    }
}
