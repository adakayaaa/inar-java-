package week_03.assignments;

import java.util.*;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the amount (e.g 11,56): ");
        double amount = input.nextDouble();
        int newAmount = (int) (amount * 100);

        int dollars = newAmount / 100;
        int remainingAmount = newAmount % 100;

        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int pennies = remainingAmount;

        System.out.println("Your amount " + amount + " consist of ");

        System.out.println( (dollars > 1)? dollars + " dollars" : " 1 dollar ");
        System.out.println( ( quarters > 1)? quarters + " quarters " : " 1 quarter ");
        System.out.println( ( dimes > 1)? dimes + " dimes " : " 1 dime ");
        System.out.println( ( nickels > 1)? nickels + " nickels " : " 1 nickel ");
        System.out.println( ( pennies > 1)? pennies + " pennies " : " 1 penny ");










    }
}

