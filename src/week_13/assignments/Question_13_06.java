package week_13.assignments;

public class Question_13_06 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(16.5);
        circle1.setColor("blue");
        boolean isFilled = true;
        circle1.setFilled(isFilled);

        System.out.println("ComparableCircle1: ");
        System.out.println(circle1.toString());
        System.out.println("----------------------------");

        ComparableCircle circle2 = new ComparableCircle(20.3);
        circle2.setColor("purple");
        circle2.setFilled(isFilled);
        System.out.println("ComparableCircle2: ");
        System.out.println(circle2.toString());

        System.out.println("----------------------------");

        if(circle1.compareTo(circle2)==1){
            System.out.println("ComparableCircle1 is the larger of the two Circles");
        }else if(circle1.compareTo(circle2) ==-1){
            System.out.println("ComparableCircle2 is the larger of the two Circles");
        }else{
            System.out.println("The area of both circles is the same.");
        }


    }
}
