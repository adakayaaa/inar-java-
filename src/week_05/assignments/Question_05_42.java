 package week_05.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the commission sought: ");
        double commissionSought = input.nextDouble();

        double sum =  (5000 * 0.08) + (5000 * 0.10);

        for(double i=10000; i>= 10000; i+=0.01) {
            if (sum + ((i - 10000.0) * 0.12) >= commissionSought) {

                System.out.printf("%s%.2f", "Minimum sales to earn $" +commissionSought + ": $", i);
                break;
            }
        }
    }
}

