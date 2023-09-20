package week_06.assigments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        reverse(number);
    }

    public static int reverse(int number) {
        if (isPalindrome(number)) {
            System.out.print(number + " is a palindrome");
        } else {
            System.out.print(number + " is not a palindrome");
        }
        return number;
    }

    public static boolean isPalindrome(int number) {
        String numberNew = number + "";
        String output = "";
        for (int i = numberNew.length() - 1; i >= 0; i--) {
            output += numberNew.charAt(i);
        }
        if (numberNew.compareTo(output) != 0) {
            return false;
        }
        return true;
    }
}



