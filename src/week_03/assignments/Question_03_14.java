package week_03.assignments;

import java.util.*;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Guess the flip of coin (0 represents head and " + " 1 represents tail): ");
        int myGuess = input.nextInt();
        int computerGuess = (int) (Math.random() * 2);

        if (computerGuess == myGuess) {
            System.out.println("Your guess is correct ");
        } else {
            System.out.println("Your guess is incorrect ");
        }
    }
}
