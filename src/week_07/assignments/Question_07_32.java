package week_07.assignments;

import java.util.Scanner;

public class Question_07_32 {
    //Not finished.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int[] list = new int[input.nextInt()];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] pivot = sorted(list);
        //display(pivot);
    }

    public static int[] sorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = partition(list);

        }
        return list;
    }

    public static int partition(int[] list) {
        int partition = list[0];
        return partition;
    }

}
