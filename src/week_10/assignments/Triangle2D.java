package week_10.assignments;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public MyPoint getP1() {
        return this.p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return this.p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return this.p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    Triangle2D() {
        this.p1 = new MyPoint(0, 0);
        this.p2 = new MyPoint(1, 1);
        this.p3 = new MyPoint(2, 5);
    }

    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = this.p1.distance(p2);
        double side2 = this.p2.distance(p3);
        double side3 = this.p1.distance(p3);
        double side = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
        return area;

    }

    public double getPerimeter() {
        double side1 = this.p1.distance(this.p2);
        double side2 = this.p2.distance(this.p3);
        double side3 = this.p1.distance(this.p3);
        return side1 + side2 + side3;
    }

}

