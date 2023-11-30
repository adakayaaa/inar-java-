package week_09.assignments;

public class Question_09_08 {
    public static void main(String[] args) {
        Fan fan= new Fan(Fan.FAST,true,10,"yellow");
        System.out.println(fan.toString());

        System.out.println("-----------------------------------------");

        Fan fan1 = new Fan();
        System.out.println(fan1.toString());
    }
}

