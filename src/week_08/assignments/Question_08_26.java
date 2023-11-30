package week_08.assignments;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix(3, 3);
        double[][] sortedRowOfMatrix = sortRows(matrix);
        display(sortedRowOfMatrix);
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

    public static double[][] sortRows(double[][] matrix) {
        double[][] sortMatrix= new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sortMatrix[i][j]= matrix [i][j];
            }

        }

        for (int i = 0; i < sortMatrix.length; i++) {
            for (int j = 0; j < sortMatrix[0].length - 1; j++) {
                int min = j;
                for (int k = j + 1; k < sortMatrix[0].length; k++) {
                    if (sortMatrix[i][k] < sortMatrix[i][min]) {
                        min =k;

                    }
                }
                double temp = sortMatrix[i][j];
                sortMatrix[i][j]=sortMatrix[i][min];
                sortMatrix[i][min]= temp;
            }
        }
        return sortMatrix;
    }

    public static void display(double[][] matrix) {
        System.out.println("The row-sorted array is: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }
}

