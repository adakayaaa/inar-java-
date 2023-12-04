package week_13.assignments;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    public String toString() {
        return super.toString() +
                "\nRadius: " + this.getRadius()+
                "\nThe circle's perimeter is " + this.getPerimeter() +
                "\nThe circle's area is " + this.getArea() ;
    }
}

