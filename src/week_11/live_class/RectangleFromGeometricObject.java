package week_11.live_class;

import week_09.assignments.Rectangle;

public class RectangleFromGeometricObject
        extends SimpleGeometricObject {
    private double width;
    private double height;

    public RectangleFromGeometricObject() {

    }
    public RectangleFromGeometricObject(double width,double height) {
        this.height=height;
        this.width= width;

    }
    public RectangleFromGeometricObject(String color,boolean filled,double width,double height) {
        setColor(color);
        setFilled(filled);
        this.height=height;
        this.width= width;
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

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

}

