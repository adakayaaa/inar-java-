package week_10.assignments;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint myPoint= new MyPoint();
        MyPoint myPoint1 =new MyPoint(10.0,30.5);

        System.out.println("The distance between (" + myPoint.getX() +"," + myPoint.getY() +") and (" +
                myPoint1.getX() +"," + myPoint1.getY() +") is: " +myPoint.distance(myPoint1));

        //or you can use twice method -> myPoint.distance(double x, double y)
        System.out.println(myPoint.distance(10,30.5));
    }
}

