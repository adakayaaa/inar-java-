package week_13.assignments;

public class ComparableCircle extends Circle {
    private double radius;
    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
       super(radius);
    }
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }

}
