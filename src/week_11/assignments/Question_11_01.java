package week_11.assignments;

import week_12.assignments.IllegalTriangleException;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("Enter a color : ");
        String color = input.next();
        triangle.setColor(color);

        System.out.println("Is the triangle filled (true/false) : ");
        String filled= input.next();
        if(filled.equals("true")){
            triangle.setEmpty(true);
        }else{
            triangle.setEmpty(false);
        }




        System.out.println(triangle.toString());
        System.out.println(" Area : " + triangle.getArea());
        System.out.println("Perimeter " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println(triangle.isEmpty);


    }
}
