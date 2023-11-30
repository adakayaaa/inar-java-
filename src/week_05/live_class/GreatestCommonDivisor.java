package week_05.live_class;

import java.util.*;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int greatCommonDivisor = 1;
        int possibleGcd = 2;
        while (possibleGcd < number1 && possibleGcd < number2) {
            if (number1 % possibleGcd == 0 && number2 % possibleGcd == 0) {
                greatCommonDivisor = possibleGcd ;
            }
                possibleGcd++;

        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 +
                " is " + greatCommonDivisor);

    }
}

