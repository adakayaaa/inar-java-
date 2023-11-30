package week_03.assignments;

import java.util.*;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double coordinateX = input.nextDouble();
        double coordinateY = input.nextDouble();

        /*Hint: A point is in the rectangle
        if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
        vertical distance to (0, 0) is less than or equal to 5.0 / 2.
        */

        if ((Math.abs(coordinateX) <= 5)
                && (Math.abs(coordinateY) <= 5.0 / 2.0)) {
            System.out.println("Point (" + coordinateX + "," + coordinateY + ") is in the rectangle");
        } else {
            System.out.println("Point (" + coordinateX + "," + coordinateY + ") is not in the rectangle");
        }

    }
}

