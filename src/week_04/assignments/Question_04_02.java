package week_04.assignments;

import java.util.*;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius = 6_371.01;
        double radiansX1 = Math.toRadians(x1);
        double radiansY1 = Math.toRadians(y1);

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radiansX2 = Math.toRadians(x2);
        double radiansY2 = Math.toRadians(y2);

        double distanceBetweenTheTwoPoints = radius *
                Math.acos((Math.sin(radiansX1) * Math.sin(radiansX2)) +
                        Math.cos(radiansX1) * Math.cos(radiansX2) *
                                Math.cos(radiansY1 - radiansY2));
        System.out.println("The distance between the two points is " + distanceBetweenTheTwoPoints + " km");


    }
}

