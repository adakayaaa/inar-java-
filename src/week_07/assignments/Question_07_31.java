package week_07.assignments;

import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sorted list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter sorted list2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergeTwoSortedList = merge(list1, list2);

        display(mergeTwoSortedList);

    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] mergeList = new int[list1.length + list2.length];
        for (int i = 0; i < mergeList.length; i++) {
            for (int j = 0; j < list1.length; j++) {
                mergeList[j] = list1[j];
            }
            for (int k = 0; k < list2.length; k++) {
                mergeList[list1.length + k] = list2[k];

            }

        }
        //mergeList sort process:
        for (int i = 0; i < mergeList.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < mergeList.length; j++) {
                if (mergeList[min] > mergeList[j]) {
                    min = j;

                }
            }
            int temp = mergeList[i];
            mergeList[i] = mergeList[min];
            mergeList[min] = temp;

        }
        return mergeList;
    }

    public static void display(int[] array) {

        System.out.print("The merged list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }
}

