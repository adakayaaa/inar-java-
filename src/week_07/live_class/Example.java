package week_07.live_class;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int totalLetter = 'z' - 'a' + 1;
        int[] countOfLetter = new int[totalLetter];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.toLowerCase().charAt(i);
            if (Character.isLetter(ch)) {
                countOfLetter[ch - 'a']++;
            }
        }
        for (int i = 0; i < countOfLetter.length; i++) {
            if (countOfLetter[i] > 0) {
                System.out.println((char) (i + 'a') + " " + countOfLetter[i]);
            }

        }

    }
}
