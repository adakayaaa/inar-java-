package week_05.assignments;

import java.util.*;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalDigit = 0;
        int positive = 0;
        int negative = 0;

        int number = 1;
        double total = 0;
        String output = "\n";

        while (number != 0) {
            total += number;
            System.out.print(" Enter an integer, the input ends if it is 0: ");
            number = input.nextInt();
            totalDigit++;

            if (number > 0) {
                positive++;

            } else if (number < 0) {
                negative++;

            }
            output += "\nThe number of positives: " + positive
                    + "\nThe number of negatives: " + negative
                    + "\nThe  total is: " + total +
                    "The  average is: " + (total / totalDigit);
        }

            System.out.println(output);
        }


    }


