package week_06.live_class;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.println("The greatest common divisor for " + number1 + " and " + number2 +
                " is " + gcd(number1, number2));
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int possibleGcd = 2;

        while (possibleGcd <= n1 && possibleGcd <= n2) {
            if (n1 % possibleGcd == 0 && n2 % possibleGcd == 0) {
                gcd = possibleGcd;
            }
            possibleGcd++;
        }
        return gcd;
    }

}

