package week_03.assignments;

import java.util.*;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1CenterX = input.nextDouble();
        double r1CenterY = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2CenterX = input.nextDouble();
        double r2CenterY = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();



        /*Hint: A point is in the rectangle
        if its horizontal distance to r2CenterX-r1CenterX  is less than or equal to widht1/2 and its
        vertical distance to r2CenterY-r1CenterY is less than or equal to height1/2
        */
        if ( (Math.abs ( r2CenterX-r1CenterX )<= width1/2 ) &&  (Math.abs (r2CenterY-r1CenterY)<= height1/2 ) &&
                (((width2 < width1) || (width2 < height1)) && ((height2 < height1) || (height2 < width1)))) {
            System.out.println(" r2 is inside r1 ");

            // We calculate the else-if by considering the coordinates of the corner points of the rectangles.
            // dikdörtgenlerin köşe noktalarının koordinatlarını düşünerek else-if hesaplıyoruz.
        } else if ((r2CenterX - width2 / 2 > r1CenterX + width1 / 2)
                || (r2CenterX + width2 / 2 < r1CenterX - width1 / 2)
                || (r1CenterY + height1 / 2 < r2CenterY - height2 / 2)
                || (r1CenterY - height1 / 2 > r2CenterY + height2 / 2)) {
            System.out.println(" r2 does not overlap r1 ");

        } else {
            System.out.println(" r2 overlaps r1");
        }

    }
}
