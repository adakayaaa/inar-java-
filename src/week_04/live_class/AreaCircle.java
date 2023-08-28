package week_04.live_class;

import java.sql.SQLOutput;
import java.util.*;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");

        double radius = input.nextDouble();
        double area = (Math.pow(radius, 2)) * Math.PI;

        System.out.println("Area is " + area);

        //aşağı yuvarlama
        System.out.println(" Area is " + Math.floor(area));

        //yukarı yuvarlama
        System.out.println(" Area is " + Math.ceil(area));

        //en yakına yuvarlama
        System.out.println(" Area is " + Math.round(area));



    }
}
