package week_06.assigments;

import java.util.Scanner;

public class Question_06_22 {
    //fix this answer, it's wrong.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextInt();

        System.out.println("The approximated square root of " + number + " is: " + sqrt(number));
    }

    public static double sqrt(long n) {
        long lastGuess =1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;
        for (lastGuess=1; lastGuess <= n; lastGuess++) {

            if (nextGuess-lastGuess == 0.0001) {
                return lastGuess;
            } else {
                nextGuess = lastGuess;
            }
        }
        return lastGuess;
    }

}
