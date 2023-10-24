package week_08.assignments;

import java.util.Scanner;

public class Question_08_35 {
    //NOT FİNİSHED.
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        display(matrix);

    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = input.nextInt();
        int[][] matrix = new int[row][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }

        }
        return matrix;
    }
    public static void display(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
}
