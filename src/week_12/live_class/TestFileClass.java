package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class TestFileClass {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\live_class\\test";
        File file = new File(path);
        System.out.println("Does it exist? : " +file.exists());

        PrintWriter output= new PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();
        Scanner input=new Scanner(file);
        while(input.hasNext()){
            String firstName= input.next();
            String mi= input.next();
            String lastName= input.next();
            int score= input.nextInt();
            System.out.println(firstName +" " + mi + " " + lastName+" " + score  );
        }
        input.close();

        System.out.println("-------------------------------------");
        System.out.println("The file has : " +file.length() +" bytes");
        System.out.println("Can it be read : " +file.canRead());
        System.out.println("Can it be written : " +file.canWrite());
        System.out.println("Is it a directory: " +file.isDirectory());
        System.out.println("Is it a file: " +file.isFile());
        System.out.println("Is it a absolute: " +file.isAbsolute());
        System.out.println("Is it a hidden: " +file.isHidden());
        System.out.println("Absolute path is : " +file.getAbsolutePath());
        System.out.println("Last modified on  : " + file.lastModified());
    }
}

