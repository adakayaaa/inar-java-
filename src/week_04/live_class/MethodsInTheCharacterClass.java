package week_04.live_class;
import java.util.*;
public class MethodsInTheCharacterClass {
    public static void main (String [] args){
        Scanner input= new Scanner(System.in);

         char ch = 90; // Z
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a numeric character" );



        System.out.println("*************************************");
        System.out.println(Character.isDigit('t')); //false
        System.out.println(Character.isLetter('t')); //true
        System.out.println(Character.isLetterOrDigit('a')); //true
        System.out.println("Is A lower case " + Character.isLowerCase('A')); //Is A lower case false
        System.out.println("Is A upper case " + Character.isUpperCase('A')); //Is A upper case true
        System.out.println("Convert i to uppercase: " +Character.toUpperCase('i')); //Convert i to uppercase I
        System.out.println("Convert T to lowercase: " + Character.toLowerCase('T')); //Convert T to lowercase t
    }
}
