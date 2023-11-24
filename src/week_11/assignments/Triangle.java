package week_11.assignments;

import week_12.assignments.IllegalTriangleException;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
      this.side1=1.0;
      this.side2=1.0;
      this.side3=1.0;

    }
    public Triangle(double side1,double side2,double side3) throws IllegalTriangleException {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException(side1, side2, side3);
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }

    @Override
    public String toString(){
        return ("Triangle: side1 :"  + side1 + " side2: " + side2  + " side3: "+ side3);
     }
}
