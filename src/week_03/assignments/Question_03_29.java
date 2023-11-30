package week_03.assignments;

import java.util.*;

public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, and radius : ");
        double circle1CenterX = input.nextDouble();
        double circle1CenterY = input.nextDouble();
        double circle1R = input.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates and radius: ");
        double circle2CenterX = input.nextDouble();
        double circle2CenterY = input.nextDouble();
        double circleR2 = input.nextDouble();

        double circleDistance = Math.pow((Math.pow((circle1CenterX - circle2CenterX), 2) +
                Math.pow((circle1CenterY - circle2CenterY), 2)), 0.5);

        if (circleDistance <= Math.abs(circle1R - circleR2 * 2)) {
            System.out.println(" circle2 is inside circle1");
        } else if (circleDistance <= circle1R + circleR2) {
            System.out.println("circle2 overlaps circle1");
        } else if (circleDistance > circle1R + circleR2) {
            System.out.println("circle2 does not overlap circle1");
        }

    }
}

