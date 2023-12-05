package week_13.assignments;

import week_12.assignments.IllegalTriangleException;
import week_13.assignments.GeometricObject;

public class Question_13_07 {
    public static void main(String[] args) throws IllegalTriangleException {
        week_13.assignments.GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Square(5);
        geometricObjects[1] = new Circle(5);
        geometricObjects[2] = new Rectangle(5, 6);
        geometricObjects[3] = new Square(30);
        geometricObjects[4] = new Triangle(3, 4, 5);

        for (int i = 0; i < geometricObjects.length; i++) {
            System.out.println(geometricObjects[i].toString());
            if (geometricObjects[i] instanceof Colorable) {
                ((Colorable) geometricObjects[i]).howToColor();
            }
            System.out.println("------------------------------");
        }
    }
}
