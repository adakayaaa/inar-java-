package week_05.live_class;

import java.util.*;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (the input ends if it is 0):");
        int data = input.nextInt();

        int sum =0;
        while(data !=0){
            sum+=data;
            System.out.print("Enter an integer (the input ends if it is 0):");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
