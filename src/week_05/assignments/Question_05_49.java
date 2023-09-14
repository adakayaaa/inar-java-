package week_05.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter a string: ");
        String name = input.nextLine();
        String nameLowerCase = name.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i <= name.length()-1; i++) {
            char ch = nameLowerCase.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels: " + vowels);
        System.out.println("The number of consonants: " + consonants);

    }

}

