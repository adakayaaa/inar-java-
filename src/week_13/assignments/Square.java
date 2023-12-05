package week_13.assignments;

public class Square extends GeometricObject implements  Colorable {
    private double side;

    public Square(){

    }
    public Square(double side){
        this.side=side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }

    @Override
    public String toString(){
        return super.toString() ;
    }
}
