package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        String sourceFile = args[0];
        File file = new File("C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\"+sourceFile);

        Scanner input = new Scanner(file);
        String str = "";

        while (input.hasNext()) {
            str += input.nextLine() + "\n";
        }

        str = str.replaceAll("\\s*\\{", " {");
        PrintWriter output=new PrintWriter(file);
        output.println(str);
        output.close();


    }

}

