package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_13 {
    public static void main(String[] args) throws FileNotFoundException {
        String sourceFile = args[0];
        File file = new File("C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\" + sourceFile);

        int countOfLines = 0;
        Scanner input = new Scanner(file);
        String str = "";

        while (input.hasNext()) {
            str += input.nextLine() + "\n";
            countOfLines++;
        }

        String[] countOfWords = str.split(" ");
        str=str.trim();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
                list.add(str.charAt(i));
            }



        System.out.println("File " + args[0] + " has\n" +
                countOfLines + " lines\n" +
                countOfWords.length + " words\n" +
                list.size() + " characters ");

    }
}
