package week_05.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int upperCaseCharacters = 0;

        System.out.print("Enter a string: ");
        String name = input.nextLine();

        for(int i=0; i<= name.length()-1; i++){
            char ch =name.charAt(i);
            if(Character.isUpperCase(ch) ){
                upperCaseCharacters++;
            }
        }
        System.out.println("The number of uppercase letters " + upperCaseCharacters);
    }
}

