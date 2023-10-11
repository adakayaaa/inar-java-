package week_07.assignments;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        if (isSorted(list)) {
            System.out.println("The list already sorted");
        } else {
            System.out.println("The list not sorted");
        }
    }

    public static boolean isSorted(int[] list) {


        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    return false;
                }

            }

        }
        return true;

    }
}
