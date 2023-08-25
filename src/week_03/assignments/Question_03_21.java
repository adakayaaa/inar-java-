package week_03.assignments;

import java.util.*;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter year: (e.g, 2012) : ");
        int year = input.nextInt();

        System.out.println(" Enter month: 1-12 : ");
        int month = input.nextInt();

        System.out.println(" Enter the day of the month: 1-31 : ");
        int theDayOfTheMonth = input.nextInt();

        if ((month == 1) || (month == 2)) {
            month = (month == 1) ? 13 : 14;
            year = year - 1;

        }

        int theDayOfTheWeek = ((theDayOfTheMonth + ((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) +
                ((year / 100) / 4) + (5 * (year / 100))) % 7);

        System.out.print("Day of the week is");
        switch (theDayOfTheWeek) {
            case 0:
                System.out.println(" Saturday ");
                break;
            case 1:
                System.out.println(" Sunday ");
                break;
            case 2:
                System.out.println(" Monday ");
                break;
            case 3:
                System.out.println(" Tuesday ");
                break;
            case 4:
                System.out.println(" Wednesday ");
                break;
            case 5:
                System.out.println(" Thursday ");
                break;
            case 6:
                System.out.println(" Friday ");
                break;

        }
    }
}
