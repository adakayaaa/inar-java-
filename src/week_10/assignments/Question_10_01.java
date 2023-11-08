package week_10.assignments;

public class Question_10_01 {
    public static void main(String[] args) {
        Time time= new Time();

        System.out.println(time);
        time.setTime(550000000);
        System.out.println(time);

        Time time1= new Time(550000);
        System.out.println(time1);
        time1.setTime(System.currentTimeMillis());
        System.out.println(time1);



    }
}
