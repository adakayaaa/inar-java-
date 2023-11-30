package week_06.assigments;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = input.nextLine();

        System.out.println(" The number of letters in the string \"" + sentence + "\" : " + countLetters(sentence));
    }

    public static int countLetters(String s) {
        int countLetter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                countLetter++;
            }
        }
        return countLetter;
    }
}

