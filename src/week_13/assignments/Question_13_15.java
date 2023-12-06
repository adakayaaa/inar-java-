package week_13.assignments;

import java.math.BigInteger;

public class Question_13_15 {
    public static void main(String[] args) {

        RationalClassForBigInteger number1 = new RationalClassForBigInteger();
        number1.setNumerator(new BigInteger("5"));
        number1.setDenominator(new BigInteger("6"));


        RationalClassForBigInteger number2 = new RationalClassForBigInteger();
        number2.setNumerator(new BigInteger("1"));
        number2.setDenominator(new BigInteger("4"));

        System.out.println(number1);
        System.out.println(number2);

        System.out.println(number1 + " + " + number2 + " = " + number1.add(number2));
        System.out.println(number1 + " - " + number2 + " = " + number1.subtract(number2));
        System.out.println(number1 + " * " + number2 + " = " + number1.multiply(number2));
        System.out.println(number1 + " / " + number2 + " = " + number1.divide(number2));


        System.out.println(number2 + " is " + number2.doubleValue());
        System.out.println(number1 + " is " + number1.doubleValue());

    }
}
