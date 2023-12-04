package week_13.assignments;

import week_13.assignments.GeometricObject;

import java.util.Arrays;


public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Circle(3);
        geometricObjects[1] = new Circle(4);
        geometricObjects[2]  = new Rectangle(3, 4);
        geometricObjects[3]  = new Rectangle(5, 5);


        Arrays.sort(geometricObjects);
        System.out.println(Arrays.toString(geometricObjects));
        System.out.println("Sum: " + sum(geometricObjects));



    }

    public static double sum(GeometricObject[] list) {
        double sum=0;
        for (int i = 0; i < list.length; i++) {
            System.out.println(i+"-->"+ list[i].getArea());
            sum+=list[i].getArea();
        }
        return sum;
    }
}

