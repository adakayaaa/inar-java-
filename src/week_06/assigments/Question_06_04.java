package week_06.assigments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Display an integer reversed: \nEnter an integer: ");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        String numberString = number + "";
        String output = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            output += numberString.charAt(i);
        }
        System.out.print(output);
    }
}

