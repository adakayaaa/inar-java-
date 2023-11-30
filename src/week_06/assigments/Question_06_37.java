package week_06.assigments;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();

        System.out.println(number + " formatted to width " + width + ": " +  format(number, width));
    }

    public static String format(int number, int width) {
        String newNumber = number + "";
        String str = "";
       while( width> newNumber.length()){
           str += "0";
           width--;
        }
        str += number;
        return str;
    }
}

