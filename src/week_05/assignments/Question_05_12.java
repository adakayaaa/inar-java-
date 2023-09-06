package week_05.assignments;

import java.util.Scanner;

public class Question_05_12 {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
      int number =1;

        while(number<12001){
            if(Math.sqrt(number)==Math.sqrt(12000)){
                System.out.println("The smallest n is -" + ((int)Math.sqrt(number)+1) );
            }
            number ++;
            }

        }
    }

