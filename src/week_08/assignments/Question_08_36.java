package week_08.assignments;

import java.util.Scanner;

public class Question_08_36 {
    //not finished
    public static void main(String[] args) {
        String[][] matrix = createMatrix();
        if (isLatinSquare(matrix)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("The input array is not a Latin square");
        }

    }

    public static String[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int row = input.nextInt();

        String[][] matrix = new String[row][row];
        System.out.println("Enter " + row + " rows of letters separated by spaces: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.next();

            }

            int count = row - 1;
            while (count >= 0) {
                if (matrix[i][count].charAt(0) < 65 || matrix[i][count].charAt(0) >= (row + 65)) {
                    System.out.println("Wrong input : the letters must be from A to " + (char) (65 + count));
                    break;
                } else {
                    count--;
                }

            }

        }
        return matrix;
    }

    public static boolean isLatinSquare(String[][] matrix) {
        //error is here.

        for (int i = 0; i < matrix.length; i++) {
            String control = matrix[i][0];
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (control == matrix[i][j + 1]) {
                    return false;

                }
            }
        }
        for (int i = 0; i < matrix.length-1; i++) {
            String control = matrix[i][0];
            for (int j = 0; j < matrix[0].length ; j++) {
                if (control == matrix[i+1][j]) {
                    return false;

                }
            }
        }
        return true;
    }
}



