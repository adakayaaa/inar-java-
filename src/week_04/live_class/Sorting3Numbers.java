package week_04.live_class;

import java.util.*;

public class Sorting3Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int min, max, mid;

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int tempMax = Math.max(number1, number2);
        max = Math.max(tempMax, number3);

        System.out.println("The max number is " + max);
        System.out.println("*****************");

        int tempMin = Math.min(number1, number2);
        min = Math.min(tempMin, number3);
        System.out.println("The min number is " + min);
        System.out.println("******************");

        if (number1 != min && number1 != max) {
            System.out.println("number1 is mid number");
        } else if (number2 != min && number2 != max) {
            System.out.println("number2 is mid number");
        } else {
            System.out.println("number3 is mid number");
        }


    }
}

