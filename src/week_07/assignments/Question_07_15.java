package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];

        System.out.println("Enter ten number: ");
        for (int i = 0; i < list.length; i++) {
            list [i] = input.nextInt();
        }

        System.out.println(Arrays.toString(eliminateDuplicates(list)));

    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] result = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (list[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[count] = list[i];
                count++;
            }
        }
        int[] lastResult = new int[count];
        for (int i = 0; i < count; i++) {
            lastResult[i] = result[i];
        }
        return lastResult;
    }
}

