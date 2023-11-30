package week_05.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = input.nextInt();
        int number =2;

        while(number<=integer){
            if(integer%number == 0){
                System.out.println(" " + number);
                integer = integer/number;

            }else{
                number++;
            }

        }



    }
}

