package week_06.assigments;

import java.util.Scanner;

public class Question_06_18 {
    //sth is wrong
    //look again 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        System.out.println(IsValidPassword(password) ? " Valid Password" : " Invalid Password");
    }

    public static boolean IsValidPassword(String password) {
        if (!isLength(password)) {
            return false;
        }
        if (!isOnlyLettersAndDigits(password)) {
            return false;
        }
        if (!isContainAtLeastTwoDigits(password)) {
            return false;
        }
        return true;
    }

    public static boolean isLength(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i <= password.length() - 1; i++) {
            char ch = password.charAt(i);
            if (!(Character.isLetterOrDigit(ch))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isContainAtLeastTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i <= password.length() - 1; i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        if (count < 2) {
            return false;
        }
        return true;
    }
}
