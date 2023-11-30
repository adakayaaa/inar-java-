package week_08.assignments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextDouble();
            }

        }
        return matrix;
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = row; column <=row; column++) {
                sum += matrix[row][column];

            }

        }
        return sum;
    }


}

