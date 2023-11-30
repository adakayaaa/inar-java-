package week_04.live_class;
import java.util.*;
public class CharExercise {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        char letter = 'a';
        System.out.println((int)letter); //97
        System.out.println((char)100); //d

        char number1 = '1';
        System.out.println((int) number1); //49

        System.out.println("**************");

        char character = 's';
        System.out.println(character); //s
        System.out.println(++character); //t
        System.out.println(++character); //u

        System.out.println("**************");

        char ch = (char)65.25;// Decimal 65 is assigned to ch
        System.out.println(ch); //A

        System.out.println("**************");
        int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
        System.out.println("i is " + i); // i is 101

        int j = 2 + 'a'; // (int)'a' is 97
        System.out.println("j is " + j); // j is 99

        System.out.println(j + " is the Unicode for character "
                + (char)j); // 99 is the Unicode for character c

        System.out.println("Chapter " + '2'); //Chapter 2
    }
}

