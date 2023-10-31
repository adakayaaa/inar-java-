package week_09.assignments;

public class RegularPolygon {

    private int n ;
    private double side ;

    private double x ;
    private double y;

    RegularPolygon(int n, double side, double x,double y ){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    RegularPolygon(int n, double side){
        this(n,side,0,0);
    }
    RegularPolygon(){
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
    }
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return n;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y){
        this.y=y;
    }

    public double getPerimeter(){
        return side*n;
    }
    public double getArea(){
        return ((n*side*side)/(4*Math.tan(Math.PI/n)));
    }
}
