package week_08.assignments;

import java.util.Scanner;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(6, 6);
        System.out.println("Every row " + ((isEveryRowHaveNumberOne(matrix)) ? " " : "does not ") +
                "have an even number of 1s");
        System.out.println("Every column " + ((isEveryColumnHaveNumberOne(matrix)) ? " " : "does not ") +
                "have an even number of 1s");
    }

    public static int[][] createMatrix(int row, int column) {

        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        return matrix;
    }

    public static boolean isEveryRowHaveNumberOne(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }

            }
            if (count % 2 != 0) {
                return false;
            }

        }
        return true;
    }

    public static boolean isEveryColumnHaveNumberOne(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }

            }
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}

