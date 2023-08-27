package week_03.assignments;

import java.util.*;

public class Question_03_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter x1, y1 ,x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = (y1-y2);
        double b= (x2-x1);
        double c = (y3-y4);
        double d = (x4-x3);
        double e = a*x1 - (-b)*y1;
        double f = c*x3 - (-d)*y3;
        double cramerRuleX = (e*d -b*f) /(a*d-b*c);
        double cramerRuleY = (a*f -e*c) /(a*d-b*c);

        if (a*d -b*c == 0){
            System.out.println("The two lines are parallel");
        }else {
            System.out.println("The intersecting point is at (" + cramerRuleX + "," + cramerRuleY + ")");
        }




    }
}
