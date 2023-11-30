package week_08.assignments;

import java.util.Scanner;

public class Question_08_04 {
    public static void main (String[] args){
        int[][] workingHoursOfEmployees = createMatrix();
        int[][] totalHours = totalHours(workingHoursOfEmployees);
        int[][] sortedToMax = sorted(totalHours);
        display(sortedToMax);
    }
    public static int[][] createMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int countOfEmployees = input.nextInt();
        int[][] matrix = new int[countOfEmployees][7];

        System.out.println("Enter the working hours of employees: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= input.nextInt();

            }

        }
        return matrix;
    }
    public static int[][] totalHours (int[][] matrix){
        int [][] totalHoursMatrix = new int[matrix.length][2];
        for (int i = 0; i < matrix.length; i++) {
            int total=0;
            for (int j = 0; j < matrix[i].length; j++) {
                total+= matrix[i][j];

            }
            totalHoursMatrix [i][0] = i;
            totalHoursMatrix [i][1] = total;


        }
        return totalHoursMatrix;
    }
    public static  int[][] sorted(int [][] matrix){
        for (int i = 0; i < matrix.length - 1; i++) {
            int maxRow = i;
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[j][1] > matrix[maxRow][1]) {
                    maxRow = j;
                }
            }

            int temp = matrix[i][1];
            matrix[i][1] = matrix[maxRow][1];
            matrix[maxRow][1] = temp;

            int tempIndex = matrix[i][0];
            matrix[i][0] = matrix[maxRow][0];
            matrix[maxRow][0] = tempIndex;



        }
        return matrix;
    }
    public static void display(int[][] matrix){
        System.out.println("Employees and their total hours in decreasing order of the total hours: \n");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Employee " + matrix[i][0] + "'s total work hour is  " + matrix[i][1]);
        }

}
}

