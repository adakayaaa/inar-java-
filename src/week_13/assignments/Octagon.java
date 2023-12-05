package week_13.assignments;


public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {

    }

    public Octagon(double side) {
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    @Override
    public boolean equals(Object o) {
        if (this.getArea() == ((Octagon) o).getArea()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSide :" + this.side +
                "\nThe rectangle's perimeter is " + this.getPerimeter() +
                "\nThe rectangle's area is " + this.getArea();
    }
}

