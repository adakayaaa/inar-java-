package week_05.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter numbers: ");
        int number = input.nextInt();
        int max = number;
        int count = 0;

        while (number != 0){
            number = input.nextInt();
            if(number>max){
                max= number;
                count=1;
            }else if (number == max){
                count ++;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

    }
}
