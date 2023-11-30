package week_06.assigments;


import java.sql.SQLOutput;

public class Question_06_24 {

    public static void main(String[] args) {

        printCalendar();

    }

    public static void printCalendar() {
        System.out.println("Current time and date is: ");


        long milliSecond = System.currentTimeMillis();

        int currentSecond = getCurrentSecond(milliSecond);
        int currentMinute = getCurrentMinute(milliSecond);
        int currentHour = getCurrentHour(milliSecond);
        System.out.println(currentHour + " : " + currentMinute + " : " + currentSecond);

        int currentYear = getCurrentYear(milliSecond);
        int currentMonth = getCurrentMonth(milliSecond);
        int currentDay = getCurrentDay(milliSecond);
        System.out.println(currentDay + " / " + currentMonth + " / " + currentYear);
    }

    public static int getTotalSecond(long milliSecond) {
        return (int) (milliSecond / 1000);
    }

    public static int getCurrentSecond(long milliSecond) {
        return getTotalSecond(milliSecond) % 60;
    }

    public static int getCurrentMinute(long milliSecond) {
        return getTotalMinute(milliSecond) % 60;
    }

    public static int getTotalMinute(long milliSecond) {
        return getTotalSecond(milliSecond) / 60;
    }

    public static int getTotalHour(long milliSecond) {
        return getTotalMinute(milliSecond) / 60;
    }

    public static int getCurrentHour(long milliSecond) {
        return getTotalHour(milliSecond) % 24;
    }

    public static int getCurrentYear(long milliSecond) {
        int totalDay = getTotalDay(milliSecond);
        int year = 1970;

        while (totalDay >= getTotalInAYear(year)) {
            totalDay -= getTotalInAYear(year);
            year++;
        }
        return year;
    }

    public static int getTotalDay(long milliSecond) {
        return getTotalHour(milliSecond) / 24;
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int getTotalInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static int getTotalDayInCurrentYear(long milliSecond) {
        int totalDay = getTotalDay(milliSecond);
        int year = 1970;

        while (totalDay >= getTotalInAYear(year)) {
            totalDay -= getTotalInAYear(year);
            year++;
        }

        return totalDay;
    }

    public static int getCurrentMonth(long milliSecond) {
        int totalDay = getTotalDayInCurrentYear(milliSecond);
        int year = getCurrentYear(milliSecond);
        int month = 1;
        while (totalDay > numberOfDayInAMonth(year, month)) {
            totalDay -= numberOfDayInAMonth(year, month);
            month++;
        }
        return month;
    }

    public static int numberOfDayInAMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 30;
        }
    }

    public static int getCurrentDay(long milliSecond) {
        int totalDay = getTotalDayInCurrentYear(milliSecond);
        int currentMonth = getCurrentMonth(milliSecond);
        int sum = 0;
        for (int i = 1; i < currentMonth; i++) {
            sum += numberOfDayInAMonth(getCurrentYear(milliSecond), i);
        }
        int currentDay = totalDay - sum + 1;
        return currentDay;
    }

}

