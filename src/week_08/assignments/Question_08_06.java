package week_08.assignments;

import java.util.Scanner;

public class Question_08_06 {
    //STH İS WRONG.
    public static void main(String[] args) {
        double[][] matrix1 = createMatrix();
        double[][] matrix2 = createMatrix();
        double[][] multiplyMatrix = multiplyMatrix(matrix1, matrix2);
        getNumber(matrix1, matrix2, multiplyMatrix);

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
        // double[][] sumMatrix = new double [matrix1.length][matrix2[0].length]
        double[][] sumMatrix = new double[3][3];
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    sumMatrix[i][j] += (matrix1[i][k] * matrix2[k][j]);

                }

            }

        }
        return sumMatrix;
    }

    public static void getNumber(double[][] matrix1, double[][] matrix2, double[][] multiplyMatrix) {
        int maxRow = Math.max(matrix1.length, matrix2.length);


    }

}

