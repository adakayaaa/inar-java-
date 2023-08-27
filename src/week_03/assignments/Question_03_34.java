package week_03.assignments;

import java.util.*;

public class Question_03_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1 and p2:  ");
        double pX0 = input.nextDouble();
        double pY0 = input.nextDouble();
        double p1X = input.nextDouble();
        double p1Y = input.nextDouble();
        double p2X = input.nextDouble();
        double p2Y = input.nextDouble();


        if (pX0 >p1X) {
            double temp = p1X;
            p1X = p2X;
            p2X = temp;
            double temp2 = p1Y;
            p1Y = p2Y;
            p2Y = temp2;
        }

        double side = (p1X - pX0) * (p2Y - pY0) - (p2X - pX0) * (p1Y - pY0);

        if (side == 0) {
            if (p2X < p1X && pX0 < p2X) {
                System.out.println("(" + p2X + "," + p2Y + ") is on the line segment from " +
                        "(" + pX0 + "," + pY0 + ")" + " to " + "(" + p1X + "," + p1Y + ")");
            } else {
                System.out.println("(" + p2X + "," + p2Y + ") is not on the line segment from " +
                        "(" + pX0 + "," + pY0 + ")" + " to " + "(" + p1X + "," + p1Y + ")");
            }

        }else {
            System.exit(1);
        }
    }
}

