package week_06.assigments;

import java.util.Scanner;

public class Question_06_24 {
    //this question haven't completed yet.
    public static void main(String[] args) {


        long totalMilliSeconds = System.currentTimeMillis();
        long totalDays= totalMilliSeconds/1000/60/24;
        int currentHour = getCurrentHour(totalMilliSeconds);
        int currentMinute = getCurrentMinute(totalMilliSeconds);
        int currentSeconds = getCurrentSeconds(totalMilliSeconds);
        System.out.println("The current time and date is " + (currentHour % 12) +
                ":" + currentMinute + ":" + currentSeconds +
                " " + ((currentHour > 12) ? "PM" : "AM"));
    }

    public static int getCurrentSeconds(long milliSeconds) {
        return getTotalSeconds(milliSeconds) % 60;
    }

    public static int getTotalSeconds(long milliSeconds) {
        return (int) (milliSeconds / 1000);
    }

    public static int getCurrentMinute(long milliSeconds) {
        return getTotalMinutes(milliSeconds) % 60;
    }

    public static int getTotalMinutes(long milliSeconds) {
        return getTotalSeconds(milliSeconds) / 60;
    }

    public static int getCurrentHour(long milliSeconds) {
        return getTotalHour(milliSeconds) % 24;
    }

    public static int getTotalHour(long milliSeconds) {
        return getTotalMinutes(milliSeconds) / 60;
    }


}

