package week_11.assignments;

import java.util.ArrayList;

import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();
        list.add(answer);

        while (number1 + number2 != answer) {
            System.out.println("Wrong answer. Try again. What is " + number1 + "+ " + number2 + " ? ");
            answer= input.nextInt();
            if(list.contains(answer)){
                System.out.println("You already entered " + answer);
            }else{
                list.add(answer);
            }

        }
        System.out.println("You got it!");
    }
}
