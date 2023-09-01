package week_04.assignments;
import java.util.*;
public class Question_04_07 {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        double x1 = radius * (Math.cos(Math.PI/10));
        double y1 = radius * (Math.sin(Math.PI/10));


        double x2 = radius * (Math.cos(Math.PI/2));
        double y2 = radius * (Math.sin(Math.PI/2));

        double x3 = radius * (Math.cos(9*Math.PI/10));
        double y3 = radius * (Math.sin(9*Math.PI/10));

        double x4 = radius * (Math.cos(13*Math.PI/10));
        double y4= radius * (Math.sin(13*Math.PI/10));

        double x5 = radius * (Math.cos(17*Math.PI/10));
        double y5 = radius * (Math.sin(17*Math.PI/10));

        System.out.println("The coordinates of five points on the pentagon are" ) ;
        System.out.println( "(" + x1 + "," +y1 + ")" ) ;
        System.out.println( "(" + x2 + "," +y2 + ")" ) ;
        System.out.println( "(" + x3 + "," +y3 + ")" ) ;
        System.out.println( "(" + x4 + "," +y4 + ")" ) ;
        System.out.println( "(" + x5 + "," +y5 + ")" ) ;
    }
}
