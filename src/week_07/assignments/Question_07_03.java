package week_07.assignments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between '1' and '100': ");

        int[] count = new int[100];

        for (int i = 0; i < count.length; i++) {
            int inputNumbers = input.nextInt();
            if(inputNumbers ==0){
                break;
            }
            count[inputNumbers]++;


        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occur " +count[i] + " " +((count[i]) > 1 ? "times" : "time"));
            }


        }

    }
}

