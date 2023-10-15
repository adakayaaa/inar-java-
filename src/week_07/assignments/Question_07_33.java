package week_07.assignments;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = input.nextInt();

        String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};


        String zodiacOfNumber = zodiac[year % 12];
        System.out.println(year + " is a year of " + zodiacOfNumber +" in zodiac " );

    }
}
