package week_08.assignments;

import java.util.Scanner;

public class Question_08_15 {
    //I am not sure.
    public static void main(String[] args) {
        double[][] matrix = createMatrix();

        System.out.println("The five points are " + ((isSameLine(matrix)) ? "" : " not ") + " on the same line.");


    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();

            }

        }
        return matrix;
    }

    public static boolean isSameLine(double[][] matrix) {
        int count=0;

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[0].length-1; j++) {
                if(matrix[i][j]*matrix[i+1][j+1]-matrix[i][j+1]*matrix[i+1][j]==0){
                    count++;
                    if(count==4){
                        return true;
                    }

                }

            }

        }

      return false;
    }

}

