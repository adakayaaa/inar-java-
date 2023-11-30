package week_04.live_class;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Inar Academy";
        System.out.println(" The character length is " + name.length());

        System.out.println(" The third character is " + name.charAt(2) +
                "and the last character is " + name.charAt(11));

        System.out.println(name.indexOf('d'));

        System.out.println("**************");

        String firstWords = "I love ";
        String sentence = firstWords + name; //or
        String newSentence = firstWords.concat(name);
        System.out.println(sentence);
        System.out.println(newSentence);

        System.out.println("**************");

        System.out.println("       Welcome        ");
        System.out.println("       Welcome        ".toLowerCase());
        System.out.println("       Welcome        ".toUpperCase());
        System.out.println("       Welcome        ".length());
        System.out.println("       Welcome        ".trim());
        System.out.println("Welcome".length());

        System.out.println("**************");

        System.out.println("Enter a line: ");
        String name2 = input.nextLine();
        System.out.println("The line entered is " + name2);

        System.out.println("****************");

        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}

