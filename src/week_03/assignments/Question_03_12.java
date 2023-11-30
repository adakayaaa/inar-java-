package week_03.assignments;

import java.util.*;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int threeDigitNumber = input.nextInt();

        // threeDigitNumber is : number1-number2-number3
        int number1 = threeDigitNumber / 100;
        int numberRemaining = threeDigitNumber % 100;
        int number2 = numberRemaining / 10;
        int number3 = numberRemaining % 10;

        if (number1 == number3) {
            System.out.println(threeDigitNumber + " is a palindrome ");
        } else {
            System.out.println(threeDigitNumber + " is not a palindrome ");
        }

    }
}

