package week_08.assignments;

import java.util.Scanner;

public class Question_08_15 {
    //NOT FİNİSHED
    public static void main (String[] args){
        double[][] matrix= createMatrix();

        if(isSameLine(matrix)){
            System.out.println("The five points are on the same line.");
        }else{
            System.out.println("The five points are not on the same line.");
        }

    }
    public static double[][] createMatrix(){
        Scanner input = new Scanner(System.in);
       double[][] matrix= new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= input.nextDouble();

            }

        }
        return matrix;
    }
    public static boolean isSameLine( double[][] matrix){
        double count=0;

        if(count !=0){
            return false;


        }
        return true;

    }

}

