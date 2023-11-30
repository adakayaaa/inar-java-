package week_04.assignments;

import java.util.*;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code");
        int character = input.nextInt();

        if (0 < character && character < 127) {
            System.out.println("The character for ASCII code " + character + " is " + (char) character);
        } else {
            System.out.println("invalid character ");
        }


    }
}

