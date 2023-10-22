package week_08.assignments;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix(4, 2);

        if (((matrix[0][1] - matrix[1][1]) *(matrix[3][0] - matrix[2][0]))
                -((matrix[1][0] - matrix[0][0])* (matrix[2][1] - matrix[3][1])) ==0) {
            System.out.println("The two lines are parallel.");
        } else {
            double[] solve = getIntersectingPoint(matrix);
            System.out.printf("%3s%2.4f%2s%7.4f%1s","The intersecting point is at (" , solve[0] , "," , solve[1],")");
        }
    }

    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[row][column];
        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }

        }
        return matrix;
    }

    public static double[] getIntersectingPoint(double[][] matrix) {
        double[] solve = new double[2];

        double a = (matrix[0][1] - matrix[1][1]);
        double b = (matrix[1][0] - matrix[0][0]);
        double c = (matrix[2][1] - matrix[3][1]);
        double d = (matrix[3][0] - matrix[2][0]);
        double e = a * matrix[0][0] - (-b) * matrix[0][1];
        double f = c * matrix[2][0] - (-d) * matrix[2][1];
        solve[0] = (e * d - b * f) / (a * d - b * c);
        solve[1]  = (a * f - e * c) / (a * d - b * c);
        return solve;
    }

}
