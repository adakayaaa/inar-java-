package week_13.assignments;

import java.math.BigInteger;

public class Question_13_18 {
    public static void main(String[] args) {
        RationalClassForBigInteger number1= new RationalClassForBigInteger();

        for (int i = 1; i < 100; i++) {
            BigInteger numerator= new BigInteger(i+"");
            BigInteger denominator= new BigInteger((i+1)+"");
            number1=number1.add(new RationalClassForBigInteger(numerator,denominator));
        }
        System.out.println("Sum of numbers--> " + number1);
    }
}
