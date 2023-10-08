package week_07.assignments;

import java.util.Scanner;

public class Question_07_18 {
    //not finished
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        displayBubbleSort(numbers);
    }

    public static void displayBubbleSort(double[] array) {
        for (int i = 0; i < array.length-2; i++) {
            int min = i;
            for(int j=i+1;j< i+2;j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            double temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

