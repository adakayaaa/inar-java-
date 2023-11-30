package week_03.assignments;

import java.util.*;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter today's day: ");
        int today = input.nextInt();

        System.out.println(" Enter the number of days elapsed since today: ");
        int daysElapsedSinceToday = input.nextInt();
        int futureDay = (today + daysElapsedSinceToday) %7 ;

        System.out.print( " Today is " );

        switch (today) {
            case 0:
                System.out.print(" Sunday ");
                break;
            case 1:
                System.out.print(" Monday ");
                break;
            case 2:
                System.out.print(" Tuesday ");
                break;
            case 3:
                System.out.print(" Wednesday ");
                break;
            case 4:
                System.out.print(" Thursday ");
                break;
            case 5:
                System.out.print(" Friday ");
                break;
            case 6:
                System.out.print(" Saturday ");
        }

        System.out.print( "and the future day is");

        if (futureDay == 0)
            System.out.println(" Sunday ");
        else if (futureDay == 1)
            System.out.println(" Monday ");
        else if (futureDay == 2)
            System.out.println(" Tuesday");
        else if (futureDay == 3)
            System.out.println(" Wednesday ");
        else if (futureDay == 4)
            System.out.println(" Thursday ");
        else if (futureDay == 5)
            System.out.println(" Friday ");
        else
            System.out.println(" Saturday ");


    }
}

