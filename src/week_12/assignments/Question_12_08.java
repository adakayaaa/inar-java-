package week_12.assignments;

import java.util.Scanner;

public class Question_12_08 {
    public static void main(String[] args) throws HexFormatException {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            System.out.println(" The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws HexFormatException{
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (Character.isDigit(ch)) {
            return ch - '0';
        } else {
            throw new HexFormatException();
        }
    }
}

