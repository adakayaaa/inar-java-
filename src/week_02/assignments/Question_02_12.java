package week_02.assignments;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration ");

        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = (Math.pow(speed, 2)) / (2 * acceleration);

        System.out.println(" The minumum runway length for tih airplane is " +
                length);
    }
}

