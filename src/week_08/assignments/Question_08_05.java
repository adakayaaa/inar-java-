package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        double[][] matrix1 = createMatrix();
        double[][] matrix2 = createMatrix();
        double[][] sumMatrix = addMatrix(matrix1, matrix2);
        display(matrix1, matrix2, sumMatrix);

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

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sumMatrix[i][j] += (matrix1[i][j] + matrix2[i][j]);

            }
        }
        return sumMatrix;
    }

    public static void display(double[][] matrix1, double[][] matrix2, double[][] sumMatrix) {
        System.out.println("The matrices are added as follows ");
        for (int i = 0; i < matrix1.length; i++) {
            //matrix1
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }

            //space and "+"
            for (int k = 0; k < matrix1[0].length; k++) {
                if (matrix1[i][k] == matrix1[1][1]) {
                    System.out.print(" + ");
                } else {
                    System.out.print("   ");
                }
            }

            //matrix2
            for (int l = 0; l < matrix2[0].length; l++) {
                System.out.print(matrix2[i][l] + " ");

            }

            //space and "="
            for (int k = 0; k < matrix1[0].length; k++) {
                if (matrix1[i][k] == matrix1[1][1]) {
                    System.out.print(" = ");
                } else {
                    System.out.print("   ");
                }
            }

            //sumMatrix
            for (int m = 0; m < sumMatrix[0].length; m++) {
                System.out.print(sumMatrix[i][m] + " ");

            }
            System.out.println();
        }
    }


}


