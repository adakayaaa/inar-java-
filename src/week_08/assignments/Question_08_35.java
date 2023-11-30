package week_08.assignments;

import java.util.Scanner;

public class Question_08_35 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        display(matrix);
        int[] maximumSquare = getMaximumSquare(matrix);
        displayMaximumSquare(maximumSquare);


    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = input.nextInt();
        int[][] matrix = new int[row][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
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

    public static int[] getMaximumSquare(int[][] matrix) {
        int[] result = new int[3];
        int maxSize = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                while (hasSquare(matrix, i, j, maxSize)) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = maxSize;
                    maxSize++;
                }
            }

        }

        return result;
    }

    public static boolean hasSquare(int[][] matrix, int i, int j, int maxSize) {
        if (i + maxSize > matrix.length) {
            return false;
        }
        if (j + maxSize > matrix[0].length) {
            return false;
        }
        for (int k = i; k < i + maxSize; k++) {
            for (int l = j; l < j + maxSize; l++) {
                if (matrix[k][l] != 1) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void displayMaximumSquare(int[] array) {
        System.out.println("The maximum square submatrix is at (" + array[0] + " , " + array[1] + ") with size " + array[2]);
    }
}

