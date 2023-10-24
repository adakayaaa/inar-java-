package week_08.assignments;

import java.util.Scanner;

public class Question_08_34 {
    
    public static void main(String[] args) {
        double[][] matrix = createMatrix(4, 2);
        double[] array = getRightmostLowestPoint(matrix);
        System.out.println("The rightmost lowest point is (" + array[0] + "," + array[1] + ")");

    }

    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[row][column];
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }

        }
        return matrix;
    }

    public static double[] getRightmostLowestPoint(double[][] matrix) {
        double[] array = new double[2];
        for (int i = 0; i < matrix.length-1; i++) {
            double minX=matrix[0][0];
            double minY=matrix[0][1];
            for (int j = i+1; j < matrix.length; j++) {
                if ((matrix[j][0] > minX) && (matrix[j][1] < minY)) {
                    minX= matrix[j][0] ;
                    minY= matrix[j][1];
                }

            }
            array[0]=minX;
            array[1]=minY;
        }


        return array;
    }
}
