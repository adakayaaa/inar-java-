package week_08.assignments;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        int[][] sudoku = createMatrix();
        System.out.println(((isSolution(sudoku)) ? "Valid " : "Invalid " )+ "solution ");
    }

    public static int[][] createMatrix() {
        /*
        9 6 3 1 7 4 2 5 8
        1 7 8 3 2 5 6 4 9
        2 5 4 6 8 9 7 3 1
        8 2 1 4 3 7 5 9 6
        4 9 6 8 5 2 3 1 7
        7 3 5 9 6 1 8 2 4
        5 8 9 7 1 3 4 6 2
        3 1 7 2 4 6 9 8 5
        6 4 2 5 9 8 1 7 3
        */

        Scanner input = new Scanner(System.in);
        int[][] sudokuMatrix = new int[9][9];
        
        System.out.println("Enter a Sudoku puzzle solution:");

        for (int i = 0; i < sudokuMatrix.length; i++) {
            for (int j = 0; j < sudokuMatrix[0].length; j++) {
                sudokuMatrix[i][j] = input.nextInt();

            }
        }
        return sudokuMatrix;
    }

    public static boolean isSolution(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > 9 || !isValid(i,j,matrix)) {
                    return false;
                }
            }

        }

        return true;
    }
    public static boolean isValid (int i, int j, int[][] matrix){
        for (int column = 0; column < 9; column++) {
            if(column != j && matrix[i][column] == matrix[i][j]){
                return false;
            }

        }
        for (int row = 0; row < 9; row++) {
            if(row != i && matrix[row][j] == matrix[i][j]){
                return false;
            }

        }
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                if (row != i && col != j && matrix[row][col] == matrix[i][j]) {
                    return false;
                }

            }
        }
        return true;
    }
}
