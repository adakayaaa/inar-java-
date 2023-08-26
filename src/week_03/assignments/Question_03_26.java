package week_03.assignments;

import java.util.*;

public class Question_03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        boolean even = (number % 5 == 0) && (number % 6 == 0);
        System.out.println("Is " + number + " divisible by 5 and 6? " + even);

        boolean even1 = (number % 5 == 0) || (number % 6 == 0);
        System.out.println("Is " + number + " divisible by 5 or 6? " + even1);

        boolean even2 = (number % 5 == 0) ^ (number % 6 == 0);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + even2);


    }
}
