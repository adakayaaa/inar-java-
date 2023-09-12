package week_05.live_class;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print(" Enter first day of the year: ");
        int day = input.nextInt();

        for (int month = 1; month <= 12; month++) {
            if (month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11) {
                day += 3;
            } else if (month == 5 || month == 7 || month == 10 || month == 12) {
                day += 2;

            } else if (month == 3) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day += 1;
                }
            }
            switch (month) {
                case 1:
                    System.out.print("January 1 " + year + " is ");
                    break;
                case 2:
                    System.out.print("February 1 " + year + " is ");
                    break;
                case 3:
                    System.out.print("March 1 " + year + " is ");
                    break;
                case 4:
                    System.out.print("April 1 " + year + " is ");
                    break;
                case 5:
                    System.out.print("May 1 " + year + " is ");
                    break;
                case 6:
                    System.out.print("June 1 " + year + " is ");
                    break;
                case 7:
                    System.out.print("July 1 " + year + " is ");
                    break;
                case 8:
                    System.out.print("August 1 " + year + " is ");
                    break;
                case 9:
                    System.out.print("September 1 " + year + " is ");
                    break;
                case 10:
                    System.out.print("October 1 " + year + " is ");
                    break;
                case 11:
                    System.out.print("November 1 " + year + " is ");
                    break;
                case 12:
                    System.out.print("December 1 " + year + " is ");
            }
            switch (day % 7) {
                case 0:
                    System.out.println(" Sunday");
                    break;
                case 1:
                    System.out.println(" Monday");
                    break;
                case 2:
                    System.out.println(" Tuesday");
                    break;
                case 3:
                    System.out.println(" Wednesday");
                    break;
                case 4:
                    System.out.println(" Thursday");
                    break;
                case 5:
                    System.out.println(" Friday");
                    break;
                case 6:
                    System.out.println(" Saturday");

            }

        }
    }

}
