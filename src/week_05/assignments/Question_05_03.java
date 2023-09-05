package week_05.assignments;

import java.util.*;

public class Question_05_03 {
    public static void main(String[] args) {

        int number = 1;
        double poundsPerKilogram = 2.2;

        System.out.println(" Kilograms             Pounds");
        while (number < 200) {

            double kilogram = number * poundsPerKilogram;
            System.out.print(number);
            if (number < 11) {
                System.out.println("                        "+ kilogram);
            } else if (11 <= number && number < 101) {
                System.out.println("                       " + kilogram);
            } else {
                System.out.println("                      " + kilogram);
            }
            number += 2;


        }

    }
}


