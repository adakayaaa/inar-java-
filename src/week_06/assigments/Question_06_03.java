package week_06.assigments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        int reverse= reverse(number);
        System.out.print(isPalindrome(number,reverse)? "is Palindrome" : " is not a Palindrome");

    }

    public static int reverse(int number) {
        String numberNew = number + "";
        String output = "";
        for (int i = numberNew.length() - 1; i >= 0; i--) {
            output += numberNew.charAt(i);
        }
        return Integer.parseInt(output);

    }


    public static boolean isPalindrome(int number,int reverse) {
       return number == reverse;
    }
}

