package week_03.assignments;

import java.util.*;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int theTimeZoneOffset = input.nextInt();

        long milliSeconds = System.currentTimeMillis();
        long totalSeconds = milliSeconds / 1000;

        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;
        int currentHourGMT = (int) (currentHour) + theTimeZoneOffset;

        if (currentHourGMT > 12) {
            currentHourGMT = currentHourGMT % 12;
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":"
                    + currentSeconds + " PM");
        }
        if (currentHourGMT == 12) {
            currentHourGMT = 0;
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":"
                    + currentSeconds + " AM");
        }


    }
}
