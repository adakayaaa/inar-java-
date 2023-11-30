package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("usage: dir oldString newString");
            System.exit(1);
        }

        File directory = new File("C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\" + args[0]);
        String oldStr= args[1];
        String newStr= args[2];


        ArrayList<File> directories = new ArrayList<>();
        ArrayList<File> fileNameList = new ArrayList<>();
        directories.add(directory);

        while (!directories.isEmpty()) {
            File firstFile = directories.remove(0);

            File[] files = firstFile.listFiles();
            for (File subFile : files ) {
                if (subFile.isDirectory()) {
                    directories.add(subFile);
                }
                if (subFile.isFile()) {
                    fileNameList.add(subFile);

                }
            }

        }

        for (int i = 0; i < fileNameList.size(); i++) {
            Scanner input=new Scanner(fileNameList.get(i));
            String str="";
            while (input.hasNext()){
                str += input.nextLine()+"\n";
            }
            str = str.replaceAll(oldStr,newStr);
            PrintWriter output= new PrintWriter(fileNameList.get(i));
            output.println(str);
            output.close();
        }


    }
}

