package week_03.assignments;
import java.util.*;
public class Question_03_28 {
    public static void main (String [] args) {
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

        double centerDistance = Math.pow (Math.pow( (r1CenterX-r2CenterX),2) +  Math.pow( (r1CenterY-r2CenterY),2),2);




    }
}
