package week_04.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in dollars and cents: ");
        String amount = input.nextLine();
        int k = amount.indexOf(',');
        String dollar = amount.substring(0,k);
        String cents = amount.substring(k+1);

        int centsValues = Integer.parseInt(cents);
       int quarters = centsValues/25;
       int remainingValue = centsValues%25;

       int dimes = remainingValue/10;
       remainingValue = remainingValue%10;

       int nickels = remainingValue /5;
       remainingValue = remainingValue%5;

       int pennies = remainingValue;

        System.out.println("Equivalent in Monatery Units: ");
        System.out.println("Dollars: " + dollar);
        System.out.println("Quarters: " +quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " +pennies);

    }
}

