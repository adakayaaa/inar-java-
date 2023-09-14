package week_05.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String name = input.nextLine();
        String charactersAtOddPosition ="";

        for(int i=0;i<= name.length()-1; i+=2){
            charactersAtOddPosition += name.substring(i,i+1);
        }
        System.out.println(charactersAtOddPosition);
    }
}
