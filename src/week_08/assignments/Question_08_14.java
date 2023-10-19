package week_08.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        display(matrix);
        findRow(matrix);
        findColumn(matrix);
        findMajorDiagonal(matrix);
        findMinorDiagonal(matrix);
    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);

            }

        }
        return matrix;
    }

    public static void display(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void findRow(int[][] matrix) {
        int sameCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int countOfZero = 0;
            int countOfOne = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    countOfZero++;
                } else {
                    countOfOne++;
                }

            }
            if (countOfZero == matrix.length) {
                sameCount++;
                System.out.println("All 0s on row " + i);
            } else if (countOfOne == matrix.length) {
                sameCount++;
                System.out.println("All 1s on row " + i);
            } else {
                countOfOne = 0;
                countOfZero = 0;
            }

        }
        if (sameCount == 0) {
            System.out.println("No same numbers on a row");
        }

    }

    public static void findColumn(int[][] matrix) {
        int sameCount = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            int countOfZero = 0;
            int countOfOne = 0;

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    countOfZero++;
                } else {
                    countOfOne++;
                }

            }
            if (countOfZero == matrix.length) {
                sameCount++;
                System.out.println("All 0s on column " + i);
            } else if (countOfOne == matrix.length) {
                sameCount++;
                System.out.println("All 1s on column " + i);
            } else {
                countOfOne = 0;
                countOfZero = 0;
            }

        }
        if (sameCount == 0) {
            System.out.println("No same numbers on a column");
        }

    }

    public static void findMajorDiagonal(int[][] matrix) {
        int sameCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int countOfZero = 0;
            int countOfOne = 0;
                if (matrix[i][i] == 0) {
                    countOfZero++;
                } else {
                    countOfOne++;
                }

            if (countOfZero == matrix.length) {
                sameCount++;
                System.out.println("All 0s on major diagonal " + i);
            } else if (countOfOne == matrix.length) {
                sameCount++;
                System.out.println("All 1s on major diagonal " + i);
            } else {
                countOfOne = 0;
                countOfZero = 0;
            }

        }
        if (sameCount == 0) {
            System.out.println("No same numbers on a major diagonal");
        }

    }
    public static void findMinorDiagonal(int[][] matrix) {
        int sameCount = 0;

        for (int i =0; i <matrix.length; i++) {
            int countOfZero = 0;
            int countOfOne = 0;
            for (int j = matrix [0].length-1; j <=0; j--) {
                if (matrix[i][j] == 0) {
                    countOfZero++;
                } else {
                    countOfOne++;
                }
            }

            if (countOfZero == matrix.length) {
                sameCount++;
                System.out.println("All 0s on minor diagonal " + i);
            } else if (countOfOne == matrix.length) {
                sameCount++;
                System.out.println("All 1s on minor diagonal " + i);
            } else {
                countOfOne = 0;
                countOfZero = 0;
            }

        }
        if (sameCount == 0) {
            System.out.println("No same numbers on a minor diagonal");
        }

    }
}
