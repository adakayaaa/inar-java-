package week_07.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] computingGcd = new int[5];

        System.out.print("Enter five numbers: ");

        for (int i = 0; i < computingGcd.length; i++) {
            computingGcd[i] = input.nextInt();
        }
    }
}


