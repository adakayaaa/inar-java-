package week_03.assignments;

import java.util.*;

public class Question_03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10) ;
        int number3 = (int) (Math.random() * 10) ;

        System.out.println( "What is " + number1 + " + " + number2 + " + " +
                number3 + " = " + " ? ");
        int answer = input.nextInt();
        if ( number1 + number2 + number3 == answer )
            System.out.println( number1 + " + " + number2 + " + " + number3 +
                    " is true");
        else {
            System.out.println(number1 + " + " + number2 + " + " + number3 +
                    " is false");
        }
    }
}

