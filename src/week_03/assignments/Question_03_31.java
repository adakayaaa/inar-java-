package week_03.assignments;

import java.util.*;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();


        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertChange = input.nextInt() ;

        if (convertChange == 0) {
            System.out.println(" Enter the dollar amount: ");
            double dollars= input.nextDouble();
            double RMB = (int)(dollars * exchangeRate*100)/100.0;
            System.out.println("$" + dollars + " is " + RMB + " yuan" );

        } else if (convertChange == 1) {
            System.out.println(" Enter the RMB amount: ");
            double RMB = input.nextDouble();
            double dollars = (int)(RMB / exchangeRate*100)/100.0 ;
            System.out.println( RMB + " yuan is " +"$" + dollars );

        }else {
            System.out.println("Incorrect input ");
        }


    }
}

