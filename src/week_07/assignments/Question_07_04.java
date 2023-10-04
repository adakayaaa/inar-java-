package week_07.assignments;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[101];
        double sum = 0;
        int count = 0;

        System.out.println("Enter scores (Negative number signifies end) : ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();

            sum += score[i];

            if (score[i] < 0) {
                break;
            }
            count++;
        }

        int average = (int) sum / count;
        System.out.println("Average of scores: " + average);

        int countOfAboveOrEqualAverage = 0;
        int countOfBelowAverage = 0;

        for (int i = 0; i < count; i++) {
            if (score[i] <= average) {
                countOfBelowAverage++;
            } else {
                countOfAboveOrEqualAverage++;

            }
        }
        System.out.println("Number of scores above or equal to average: " + countOfAboveOrEqualAverage);
        System.out.println("Number of scores below average: " + countOfBelowAverage);
    }
}

