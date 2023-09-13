package week_05.assignments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name = input.nextLine();

        for (int i = 1; i <= name.length(); i++) {
            System.out.print(name.charAt(name.length() - i));
        }

    }
}
