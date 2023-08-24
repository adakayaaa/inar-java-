package week_02.assignments;
import java.util.Scanner;
public class Question_02_10 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        System.out.println("Enter the initial temperature: ");
        System.out.println("Enter the final temperature: ");

        double amountOfWater = input.nextDouble();
        double initialTemperature = input.nextDouble();
        double finalTemperature = input.nextDouble();

        double energy = amountOfWater *
                (finalTemperature - initialTemperature ) * 4184;

        System.out.println("The energy needed is " + energy);

    }
}
