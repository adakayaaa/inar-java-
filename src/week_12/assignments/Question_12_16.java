package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_16 {

    //SomeText.txt
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length !=3){
            System.out.println("Usage: java Question_12_16 sourceFile oldStr newStr ");
            System.exit(1);
        }

        File sourceFile = new File("C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\" + args[0]);

        Scanner input=new Scanner(sourceFile);
        String str="";
        while (input.hasNext()){
            str+= input.nextLine()+"\n";
        }

        String oldStr= args[1];
        String newStr= args[2];
        str=str.replaceAll(oldStr,newStr);

        PrintWriter output=new PrintWriter(sourceFile);
        output.println(str);
        output.close();





    }
}
