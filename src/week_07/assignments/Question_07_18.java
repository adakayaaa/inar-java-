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
        for (int i = 0; i < array.length-1; i++) {
            for(int j=i+1;j<array.length;j++) {
                //i am not sure, is this what the question wants..
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            /*
            another answer:
               for (int i = 0; i < array.length-1; i++) {
                    for(int j=0;j<array.length-i-1;j++) {
                        if (array[j] > array[j+1]) {
                        double temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                }
            }

             */
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

