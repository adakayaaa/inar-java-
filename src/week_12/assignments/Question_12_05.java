package week_12.assignments;

import week_11.assignments.Triangle;

import java.util.Scanner;

public class Question_12_05  {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter three sides of the triangle: ");
        double side1= input.nextDouble();
        double side2= input.nextDouble();
        double side3= input.nextDouble();


        Triangle triangle=new Triangle(side1,side2,side3);
        System.out.println(triangle.toString() +
                "\nPerimeter of triangle is " + triangle.getPerimeter() +
                "\nArea of the triangle is " +triangle.getArea());

    }


}
