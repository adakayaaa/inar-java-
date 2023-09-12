package week_05.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int commputerWins = 0;
        int userWins = 0;

        while (commputerWins < 3 && userWins < 3) {

            System.out.print(" scissor(0), rock(1), paper(2): ");
            int userChoice = input.nextInt();
            int computerChoice = (int) (Math.random() * 3);

            if (userChoice == computerChoice) {
                if (computerChoice == 0) {
                    System.out.println(" The computer is scissor. You are scissor too. It is a draw.");
                } else if (computerChoice == 1) {
                    System.out.println(" The computer is rock. You are rock too. It is a draw.");
                } else if (computerChoice == 2) {
                    System.out.println(" The computer is paper. You are paper too. It is a draw.");
                }

            } else if (computerChoice == 0 && userChoice == 2) {
                System.out.println("The computer is scissor. You are paper. Computer won. ");
                commputerWins++;

            } else if (computerChoice == 0 && userChoice == 1) {
                System.out.println("The computer is scissor. You are rock. You won. ");
                userWins++;


            } else if (computerChoice == 1 && userChoice == 0) {
                System.out.println("The computer is rock. You are scissor . Computer won. ");
                commputerWins++;

            } else if (computerChoice == 1 && userChoice == 2) {
                System.out.println("The computer is rock. You are paper . You won. ");
                userWins++;

            } else if (computerChoice == 2 && userChoice == 1) {
                System.out.println("The computer is paper. You are rock . Computer won. ");
                commputerWins++;

            } else if (computerChoice == 2 && userChoice == 0) {
                System.out.println("The computer is paper. You are scissor . You won. ");
                userWins++;
            }

            System.out.println("computer wins: " + commputerWins + "\nUser wins: " + userWins);
        }

    }
}
