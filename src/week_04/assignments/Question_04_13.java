package week_04.assignments;
import java.util.*;
public class Question_04_13 {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        if( letter.length() != 1){
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        }

        char character = letter.charAt(0);

        if( 65 <=character && character<= 90){
            System.out.println(character + " is an consonant");
        }else if ( 97<= character && character<= 122) {
            System.out.println( character +" is a vowel");
        }else {
            System.out.println( character + " is an invalid input");
        }
    }
}
