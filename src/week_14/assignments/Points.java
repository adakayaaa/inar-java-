package week_14.assignments;

public class Points implements Comparable<Points> {
    private double x;
    private double y;
    public Points(){

    }
    public Points(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Points o) {
        if (o.getX() == this.getX()) {
            if (this.getY() > o.getY()) {
                return 1;
            } else if (this.getY() == this.getY()) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if (this.getX() > o.getX()) {
                return 1;
            } else {
                return -1;
            }
        }
    }


}
