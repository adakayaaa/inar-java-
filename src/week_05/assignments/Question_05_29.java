package week_05.assignments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g.2012) : ");
        int year = input.nextInt();

        System.out.print("Enter fist day of the year: ");
        int day = input.nextInt();

        for (int month = 1; month <= 12; month++) {
            int numberOfDaysInMonth = 0;

            switch (month) {
                case 1:
                    System.out.print("January");
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    System.out.print("February");
                    numberOfDaysInMonth = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                    day += 31;
                    break;
                case 3:
                    numberOfDaysInMonth = 31;
                    System.out.print("March");
                    day += ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 1 : 0;
                    break;
                case 4:
                    numberOfDaysInMonth = 30;
                    System.out.print("April");
                    day += 31;
                    break;
                case 5:
                    numberOfDaysInMonth = 31;
                    System.out.print("May");
                    day += 30;
                    break;
                case 6:
                    numberOfDaysInMonth = 30;
                    System.out.print("June");
                    day += 31;
                    break;
                case 7:
                    numberOfDaysInMonth = 31;
                    System.out.print("July");
                    day += 30;
                    break;
                case 8:
                    numberOfDaysInMonth = 31;
                    System.out.print("August");
                    day += 31;
                    break;
                case 9:
                    numberOfDaysInMonth = 30;
                    System.out.print("September ");
                    day += 31;
                    break;
                case 10:
                    numberOfDaysInMonth = 31;
                    System.out.print("October");
                    day += 30;
                    break;
                case 11:
                    numberOfDaysInMonth = 30;
                    System.out.print("November");
                    day += 31;
                    break;
                case 12:
                    numberOfDaysInMonth = 31;
                    System.out.print("December");
                    day += 31;
            }
            System.out.println("-" + year);
            System.out.println("-----------------------------------");
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            for (int j = 0; j < day % 7; j++) {
                System.out.printf("%5s", " ");
            }
            for (int j = 1; j <= numberOfDaysInMonth; j++) {
                if ((day + j) % 7 == 0) {
                    System.out.printf("%-5d\n", j);
                } else {
                    System.out.printf("%-5d", j);
                }
            }
            System.out.println("\n");

        }

    }
}
