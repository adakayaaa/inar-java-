package week_04.assignments;

import java.util.*;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");

        String hexDigit = input.nextLine();

        if (hexDigit.length() != 1) {
            System.out.println("You must enter one character ");
            System.exit(1);
        }

        char character = hexDigit.charAt(0);
        if ('A' <= character && character <= 'F') {
            int ch = character - 'A' + 10;
            System.out.print("The binary value is ");
            if (ch == 10) {
                System.out.println("01010");
            } else if (ch == 11) {
                System.out.println("01011");
            } else if (ch == 12) {
                System.out.println("01100");
            } else if (ch == 13) {
                System.out.println("01101");
            } else if (ch == 14) {
                System.out.println("01110");
            } else if (ch == 15) {
                System.out.println("01111");
            }
        } else if (Character.isDigit(character)) {
            System.out.print("The binary value is ");
            if (character == '0') {
                System.out.println("00000");
            } else if (character == '1') {
                System.out.println("00001");
            } else if (character == '2') {
                System.out.println("00010");
            } else if (character == '3') {
                System.out.println("00011");
            } else if (character == '4') {
                System.out.println("00100");
            } else if (character == '5') {
                System.out.println("00101");
            } else if (character == '6') {
                System.out.println("00110");
            } else if (character == '7') {
                System.out.println("00111");
            } else if (character == '8') {
                System.out.println("01000");
            } else if (character == '9') {
                System.out.println("01001");
            }

        } else {
            System.out.println(character + " is an invalid input");
        }
    }
}

