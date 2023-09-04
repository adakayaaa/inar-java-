package week_05.live_class;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerNumber = (int) (Math.random() * 1000);

        System.out.println("Guess a magic number between 0 to 1000");
        int yourGuess = -1;


        while (computerNumber != yourGuess) {
            System.out.print("\nEnter your guess: ");
            yourGuess = input.nextInt();

            if (computerNumber == yourGuess) {
                System.out.println("Yes,the number is " + computerNumber);
            } else if (computerNumber < yourGuess) {
                System.out.println(" Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
    }
}

