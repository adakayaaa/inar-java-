package week_13.assignments;

public class Question_13_10 {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(3,5);
        Rectangle rectangle2=new Rectangle(4,5);
        Rectangle rectangle3=new Rectangle(3,5);

        System.out.println("Rectangle1 is: " +rectangle1.toString());
        System.out.println("--------------------------------");
        System.out.println("Rectangle2 is: " +rectangle2.toString());
        System.out.println("--------------------------------");
        System.out.println("Rectangle3 is: " +rectangle3.toString());
        System.out.println("--------------------------------");

        if(rectangle1.equals(rectangle2)){
            System.out.println("Rectangle1 is equal to Rectangle2");
        }else{
            System.out.println("Rectangle1 is not equal to Rectangle2");
        }

        if(rectangle1.equals(rectangle3)){
            System.out.println("Rectangle1 is equal to Rectangle3");
        }else{
            System.out.println("Rectangle1 is not equal to Rectangle3");
        }
    }
}
