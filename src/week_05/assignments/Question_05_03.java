package week_05.assignments;

import java.util.*;

public class Question_05_03 {
    public static void main(String[] args) {

        int number = 1;
        double poundsPerKilogram = 2.2;

        System.out.println(" Kilograms              Pounds");
        while (number < 200) {

            double kilogram = number * poundsPerKilogram;

            System.out.printf("\t%-10d%15.2f\n",number,kilogram);
            number += 2;


        }

    }
}

