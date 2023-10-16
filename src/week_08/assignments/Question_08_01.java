package week_08.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        display(matrix);


    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();

            }

        }
        return matrix;
    }

    public static void display(double[][] matrix) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }

    public static double sumColumn(double[][] matrix, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][columnIndex];
        }
        return sum;
    }
}


