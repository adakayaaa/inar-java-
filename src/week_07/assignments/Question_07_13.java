package week_07.assignments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers to exclude from (1-54): ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Number generated: " + getRandom(numbers));
    }

    public static int getRandom(int... numbers) {
        int random = (int) (Math.random() * 55 + 1);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == random) {
                i = 0;
                random = (int) (Math.random() * 55 + 1);
            }
        }
        return random;
    }
}

