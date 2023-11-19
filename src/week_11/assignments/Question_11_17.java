package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

//STH İS WRONG

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m = input.nextInt();

        System.out.println("The smallest number n for m*n to be a perfect square is " + getN(m));
    }

    public static double getN(int number) {
        double n = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int possibleGcd =2;

        while(possibleGcd<=number) {
            if (number % possibleGcd == 0) {
                list.add(number);
                number = number / possibleGcd;

            } else {
                possibleGcd++;
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                n *= list.get(i);
            }
        }
        return n;
    }

}
