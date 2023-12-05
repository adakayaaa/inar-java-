package week_13.assignments;


public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

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
        return super.toString() +
                "\nHeight :" + this.getHeight() +
                "\nWidth : " + this.getWidth() +
                "\nThe rectangle's perimeter is " + this.getPerimeter() +
                "\nThe rectangle's area is " + this.getArea();
    }


    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this.getArea() == ((Rectangle) o).getArea()) {
            return true;
        } else {
            return false;
        }
    }

}

