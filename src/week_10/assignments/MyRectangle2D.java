package week_10.assignments;

public class MyRectangle2D {
    private double x;
    private double y;
    private double height;
    private double weight;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = this.x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = this.y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = this.height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = this.weight;
    }

    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.weight = 1;
        this.height = 1;
    }

    MyRectangle2D(double x, double y, double weight, double height) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.height = height;
    }

    public double getArea() {
        return weight * height;
    }

    public double getPerimeter() {
        return 2 * (weight + height);
    }

    public boolean contains(double x, double y) {
        if ((x > this.x - weight / 2 && x < this.x + weight / 2) &&
                (y > this.y - weight / 2 && y < this.y + weight / 2)) {
            return true;
        }
        return false;
    }

    public boolean contains(MyRectangle2D rectangle) {
        if ((Math.abs(rectangle.getX() - this.x) <= this.weight / 2) && (Math.abs(rectangle.getY() - this.getY()) <= height / 2) &&
                (((rectangle.getWeight() < this.weight)
                        || (rectangle.getWeight() < this.height)) && ((rectangle.getHeight() < this.height) || (rectangle.getHeight() < this.weight)))) {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D rectangle) {
        if ((rectangle.getX() - rectangle.getWeight() / 2 > this.getX() + this.getWeight() / 2)
                || (rectangle.getX() + rectangle.getWeight() / 2 < this.getX()- this.getWeight() / 2)
                ||(this.getY()+ this.getHeight() / 2<rectangle.getY() - rectangle.getHeight() / 2 )
                || ( this.getY()- this.getHeight() / 2 >rectangle.getY() + rectangle.getHeight() / 2)){
            return false;

        }
        return true;
    }
}
