package week_08.assignments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix(2, 2);
        double[] array = createArray(2);

        if (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0] == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double[] solve = linearEquation(matrix, array);
            System.out.println("x is " + solve[0] + " y is " + solve[1] );
        }
    }

    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[row][column];
        System.out.print("Enter a00,a01,a10,a11: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }

        }
        return matrix;
    }

    public static double[] createArray(int length) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[length];

        System.out.print("Enter b0 and b1: ");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextDouble();
        }
        return array;
    }
    public static double[] linearEquation(double[][] matrix,double[]array) {
        double[] solve = new double[2];

        solve[0] = (array[0] * matrix[1][1] - array[1] * matrix[0][1]) /
                (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);

        solve[1] = (array[1] * matrix[0][0] - array[0] * matrix[1][0]) /
                (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);

        return solve;
    }

}
