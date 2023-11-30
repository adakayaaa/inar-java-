package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = new String[10];
        int count = 0;
        String distinctNumbers = " ";

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextLine();
            if (!distinctNumbers.contains(numbers[i]) ) {
                count++;
                distinctNumbers += (numbers[i] + " ");
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.println("The distinct numbers are" + distinctNumbers);
    }
}

