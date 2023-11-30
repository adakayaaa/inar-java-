package week_08.assignments;

import javax.swing.text.StyleContext;
import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        System.out.println("Matrix has " + ((isConsecutiveNumber(matrix)) ? "" : "not ") +
                " consecutive four numbers");
    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = input.nextInt();

        System.out.print("Enter column number: ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];
        System.out.println("Fill the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();

            }

        }
        return matrix;
    }

    public static boolean isConsecutiveNumber(int[][] matrix) {
        return (isConsecutiveNumberAtRows(matrix) || isConsecutiveNumberAtColumns(matrix) ||
                isConsecutiveNumberAtRightDiagonal(matrix) || isConsecutiveNumberAtLeftDiagonal(matrix));
    }

    public static boolean isConsecutiveNumberAtRows(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count = 1;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }

            }

        }
        return false;
    }

    public static boolean isConsecutiveNumberAtColumns(int[][] matrix) {
        int count = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            count = 1;
            for (int i = 0; i < matrix.length - 1; i++) {
                if (matrix[i][j] == matrix[i + 1][j]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }

        }
        return false;

    }

    public static boolean isConsecutiveNumberAtRightDiagonal(int[][] matrix) {
        int count = 1;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][i] == matrix[i + 1][i + 1]) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
        }
        return false;

    }

    public static boolean isConsecutiveNumberAtLeftDiagonal(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length - 2; i++) {
            count = 1;
            for (int j = matrix[0].length-1; j > 0; j--) {
                if (matrix[i][j] == matrix[i+1][j-1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }

        }
        return false;
    }


}

