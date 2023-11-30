package week_08.assignments;

import java.util.Scanner;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(6, 2);
        sorted(matrix);
    }

    public static int[][] createMatrix(int row, int column) {
        //{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}

        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[row][column];

        System.out.print("Enter " + row + " points: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();

            }

        }
        return matrix;
    }

    public static void sorted(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            int minRow = i;
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[j][0] < matrix[minRow][0]) {
                    minRow = j;
                }
            }

            int temp = matrix[i][1];
            matrix[i][1] = matrix[minRow][1];
            matrix[minRow][1] = temp;

            int tempIndex = matrix[i][0];
            matrix[i][0] = matrix[minRow][0];
            matrix[minRow][0] = tempIndex;


        }

        for (int i = 0; i < matrix.length - 1; i++) {
            int minRow = i;
            for (int j = i + 1; j < matrix.length; j++) {
                if ((matrix[j][i] == matrix[minRow][i]) && (matrix[j][1] < matrix[minRow][1])) {
                    minRow = j;
                }
            }
            int temp = matrix[i][1];
            matrix[i][1] = matrix[minRow][1];
            matrix[minRow][1] = temp;

        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}

