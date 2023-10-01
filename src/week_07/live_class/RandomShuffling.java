package week_07.live_class;

import java.util.Scanner;

public class RandomShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int size = input.nextInt();

        double[] list = new double[size];
        System.out.println("Enter " + size + " number: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        for (int i = list.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;

        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);

        }
    }
}
