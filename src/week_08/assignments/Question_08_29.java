package week_08.assignments;

import java.util.Scanner;

public class Question_08_29 {
    public static void main(String[] args) {
        int[][] list1 = createArray(3, 3);
        int[][] list2 = createArray(3, 3);
        System.out.println("The two arrays are " + ((isEquals(list1, list2)) ? "" : "not") + " identical");
    }

    public static int[][] createArray(int row, int column) {
        Scanner input = new Scanner(System.in);

        int[][] array = new int[row][column];
        System.out.print("Enter list: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextInt();
            }

        }
        return array;
    }

    public static boolean isEquals(int[][] array1, int[][] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {

                for (int k = 0; k < array2.length; k++) {
                    for (int l = 0; l < array2[0].length; l++) {

                        if (array1[i][j] == array2[k][l]) {
                            count++;
                            l = array2[0].length;
                            k = array2.length;
                        }
                    }

                }
            }
        }
        if (count == array1.length * array1.length) {
            return true;

        }
        return false;
    }
}

