package week_07.assignments;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string to sort: ");
        String str = input.nextLine();

        String strToLowerCase = str.toLowerCase();
        System.out.println("sorted from: " + sort(strToLowerCase));
    }

    public static String sort(String str) {

        int[] sentenceAscii = new int[str.length()];
        String sentence = " ";


        for (int i = 0; i < sentenceAscii.length; i++) {
            sentenceAscii[i] = str.charAt(i);
        }

        for (int i = 0; i < sentenceAscii.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < sentenceAscii.length; j++) {
                if (sentenceAscii[j] < sentenceAscii[min]) {
                    min = j;
                }

            }

            int temp = sentenceAscii[i];
            sentenceAscii[i] = sentenceAscii[min];
            sentenceAscii[min] = temp;

        }
        for (int i = 0; i < sentenceAscii.length; i++) {
            sentence += (char)sentenceAscii[i];

        }
        return sentence;
    }
}

