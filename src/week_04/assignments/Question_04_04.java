package week_04.assignments;

import java.sql.SQLOutput;
import java.util.*;

public class Question_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        double area = (int) (((6 * Math.pow(side, 2))
                / (4 * Math.tan(Math.PI / 6))) * 100) / 100.0;

        System.out.println("The area of the hexagon is " + area);
    }
}
