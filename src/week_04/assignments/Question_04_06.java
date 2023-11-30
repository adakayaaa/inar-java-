package week_04.assignments;

import java.sql.SQLOutput;
import java.util.*;

public class Question_04_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 40;
        double angleA = (Math.random() * Math.PI) * 2;
        double angleB = (Math.random() * Math.PI) * 2;
        double angleC = (Math.random() * Math.PI) * 2;

        double x1 = radius * Math.cos(angleA);
        double y1 = radius * Math.sin(angleA);


        double x2 = radius * Math.cos(angleB);
        double y2 = radius * Math.sin(angleB);

        double x3 = radius * Math.cos(angleC);
        double y3 = radius * Math.sin(angleC);

        double x1y1ToX2y2 = Math.acos((Math.sin(x1) * Math.sin(x2)) +
                Math.cos(x1) * Math.cos(x2) *
                        Math.cos(y1 - y2));

        double x1y1ToX3y3 = Math.acos((Math.sin(x1) * Math.sin(x3)) +
                Math.cos(x1) * Math.cos(x3) *
                        Math.cos(y1 - y3));

        double x3y3ToX2y2 = Math.acos((Math.sin(x3) * Math.sin(x2)) +
                Math.cos(x3) * Math.cos(x2) *
                        Math.cos(y3 - y2));

        double angleAOfTriangle = Math.toDegrees(Math.acos((Math.pow(x3y3ToX2y2, 2) - Math.pow(x1y1ToX3y3, 2) - Math.pow(x1y1ToX2y2, 2))
                / (-2 * x1y1ToX3y3 * x1y1ToX2y2)));

        double angleBOfTriangle = Math.toDegrees(Math.acos((Math.pow(x1y1ToX3y3, 2) - Math.pow(x3y3ToX2y2, 2) - Math.pow(x1y1ToX2y2, 2))
                / (-2 * x3y3ToX2y2 *x1y1ToX2y2)));

        double angleCOfTriangle = Math.toDegrees(Math.acos((Math.pow(x1y1ToX2y2, 2) - Math.pow(x1y1ToX3y3, 2) - Math.pow(x3y3ToX2y2, 2))
                / (-2 * x1y1ToX3y3 *x3y3ToX2y2)));

        double totalAngle =  angleCOfTriangle + angleAOfTriangle + angleBOfTriangle;

        System.out.println( "Total angle is " + totalAngle);
        System.out.println("The three angles are " + angleAOfTriangle + "  " +angleBOfTriangle + "  " +angleCOfTriangle);

    }


}

