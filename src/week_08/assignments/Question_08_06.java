package week_08.assignments;

import java.util.Scanner;

public class Question_08_06 {
    //STH İS WRONG.
    public static void main(String[] args) {
        double[][] matrix1 = createMatrix();
        double[][] matrix2 = createMatrix();
        double[][] multiplyMatrix = multiplyMatrix(matrix1, matrix2);
        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[0].length; j++) {
                System.out.print(multiplyMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        System.out.println("Enter matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();

            }
        }
        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            double total = 0;
            for (int j = 0; j < matrix1[0].length; j++) {
                total += (matrix1[i][i] * matrix2[j][j]);

            }
            for (int k = 0; k < sumMatrix[0].length; k++) {
                sumMatrix[i][k] = total;

            }
        }
        return sumMatrix;
    }

}

