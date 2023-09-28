package week_06.live_class;

import java.util.Scanner;

public class Return_Closest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(blackjack(number1, number2));

    }

    public static int blackjack(int number1, int number2) {

        if (number1 > 21 && number2 > 21) {
            return 0;

        } else if (number1 > 21 || number2 > 21) {
            return Math.min(number1, number2);

        } else {
            return Math.max(number1, number2);
        }
    }
}
