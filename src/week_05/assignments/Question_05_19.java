package week_05.assignments;

import java.util.Scanner;

public class Question_05_19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int j = i; j <= (int)Math.pow(2,i-1); j++) {
                System.out.print((int)Math.pow(2,i-1));
            }
            System.out.println();
        }
    }
}