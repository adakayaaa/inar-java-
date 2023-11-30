package week_12.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput= true;
       do{
           try {
               System.out.println("Enter two integers to sum: ");
               int number1= input.nextInt();
               int number2= input.nextInt();
               int sum=number1+number2;
               System.out.println("Sum of  " +number1+" + " + number2 +" is " + sum);
               continueInput=false;

           }catch (InputMismatchException ex){
               System.out.println("Wrong input! Please enter integer");
               input.nextLine();
           }

       }while (continueInput);


    }


}

