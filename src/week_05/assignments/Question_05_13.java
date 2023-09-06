package week_05.assignments;

import java.util.Scanner;

public class Question_05_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int theSmallestNumber =1;

        while (Math.pow(number,3) < 12000) {

            if (number > theSmallestNumber) {
                theSmallestNumber= number;
            }
            number++;
        }
        System.out.println("The largest n is " + theSmallestNumber);
    }
}
