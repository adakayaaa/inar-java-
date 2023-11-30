package week_07.assignments;

import java.util.Scanner;

public class Question_07_02 {
    public static void  main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int [] number = new int [10];

        for (int i=0; i< number.length;i++){
            number [i] = input.nextInt();
        }
        printReverse(number);
    }
    public static void printReverse(int [] number){
        for (int i= number.length-1 ;i>=0;i--){
            System.out.print(number[i] + " ");
        }
    }
}

