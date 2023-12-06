package week_13.assignments;

import java.util.Arrays;

public class Question_13_16 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        String allNumber = args[0] + args[1] + args[2];
        String[] allNumbersSplit = allNumber.split("[-+/*]");
        System.out.println(Arrays.toString(allNumbersSplit));

        int firstNumerator = Integer.parseInt(allNumbersSplit[0]);
        int firstDenominator = Integer.parseInt(allNumbersSplit[1]);
        long[] firstNumber = getNumber(firstNumerator, firstDenominator);

        int secondNumerator = Integer.parseInt(allNumbersSplit[2]);
        int secondDenominator = Integer.parseInt(allNumbersSplit[3]);
        long[] secondNumber = getNumber(secondNumerator, secondDenominator);


        long[] result = new long[2];
        switch (args[1]) {
            case "+":
                result = getAdd(firstNumber, secondNumber);
                break;
            case "-":
                result = getSubtract(firstNumber, secondNumber);
                break;
            case "*":
                result = getMultiply(firstNumber, secondNumber);
                break;
            case "/":
                result = getDivide(firstNumber, secondNumber);
        }

        System.out.println(args[0] +" " +  args[1]  + " " + args[2] + " = " + result[0] + "/" + result[1]);


    }

    public static long[] getNumber(int numerator, int denominator) {
        long[] number = new long[2];
        long gcd = gcd(numerator, denominator);
        number[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        number[1] = Math.abs(denominator) / gcd;
        return number;

    }

    public static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static long[] getAdd(long[] firstNumber, long[] secondNumber) {
        long[] result = new long[2];
        result[0] = firstNumber[0] * secondNumber[1] +
                firstNumber[1] * secondNumber[0];

        result[1] = firstNumber[1] * secondNumber[1];
        return result;
    }

    public static long[] getSubtract(long[] firstNumber, long[] secondNumber) {
        long[] result = new long[2];
        result[0] = firstNumber[0] * secondNumber[1] -
                firstNumber[1] * secondNumber[0];

        result[1] = firstNumber[1] * secondNumber[1];
        return result;
    }

    public static long[] getMultiply(long[] firstNumber, long[] secondNumber) {
        long[] result = new long[2];
        result[0] = firstNumber[0] * secondNumber[0] ;
        result[1] = firstNumber[1] * secondNumber[1];
        return result;
    }
    public static long[] getDivide(long[] firstNumber, long[] secondNumber) {
        long[] result = new long[2];
        result[0] = firstNumber[0] * secondNumber[1] ;
        result[1] = firstNumber[1] * secondNumber[0];
        return result;
    }

}
