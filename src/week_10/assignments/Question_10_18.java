package week_10.assignments;

import java.math.BigInteger;


public class Question_10_18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }

    }

    public static boolean isPrime(BigInteger number) {
        for (BigInteger i = BigInteger.TWO;
             i.compareTo(number.divide(BigInteger.TWO)) < 0 ;
             i = i.add(BigInteger.ONE)) {
            if (number.mod(i).compareTo(BigInteger.ZERO)==0) {
                return false;
            }

        }
        return true;
    }

}

