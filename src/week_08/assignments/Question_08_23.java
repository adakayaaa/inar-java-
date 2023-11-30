package week_08.assignments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(6, 6);
        display(matrix);
        getTheFlippedCell(matrix);

    }

    public static int[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[row][column];
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();

            }
        }
        return matrix;
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void getTheFlippedCell(int[][] matrix) {
        int[][] flippedCell = new int[1][2];
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                flippedCell[0][0] = i;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                flippedCell[0][1] = i;
            }

        }
        System.out.println( "The flipped cell is at (" + flippedCell[0][0] + "," + flippedCell[0][1] + ")");
    }
}

