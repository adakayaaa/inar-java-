package week_08.assignments;

import java.util.Scanner;

public class Question_08_33 {
    public static void main (String[] args){
        double[][] matrix = createMatrix(4, 2);
        double[] intersectingPoint = getIntersectingPoint(matrix);
        double [] areasArray = getTriangleArea(matrix,intersectingPoint);
        sort(areasArray);
        display(areasArray);
    }
    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[row][column];
        System.out.print("Enter x1,y1,x3,y3,x2,y2,x4,y4: ");
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
    public static double[] getTriangleArea (double[][] matrix, double[] intersection){
        double []result = new double[4];

        result[0] = calculateTriangle(matrix,0,2,intersection);
        result[1] = calculateTriangle(matrix,1,2,intersection);
        result[2] = calculateTriangle(matrix,1,3,intersection);
        result[3] = calculateTriangle(matrix,3,0,intersection);

        return result;
    }
    public static double calculateTriangle(double[][] matrix,int point1,int point2, double[] intersection){
        double side1= getDistance(matrix[point1], matrix[point2]);
        double side2= getDistance(matrix[point1], intersection);
        double side3= getDistance(matrix[point2], intersection);

        double side = (side1 + side2 + side3) / 2;


        double area = Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
        return area;
    }
    public static double getDistance(double[]point1,double[] point2){
        return Math.sqrt(Math.pow(point1[0]-point2[0] ,2 ) +
                Math.pow(point1[1]-point2[1] ,2 ));
    }
    public static void sort(double[] areas){
        for (int i = 0; i < areas.length-1; i++) {
            double min =areas[i];
            int minIndex =i;
            for (int j = i+1; j <areas.length; j++) {
                if(min>areas[j]){
                    min = areas[j];
                    minIndex=j;
                }
            }
            if(minIndex !=i){
                double temp= areas[i];
                areas[i] = areas[minIndex];
                areas[minIndex]= temp;

            }

        }
    }
    public static void display(double[] areas){
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%-7.2f",areas[i]);
        }

    }

}

