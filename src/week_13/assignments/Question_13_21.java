package week_13.assignments;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c :");
        String a= input.next();
        String b= input.next();
        String c= input.next();


      RationalClassForBigInteger forA= new RationalClassForBigInteger(new BigInteger(a),BigInteger.ONE);
      RationalClassForBigInteger forB= new RationalClassForBigInteger(new BigInteger(b),BigInteger.ONE);
      RationalClassForBigInteger forC= new RationalClassForBigInteger(new BigInteger(c),BigInteger.ONE);

      RationalClassForBigInteger forNegativeOne= new RationalClassForBigInteger(new BigInteger("-1"),BigInteger.ONE);
      RationalClassForBigInteger forTwo= new RationalClassForBigInteger(new BigInteger("2"),BigInteger.ONE);

      RationalClassForBigInteger h= forNegativeOne.multiply(forB.divide(forA.multiply(forTwo)));
      RationalClassForBigInteger k= forC.add(forA.multiply(forNegativeOne).multiply(h.multiply(h)));

        System.out.println("h is : " + h.toString() + "\nk is : " + k.toString());
    }
}
