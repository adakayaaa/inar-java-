package week_04.assignments;

import java.util.*;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        if (letter.length() != 1) {
            System.out.println("You must enter one letter");
            System.exit(1);
        }

        char digitOrLetter = letter.charAt(0);
        if ((digitOrLetter == '1') || (digitOrLetter == '_') || (digitOrLetter == '@')) {
            System.out.println("The corresponding number is 1");
        } else if ((digitOrLetter == '2') || (digitOrLetter == 'A') || (digitOrLetter == 'B') || (digitOrLetter == 'C')
                || (digitOrLetter == 'a') || (digitOrLetter == 'b') || (digitOrLetter == 'c')) {

            System.out.println("The corresponding number is 2");
        } else if ((digitOrLetter == '3') || (digitOrLetter == 'D') || (digitOrLetter == 'E') || (digitOrLetter == 'F')
                || (digitOrLetter == 'd') || (digitOrLetter == 'e') || (digitOrLetter == 'f')) {
            System.out.println("The corresponding number is 3");

        } else if ((digitOrLetter == '4') || (digitOrLetter == 'G') || (digitOrLetter == 'H') || (digitOrLetter == 'I')
                || (digitOrLetter == 'g') || (digitOrLetter == 'h') || (digitOrLetter == 'i')) {
            System.out.println("The corresponding number is 4");

        } else if ((digitOrLetter == '5') || (digitOrLetter == 'J') || (digitOrLetter == 'K') || (digitOrLetter == 'L')
                || (digitOrLetter == 'j') || (digitOrLetter == 'k') || (digitOrLetter == 'l')) {
            System.out.println("The corresponding number is 5");

        } else if ((digitOrLetter == '6') || (digitOrLetter == 'M') || (digitOrLetter == 'N') || (digitOrLetter == 'O')
                || (digitOrLetter == 'm') || (digitOrLetter == 'n') || (digitOrLetter == 'o')) {
            System.out.println("The corresponding number is 6");

        } else if ((digitOrLetter == '7') || (digitOrLetter == 'P') || (digitOrLetter == 'Q') || (digitOrLetter == 'R')
                || (digitOrLetter == 'S') || (digitOrLetter == 'p') || (digitOrLetter == 'q') || (digitOrLetter == 'r')
                || (digitOrLetter == 's')) {
            System.out.println("The corresponding number is 7");

        } else if ((digitOrLetter == '8') || (digitOrLetter == 'T') || (digitOrLetter == 'U') || (digitOrLetter == 'V')
                || (digitOrLetter == 't') || (digitOrLetter == 'u') || (digitOrLetter == 'v')) {
            System.out.println("The corresponding number is 8");

        } else if ((digitOrLetter == '9') || (digitOrLetter == 'W') || (digitOrLetter == 'X') || (digitOrLetter == 'Y')
                || (digitOrLetter == 'Z') || (digitOrLetter == 'w') || (digitOrLetter == 'x') || (digitOrLetter == 'y')
                || (digitOrLetter == 'z')) {
            System.out.println("The corresponding number is 9");

        } else if (digitOrLetter == '0') {
            System.out.println("The corresponding number is 0");

        } else if ((digitOrLetter == '*') || (digitOrLetter == ' ')) {
            System.out.println("The corresponding number is *");

        } else if (digitOrLetter == '#') {
            System.out.println("The corresponding number is #");
        }else{
            System.out.println(digitOrLetter + " is an invalid input");
        }
    }
}
