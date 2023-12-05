package week_13.assignments;

public class Question_13_09 {
    public static void main(String[] args) {
        Circle circle1=new Circle(5.0);
        Circle circle2=new Circle(6.0);
        Circle circle3=new Circle(5.0);

        System.out.println(circle1.toString());
        System.out.println("------------------------");
        System.out.println(circle2.toString());
        System.out.println("------------------------");
        System.out.println(circle3.toString());
        System.out.println("------------------------\n");


        if(circle1.equals(circle2)){
            System.out.println("Circle1 is equal to Circle2");
        }else{
            System.out.println("Circle1 is not equal to Circle2");
        }

        if(circle1.equals(circle3)){
            System.out.println("Circle1 is equal to Circle3");
        }else{
            System.out.println("Circle1 is not equal to Circle3");
        }
    }
}
