package week_07.assignments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number of values: ");
        int[] values = new int[input.nextInt()];

        System.out.println("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");

        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {

        if (countNumber(values) == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static int countNumber(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
                if (count == 4) {
                    return count;
                }
            }else{
                count =1;
            }
        }
        return 0;
    }
}



