package week_06.live_class;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total kilogram of packet: ");
        int totalPacket = input.nextInt();

        System.out.print("Enter small packet count (1kg): ");
        int smallPacket = input.nextInt();

        System.out.print("Enter large packet count (5kg): ");
        int largePacket = input.nextInt();
        System.out.println(makeChocolate(smallPacket, largePacket, totalPacket));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int sum = 0;
        for (int i = 1; i <= big; i++) {
            sum += 5;
            if (sum > goal) {
                sum -= 5;
                break;
            }
        }
        if (small < goal - sum) {
            return -1;
        } else {
            return goal - sum;
        }
    }
}
