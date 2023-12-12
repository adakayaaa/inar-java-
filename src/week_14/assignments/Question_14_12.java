package week_14.assignments;

import java.util.Scanner;

public class Question_14_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

       int[] ch = new int[128];
        for (int i = 0; i < str.length(); i++) {
           ch[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(ch[str.charAt(i)]==1){
                System.out.println("The first non-repeating character is " + str.charAt(i) + " :" + (i+1) + ".character of the string.");
                break;
            }
        }
    }

}

