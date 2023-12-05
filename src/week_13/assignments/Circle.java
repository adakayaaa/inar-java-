package week_13.assignments;

public class Circle extends GeometricObject implements  Comparable<Circle>{
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


    @Override
    public int compareTo(Circle o) {
        if(this.getArea()<o.getArea()){
            return -1;
        }else if(this.getArea()>o.getArea()){
            return 1;
        }else{
            return 0;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this.getRadius() == ((Circle) o).getRadius()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return super.toString() +
                "\nRadius: " + this.getRadius()+
                "\nThe circle's perimeter is " + this.getPerimeter() +
                "\nThe circle's area is " + this.getArea() ;
    }


}

