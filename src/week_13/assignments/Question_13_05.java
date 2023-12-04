package week_13.assignments;

import week_12.assignments.IllegalTriangleException;

public class Question_13_05 {
    public static void main(String[] args) throws IllegalTriangleException {
        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Circle(40);
        geometricObjects[0].setColor("red");
        geometricObjects[1] = new Circle(50.4);
        geometricObjects[1].setColor("green");

        System.out.println("The larger of two circles is: ");
        System.out.println(geometricObjects[0].max(geometricObjects[1]));
        System.out.println("-------------------------------------------");

        geometricObjects[2] = new Rectangle(15, 12);
        geometricObjects[2].setColor("blue");
        geometricObjects[3] = new Rectangle(20, 30.3);
        geometricObjects[3].setColor("green");

        System.out.println("The larger of two rectangles is: ");
        System.out.println(geometricObjects[2].max(geometricObjects[3]));


    }
}
