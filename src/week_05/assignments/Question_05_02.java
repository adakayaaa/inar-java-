package week_05.assignments;

import java.util.*;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        int question = 0;
        String output = " ";

        while (question < 10) {
            int number1 = (int) (Math.random() * 14+1);
            int number2 = (int) (Math.random() * 14 + 1);
            System.out.print("What is " + number1 + " + " + number2 + " ? ");
            int answer = input.nextInt();


            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println(" You answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1+number2));
            }
            question++;
            output += "\n" + number1 + " + " + number2 + " = " +answer +((number1 + number2== answer )? "correct" : " wrong ");

        }
        long finishTime = System.currentTimeMillis();
        long totalTime = (finishTime - startTime) / 1000;
        System.out.println("Test time is " + totalTime + " seconds " +output);
    }
}

