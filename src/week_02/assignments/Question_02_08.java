package week_02.assignments;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the time zone offset to GMT: ");
        int timeZoneOffset = input.nextInt();

        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;

        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60 ;

        long currentHour = totalHours % 24;
        currentHour = (currentHour + timeZoneOffset) % 24;

        System.out.println("The current time is " + currentHour +
                ":" + currentMinute + ":" + currentMinute);




    }
}
