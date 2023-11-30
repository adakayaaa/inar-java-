package week_08.live_class;

import java.util.Scanner;

public class RotatedMatrix {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        System.out.println("Original matrix: ");
        display(matrix);
        clockWise(matrix);
        System.out.println("Rotated matrix: ");
        display(matrix);

    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row and column's count (1-20): ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        System.out.println("Fill the matrix: ");
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
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void clockWise(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;

            }

        }


    }
}

