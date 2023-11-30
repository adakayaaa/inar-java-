package week_08.assignments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix(3, 3);
        System.out.println("It is" + ((isMarkovMatrix(matrix)) ? " " : " not ") + "a Markov matrix");
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

    public static boolean isMarkovMatrix(double[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            double total = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
                total += matrix[j][i];
            }
            if (total != 1.0) {
                return false;
            }


        }
        return true;
    }
}

