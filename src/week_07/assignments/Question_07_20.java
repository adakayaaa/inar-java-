package week_07.assignments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] list = new double[10];

        System.out.println("Enter ten numbers: ");
        for(int i=0; i< list.length;i++){
            list[i] = input.nextDouble();
        }
        reviseSelectionSort(list);

    }
    public static void  reviseSelectionSort(double [] array){
        for(int i= array.length-1;i>=1;i--){
            int max = i;
            for(int j= i-1;j>=0; j--){
                if(array[j]> array[max]){
                    max = j;

                }
            }
            double temp = array[i];
            array[i] = array[max];
            array [max] =temp;
        }
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}