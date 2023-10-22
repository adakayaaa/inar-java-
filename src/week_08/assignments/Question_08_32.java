package week_08.assignments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix(3, 2);
        if (getTriangleArea(matrix) == 0) {
            System.out.println("The three points are on the same line.");
        } else {
            System.out.printf("%2s%4.2f", "The area of the triangle is ", getTriangleArea(matrix));
        }
    }

    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[row][column];
        System.out.print("Enter x1,y1,x2,y2,x3,y3: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }

        }
        return matrix;
    }

    public static double getTriangleArea(double[][] matrix) {
        double side1 = Math.sqrt(Math.pow(matrix[0][0] - matrix[1][0], 2) + Math.pow(matrix[0][1] - matrix[1][1], 2));
        double side2 = Math.sqrt(Math.pow(matrix[0][0] - matrix[2][0], 2) + Math.pow(matrix[0][1] - matrix[2][1], 2));
        double side3 = Math.sqrt(Math.pow(matrix[1][0] - matrix[2][0], 2) + Math.pow(matrix[1][1] - matrix[2][1], 2));

        double side = (side1 + side2 + side3) / 2;

        //return area
        double area = Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));

        if (isSameLine(matrix)) {
            return 0;
        }
        return area;
    }

    public static boolean isSameLine(double[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] * matrix[i + 1][j + 1] - matrix[i][j + 1] * matrix[i + 1][j] == 0) {
                    count++;
                    if (count == 2) {
                        return true;
                    }

                }

            }

        }

        return false;
    }
}
