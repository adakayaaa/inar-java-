package week_04.assignments;

import java.util.Scanner;

public class Question_04_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int letter1 = (int) (Math.random() * 25) + 65;
        int letter2 = (int) (Math.random() * 25) + 65;
        int letter3 = (int) (Math.random() * 25) + 65;

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int number4 = (int) (Math.random() * 10);

        System.out.println("Generated plate number: " +(char)letter1 + "" +(char)letter2 + "" +(char)letter3
        + "" +number1+""+number2+""+number3+""+number4);


    }
}

