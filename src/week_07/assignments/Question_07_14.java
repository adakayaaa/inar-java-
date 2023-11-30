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
        System.out.println("The greatest common divisor is " + gcd(computingGcd));
    }

    public static int gcd(int... numbers) {
        int greatCommonDivisor = 1;
        int possibleGcd = 2;
        int minNumber = smallestNumber(numbers);

        for (possibleGcd = 2; possibleGcd <= minNumber; possibleGcd++) {
            boolean result = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % possibleGcd != 0) {
                    result = false;
                    break;
                }
            }
            if (result) {
                greatCommonDivisor = possibleGcd;
            }

        }
        return greatCommonDivisor;
    }


    public static int smallestNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

