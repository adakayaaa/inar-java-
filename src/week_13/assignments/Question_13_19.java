package week_13.assignments;

import java.awt.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        String number = input.nextLine();


        String[] numberArray = number.split("\\.");
        String numberArrayOne="";
        if (numberArray[0].contains("-")) {
            int numberOne = (Integer.parseInt(numberArray[0])) * -1;
            numberArrayOne = numberOne + "";
        }else{
            numberArrayOne=numberArray[0];
        }

        BigInteger numberOne = new BigInteger(numberArrayOne);
        BigInteger numerator = new BigInteger(numberArray[1]);

        long denominatorLong = (long) Math.pow(10, numberArray[1].length());
        BigInteger denominator = new BigInteger(denominatorLong + "");

        RationalClassForBigInteger numberPartTwo = new RationalClassForBigInteger(numerator, denominator);
        RationalClassForBigInteger numberPartOne = new RationalClassForBigInteger(numberOne, new BigInteger("1"));

        RationalClassForBigInteger result = numberPartTwo.add(numberPartOne);

        if (numberArray[0].contains("-")) {
            System.out.println("The fraction number is -" + result);
        } else {
            System.out.println("The fraction number is " + result);
        }

    }
}
