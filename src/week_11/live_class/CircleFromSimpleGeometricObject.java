package week_11.live_class;

public class CircleFromSimpleGeometricObject
        extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {

    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "The circle is created " + super.getDateCreated() +
                "\nand the radius is " + radius;
    }

}
