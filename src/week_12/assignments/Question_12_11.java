package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Question_12_11 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("usage: java Question_12_11 removeStr fileName ");
            System.exit(1);

        }

        String removeStr= args[0];
        File sourceFile = new File(args[1]);

        if (!sourceFile.exists()) {
            System.out.println("The file does not exist!");
            System.exit(2);
        }

        Scanner input = new Scanner(sourceFile);
        String str = " ";
        while (input.hasNext()) {
            str += input.nextLine() + "\n";
        }
        str = str.replaceAll(removeStr, "");

        PrintWriter output = new PrintWriter(sourceFile);
        output.println(str);
        output.close();

    }

}

