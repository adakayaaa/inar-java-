package week_08.assignments;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix(3, 3);
        double[][] sortedColumnOfMatrix = sortColumn(matrix);
        display(sortedColumnOfMatrix);
    }
    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);
        /*
        0,15 0,875 0,375
        0,55 0,005 0,225
        0,30 0,12 0,4
         */

        double[][] matrix = new double[row][column];
        System.out.println("Enter a " + row + "-by-" + row + " matrix row by row: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();

            }
        }
        return matrix;
    }
    public static double[][] sortColumn(double[][] matrix) {
        double[][] sortMatrix = new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sortMatrix[i][j] = matrix[i][j];
            }

        }
        for (int i = 0; i < sortMatrix[0].length; i++) {
            for (int j = 0; j < sortMatrix.length - 1; j++) {
                int min = j;
                for (int k = j + 1; k < sortMatrix.length; k++) {
                    if (sortMatrix[k][i] < sortMatrix[min][i]) {
                        min = k;

                    }
                }
                    double temp = sortMatrix[j][i];
                    sortMatrix[j][i] = sortMatrix[min][i];
                    sortMatrix[min][i] = temp;
                }

            }
        return sortMatrix;
        }


    public static void display(double[][] matrix) {
        System.out.println("The column-sorted array is: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }
}

