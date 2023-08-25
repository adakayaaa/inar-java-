package week_03.assignments;

import java.util.*;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" scissor (0), rock (1) , paper (2): ");

        int myGuess = input.nextInt();
        int computerChoice = (int) (Math.random() * 3);

        if (myGuess == computerChoice && computerChoice == 0) {
            System.out.println(" The computer is scissor. You are scissor too. It is a draw.");
        } else if (myGuess == computerChoice && computerChoice == 1) {
            System.out.println(" The computer is rock. You are rock too. It is a draw.");
        } else if (myGuess == computerChoice && computerChoice == 2) {
            System.out.println(" The computer is paper. You are paper too. It is a draw.");

        } else if (computerChoice == 0 && myGuess == 2) {
            System.out.println("The computer is scissor. You are paper. Computer won. ");
        } else if (computerChoice == 0 && myGuess == 1) {
            System.out.println("The computer is scissor. You are rock. You won. ");

        } else if (computerChoice == 1 && myGuess == 0) {
            System.out.println("The computer is rock. You are scissor . Computer won. ");
        } else if (computerChoice == 1 && myGuess == 2) {
            System.out.println("The computer is rock. You are paper . You won. ");

        } else if (computerChoice == 2 && myGuess == 1) {
            System.out.println("The computer is paper. You are rock . Computer won. ");
        } else if (computerChoice == 2 && myGuess == 0) {
            System.out.println("The computer is paper. You are scissor . You won. ");

        } else {
            System.exit(1);
        }

    }
}

