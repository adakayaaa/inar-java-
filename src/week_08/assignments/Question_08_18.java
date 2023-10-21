package week_08.assignments;

import java.util.Scanner;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(5, 2);
        shuffle(matrix);
    }

    public static int[][] createMatrix(int row, int column) {
        //int [][] m = {{ 1 , 2 }, { 3 , 4 }, { 5 , 6 }, { 7 , 8 }, { 9 , 10 }};

        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[row][column];

        System.out.print("Enter " + row + " points: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();

            }

        }
        return matrix;
    }

    public static void shuffle(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int i1 = (int) (Math.random() * matrix.length);
            for (int j = 0; j < matrix[0].length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j];
                matrix[i1][j] = temp;

            }

        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
