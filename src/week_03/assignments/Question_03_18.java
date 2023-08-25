package week_03.assignments;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package (in pounds) : ");

        double weightInPounds = input.nextDouble();
        double cost = 0;

        if (weightInPounds <= 1) {
            cost = weightInPounds * 3.5;
        } else if (weightInPounds <= 3) {
            cost = weightInPounds * 5.5;
        } else if (weightInPounds <= 10) {
            cost = weightInPounds * 8.5;
        } else if (weightInPounds <= 20) {
            cost = weightInPounds * 10.5;
        } else {
            System.out.println(" The package cannot be shipped.");
            System.exit(1);
        }
        System.out.println(" Shipping cost of package is $" + cost);

    }
}