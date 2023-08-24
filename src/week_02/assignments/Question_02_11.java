package week_02.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");

        int years = input.nextInt();
        int population = 312032486 + ((((365 * 24 * 60* 60) / 7) -
                ((365 * 24 * 60 * 60) / 13) +
                ((365 * 24 * 60* 60) / 45)) * years);

        System.out.println("The population in " + years +
                " years is " + population);

    }
}
