package week_03.assignments;

import java.sql.SQLOutput;
import java.util.*;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b , c :");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double root1 = (-b + (Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5))) / (2 * a);
        double root2 = (-b - (Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5))) / (2 * a);

        final double DISCRIMINANT = Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5);

        if (DISCRIMINANT > 0) {
            System.out.println(" The equation has two roots " + root1 + " and " + root2);
        } else if (DISCRIMINANT == 0) {
            System.out.println(" The equation has one roots " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
