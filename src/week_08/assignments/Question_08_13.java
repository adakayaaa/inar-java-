package week_08.assignments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        findLargestElement(matrix);
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = new double[row][column];

        System.out.println("Enter the array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();

            }

        }
        return matrix;
    }
    public static void findLargestElement(double[][] matrix){
        int maxRow=0;
        int maxColumn =0;
        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn=j;
                }
            }
        }
        System.out.println("The location of the largest element is at ( " + maxRow + "," + maxColumn + " )" );
    }

}

