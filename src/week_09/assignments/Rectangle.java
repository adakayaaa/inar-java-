package week_09.assignments;

public class Rectangle {
    private double height;
    private double weight;

    Rectangle() {
        this.height = 1;
        this.weight = 1;
    }

    Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getArea(){
        return (weight*height);
    }
    public double getPerimeter(){
        return (weight+height)*2;
    }
}

