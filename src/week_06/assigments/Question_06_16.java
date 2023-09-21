package week_06.assigments;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year" + "   " + "Days in year");
        printNumberOfDaysInYear(2000);
    }

    public static void printNumberOfDaysInYear(int year) {
        while (year <= 2020) {
            System.out.println(year + "   " + numberOfDaysInYear(year));
            year++;
        }
    }

    public static int numberOfDaysInYear(int year) {

        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }

    }

    public static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        }
        return false;

    }
}
