package week_13.assignments;

import week_11.live_class.SimpleGeometricObject;
import week_13.live_class.GeometricObject;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {

    }


    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;

    }

    public Rectangle(String color, boolean filled, double width, double height) {
        setColor(color);
        setFilled(filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    public String toString() {
        return "The rectangle's area is " + this.getArea();
    }


}

