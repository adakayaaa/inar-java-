package week_10.assignments;

public class Question_10_13 {
    public static void main(String[] args) {
        //Look again: Overloop

        MyRectangle2D rectangle= new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Rectangle:");
        System.out.println("-----------------------------");
        System.out.println("Area     :" +rectangle.getArea());
        System.out.println("Perimeter:" +rectangle.getPerimeter());
        System.out.println("-----------------------------");
        System.out.println("The rectangle " + ((rectangle.contains(3,3)? "contains" : "does not contain") + " the point (3,3).") );

        MyRectangle2D rectangle2= new MyRectangle2D(4,5,10.5,3.2);
        System.out.println("The rectangle " + ((rectangle.contains(rectangle2)? "contains" : "does not contain") + " the point (4,5,10.5,3.2).") );

        MyRectangle2D rectangle3=new MyRectangle2D(3,5,2.3,5.4);
        System.out.println("The rectangle " + ((rectangle.overlaps(rectangle3)? "overlaps" : "does not overlap") + " the point (3,5,2.3,5.4).") );


    }
}

