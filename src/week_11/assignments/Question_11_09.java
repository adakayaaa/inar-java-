package week_11.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        display(matrix);
        largestRow(matrix);
        largestColumn(matrix);


    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
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
        System.out.println("\nThe random array is");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void largestRow(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    total++;
                }
            }
            list.add(i, total);
        }
        System.out.print("\nThe largest row is: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(java.util.Collections.max(list))) {
                System.out.print(i + " ");
            }
        }
    }

    public static void largestColumn(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[j][i] == 1) {
                    total++;
                }
            }
            list.add(i, total);
        }
        System.out.print("\nThe largest column is: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(java.util.Collections.max(list))) {
                System.out.print(i + " ");
            }
        }
    }
}
