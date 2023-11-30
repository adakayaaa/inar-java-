package week_03.assignments;

import java.util.*;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your lottery pick (three digits): ");

        // myGuess is myNumber1-myNumber2-myNumber3 (for ex. if myGuess is 321, myNumber1 is 3.)
        int myGuess = input.nextInt();
        int myNumber1 = myGuess / 100;
        int myRemainingNumber = myGuess % 100;
        int myNumber2 = myRemainingNumber / 10;
        int myNumber3 = myRemainingNumber % 10;

        // computerGuess is computerNumber1-computer2-computer3 (for ex. if computerGuess is 321, computerNumber1 is 3.)
        int computerGuess = (int) (Math.random() * 1000 + 100);
        int computerNumber1 = computerGuess / 100;
        int computerRemainingNumber = computerGuess % 100;
        int computerNumber2 = computerRemainingNumber / 10;
        int computerNumber3 = computerRemainingNumber % 10;
        System.out.println(" The lottery number is " + computerGuess);

        if (myGuess == computerGuess) {
            System.out.println("  You win !!! 10,000$ Prize !!!");
        } else if (myGuess != computerGuess) {
            if (((myNumber1 == computerNumber1) || (myNumber1 == computerNumber2) || (myNumber1 == computerNumber3))
                    && ((myNumber2 == computerNumber1) || (myNumber2 == computerNumber2) || (myNumber2 == computerNumber3))
                    && ((myNumber3 == computerNumber1) || (myNumber3 == computerNumber2) || (myNumber3 == computerNumber3))) {
                System.out.println(" Matched all number!!! 3,000$ Prize !!!");

            } else if (((myNumber1 == computerNumber1) || (myNumber1 == computerNumber2) || (myNumber1 == computerNumber3))
                    || ((myNumber2 == computerNumber1) || (myNumber2 == computerNumber2) || (myNumber2 == computerNumber3))
                    || ((myNumber3 == computerNumber1) || (myNumber3 == computerNumber2) || (myNumber3 == computerNumber3))) {
                System.out.println(" Matched one number!!! 1,000$ Prize !!!");

            } else {
                System.out.println(" Sorry no match :( ");

            }
        }
    }
}

