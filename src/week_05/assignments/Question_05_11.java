package week_05.assignments;

import java.util.Scanner;

public class Question_05_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberCount = 0;

        for (int number = 100; 100 <= number && number <= 200; number++) {
            if ((number % 5 == 0 && number % 6 != 0) || (number % 5 != 0 && number % 6 == 0)) {
                System.out.printf("%-4d", number);
                numberCount++;
                if (numberCount % 10 == 0) {
                    System.out.println();
                }

            }
        }
    }
}
