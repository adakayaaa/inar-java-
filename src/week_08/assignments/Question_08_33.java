package week_08.assignments;

import java.util.Scanner;

public class Question_08_33 {
    //STH İS WRONG
    public static void main (String[] args){
        double[][] matrix = createMatrix(4, 2);
        double[] intersectingPoint = getIntersectingPoint(matrix);
        getTriangleArea(matrix,intersectingPoint);
    }
    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[row][column];
        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }

        }
        return matrix;
    }
    public static double[] getIntersectingPoint(double[][] matrix) {
        double[] solve = new double[2];

        double a = (matrix[0][1] - matrix[1][1]);
        double b = (matrix[1][0] - matrix[0][0]);
        double c = (matrix[2][1] - matrix[3][1]);
        double d = (matrix[3][0] - matrix[2][0]);
        double e = a * matrix[0][0] - (-b) * matrix[0][1];
        double f = c * matrix[2][0] - (-d) * matrix[2][1];
        solve[0] = (e * d - b * f) / (a * d - b * c);
        solve[1]  = (a * f - e * c) / (a * d - b * c);
        return solve;
    }
    public static void getTriangleArea (double[][] matrix, double[] array){
        double []side1 = new double[4];
        double []side2 = new double[4];


        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                side1[i]+= Math.pow(array[j]-matrix[i][j],2);
                side2[i] += Math.pow(matrix[i][j]-matrix[i+1][j],2);
            }

        }
        side2[3] = Math.pow(matrix[3][0]-matrix[0][0],2)+Math.pow(matrix[3][1]-matrix[0][1],2);


        double[]side = new double[4];
        for (int i = 0; i < matrix.length-1; i++) {
            side[i]= (Math.sqrt(side2[i])+Math.sqrt(side2[i+1])+Math.sqrt(side1[i]))/2;
            }
        side[3]=side2[3]+side2[0]+side1[3];



        double [] area = new double[4];
        for (int i = 0; i < area.length-1; i++) {
            area[i]= Math.sqrt(side[i] * (side[i] - side2[i]) * (side[i] - side2[i+1]) * (side[i] - side1[i]));
        }
        area[3]= Math.sqrt(side[3] * (side[3] - side2[3]) * (side[3] - side2[0]) * (side[3] - side1[3]));

        for (int i = 0; i < area.length; i++) {
            System.out.println(area[i] +" ");
        }
    }

}

