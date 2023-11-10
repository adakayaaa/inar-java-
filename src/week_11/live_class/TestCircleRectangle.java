package week_11.live_class;

public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle=
                new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle: " +circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The radius is " + circle.getArea());
        System.out.println("The radius is " + circle.getPerimeter());


        RectangleFromGeometricObject rectangle= new RectangleFromGeometricObject(2,4);
        System.out.println("\nRectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea() );
        System.out.println("The perimeter is " + rectangle.getPerimeter());



    }
}
