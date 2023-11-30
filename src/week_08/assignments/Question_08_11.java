package week_08.assignments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        int[] binaryNumber = findBinaryNumber(number);
        int[][] matrix = createMatrix(binaryNumber);
        display(matrix);

    }

    public static int[] findBinaryNumber(int number) {
        int[] array = new int[9];
        int count = 8;
        while (number >= 2) {
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = number % 2;
                number = number / 2;
                count--;
            }
        }
        array[count] = number;
        return array;
    }

    public static int[][] createMatrix(int[] array) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            matrix[0][i] = array[i];
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[1][i] = array[i + 3];
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[2][i] = array[i + 6];
        }
        return matrix;
    }

    public static void display(int[][] matrix){
        for(int i = 0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==1){
                    System.out.print("T ");
                }else{
                    System.out.print("H ");
                }

            }
            System.out.println();
        }
    }

}

