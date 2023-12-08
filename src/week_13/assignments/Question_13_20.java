package week_13.assignments;

import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b , c :");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (b * b - (4 * a * c));
        double root1 = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-1 * b - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant > 0) {
            System.out.println(" The equation has two roots " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            System.out.println(" The equation has one roots " + root1);
        } else {
            discriminant*=-1;
            Complex rootOne = new Complex((-1*b)/2*a,-1*Math.sqrt(discriminant)/(2*a));
            Complex rootTwo = new Complex((-1*b)/2*a,Math.sqrt(discriminant)/(2*a));
            System.out.println(" The equation has two roots " + rootOne.toString() + " and " + rootTwo.toString());


        }
    }
}
