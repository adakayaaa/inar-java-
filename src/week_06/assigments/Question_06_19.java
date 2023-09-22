package week_06.assigments;

import week_06.live_class.MyTriangle;

import java.util.Scanner;

public class Question_06_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides for a triangle: ");

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println(MyTriangle.isValid(side1, side2, side3)?
                "The area of the triangle is " + MyTriangle.area(side1, side2, side3) : "invalid input!" )  ;

    }


}
