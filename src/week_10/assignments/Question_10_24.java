package week_10.assignments;

import java.sql.SQLOutput;

public class Question_10_24 {
    public static void main(String[] args) {
        MyCharacter character= new MyCharacter('A');
        System.out.println(character); //A
        System.out.println(character.toLowerCase()); //a
        System.out.println(character.toUpperCase()); //A
        System.out.println(character.isDigit()); //false
        System.out.println(character.isLetter()); //true
        System.out.println(character.isLetterOrDigit()); //true
        System.out.println(new MyCharacter('2')); //2

    }
}

