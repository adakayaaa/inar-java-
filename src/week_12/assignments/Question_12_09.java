package week_12.assignments;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a binary number: ");
            String binaryNumber = input.nextLine();
            int decimalNumber = bin2Dec(binaryNumber);
            System.out.println("The decimal value for binary number " + binaryNumber + " is " + decimalNumber);
        } catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static int bin2Dec(String binaryNumber)
            throws BinaryFormatException {

        int number = 0;
        int count = 0;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            number += (getBinaryNumber(binaryNumber.charAt(i)) * (int) Math.pow(2, count));
            count++;
        }
        return number;
    }


    public static int getBinaryNumber(char ch)
            throws BinaryFormatException {

        if (ch == '1') {
            return 1;
        } else if (ch == '0') {
            return 0;
        } else {
            throw new BinaryFormatException();
        }
    }
}

