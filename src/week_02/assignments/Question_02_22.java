package week_02.assignments;

import java.util.*;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount as integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();

        int dollars = amount / 100;
        int remaningAmount = amount % 100;

        int quarters = remaningAmount / 25;
        remaningAmount = remaningAmount % 25;

        int dimes = remaningAmount / 10;
        remaningAmount = remaningAmount % 10;

        int nickels = remaningAmount / 5;
        remaningAmount = remaningAmount % 5;

        int pennies = remaningAmount;

        System.out.println("Your amount " + amount + " consist of ");
        System.out.println(" " + dollars + " dollars ");
        System.out.println(" " + quarters + " quarters ");
        System.out.println(" " + dimes + " dimes ");
        System.out.println(" " + nickels + " nickels ");
        System.out.println(" " + pennies + " pennies ");

    }
}

