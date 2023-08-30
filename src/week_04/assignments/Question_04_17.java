package week_04.assignments;

import java.util.*;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month: ");
        String month = input.next();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug")
                || month.equals("Oct") || month.equals("Dec")) {
            System.out.println(month + " " + year + " has 31 days.");
        } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            System.out.println(month + " " + year + "has 30 days. ");

        } else if (month.equals("Feb")) {
            if (isLeapYear) {
                System.out.println("Feb " + year + " has 29 days.");
            } else {
                System.out.println("Feb " + year + " has 28 days.");
            }
        } else {
            System.out.println("invalid input");
        }
    }
}

