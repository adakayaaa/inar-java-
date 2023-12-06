package week_13.assignments;

public class Complex implements Cloneable {
    private double a;
    private double b;

    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public Complex add(Complex secondComplex) {
        double a = this.a + secondComplex.getA();
        double b = this.b + secondComplex.getB();
        return new Complex(a, b);
    }

    public Complex subtract(Complex secondComplex) {
        double a = this.a - secondComplex.getA();
        double b = this.b - secondComplex.getB();
        return new Complex(a, b);
    }

    public Complex multiply(Complex secondComplex) {
        double a = this.a * secondComplex.getA() - this.b * secondComplex.getB();
        double b = this.b * secondComplex.getA() + this.a * secondComplex.getB();
        return new Complex(a, b);
    }

    public Complex divide(Complex secondComplex) {
        double a = (this.a * secondComplex.getA() + this.b * secondComplex.getB()) / (Math.pow(secondComplex.getA(), 2) + Math.pow(secondComplex.getB(), 2));
        double b = (this.b * secondComplex.getA() - this.a * secondComplex.getB()) / (Math.pow(secondComplex.getA(), 2) + Math.pow(secondComplex.getB(), 2));
        ;
        return new Complex(a, b);
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }

    @Override
    public String toString() {
        if(this.b !=0){
            return "(" + this.getA() + " + " + this.getB() + "i)";
        }else{
            return "(" +this.getA() + ")";
        }
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }
}
