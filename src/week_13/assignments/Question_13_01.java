package week_13.assignments;

import week_12.assignments.IllegalTriangleException;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color: ");
        String color = input.next();

        System.out.println("Enter : is Filled? true or false: ");
        String isFilled = input.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        if (isFilled.equals("true")|| isFilled.equals("True")) {
            triangle.setFilled(true);
        } else {
            triangle.setFilled(false);
        }

        System.out.println(triangle.toString());
    }

}
