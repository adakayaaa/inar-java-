package week_08.assignments;


import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        getCentralCity(matrix);
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int row = input.nextInt();

        double[][] matrix = new double[row][2];
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();

            }

        }
        return matrix;
    }

    public static void getCentralCity(double[][] matrix) {
        double[][] coordinateMatrix = new double[1][2];

        double minDistance=0 ;

        for (int i = 0; i <1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                minDistance += Math.sqrt(Math.pow(matrix[j][0] - matrix[i][0], 2) + Math.pow(matrix[j][1] - matrix[i][1], 2));
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            double distance = 0;

            for (int j = i + 1; j < matrix.length; j++) {
                distance += Math.sqrt(Math.pow(matrix[j][0] - matrix[i][0], 2) + Math.pow(matrix[j][1] - matrix[i][1], 2));
            }
            if (distance < minDistance) {
                minDistance = distance;
                coordinateMatrix[0][0] = matrix[i][0];
                coordinateMatrix[0][1] = matrix[i][1];

            }
            distance = 0;
        }
        System.out.println("The central city is at (" + coordinateMatrix[0][0] + " , " + coordinateMatrix[0][1] + " ) ");
        System.out.println("The total distance to all other cities is " + minDistance);
    }

}
