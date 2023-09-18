package week_06.assigments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("The sum of the digits in " +number + " is " + sumDigits(number) );
    }
    public static int sumDigits (int number){
        int newNumber = 0;
       while (number>=10){
           newNumber += number%10;
           number= number/10;

       }
       newNumber += number;
      return newNumber;
    }
}
