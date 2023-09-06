package week_05.assignments;

import java.util.Scanner;

public class Question_05_10 {
    public static void main(String[] args) {

        int numberCount = 0;

        for (int number = 101;  number < 1000; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(" " + number + " ");
                numberCount++;
                if (numberCount % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
