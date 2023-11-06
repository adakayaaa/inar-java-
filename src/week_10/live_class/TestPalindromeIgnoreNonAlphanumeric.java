package week_10.live_class;

import java.util.Scanner;

public class TestPalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Ignoring nonalphanumeric characters, \nis "
                + str + " a palindrome? " + isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        String str1 = filter(str);
        String str2 = reverse(str1);
        return str2.equals(str1);
    }

    private static String filter(String str1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (Character.isLetterOrDigit(str1.charAt(i))) {
                stringBuilder.append(str1.charAt(i));
            }

        }
        return stringBuilder.toString();
    }

    private static String reverse(String str2) {
        StringBuilder stringBuilder = new StringBuilder(str2);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
