package week_07.assignments;

import java.util.Scanner;

public class Question_07_28 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= input.nextInt();
        }

        display(numbers);
    }
    public static void display(int [] array){
        for(int i = 0;i< array.length;i++){
            for(int j = 1; j< array.length;j++){
                if(array [i] == array[j]){
                    continue;
                }
                System.out.println(array[i] +" " + array [j]);
            }
        }
    }

}
