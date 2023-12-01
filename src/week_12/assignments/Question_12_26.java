package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//STH İS WRONG!

public class Question_12_26 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\directories\\question_12_26\\";
        File directory = new File(path);

        System.out.println(directory.isDirectory());

        ArrayList<File> directories = new ArrayList<>();
        ArrayList<File> files = new ArrayList<>();

        directories.add(directory);

        while (!directories.isEmpty()) {
            File fileRemoveList = directories.remove(0);
            File[] fileArray = fileRemoveList.listFiles();

            for (File subFile : fileArray) {
                if (subFile.isDirectory()) {
                    directories.add(subFile);
                }
                if (subFile.isFile()) {
                    files.add(subFile);
                }
            }
        }

        for (int i = 0; i < files.size(); i++) {
            Scanner input = new Scanner(files.get(i));
            String str = "";

            String absolutePath = files.get(i).getAbsolutePath();
            String[] allAbsolutePathArray = absolutePath.split("question_12_26\\\\");

            if (allAbsolutePathArray[1].startsWith("Question") && allAbsolutePathArray[1].endsWith(".java")) {
                String[] formatAboutName = allAbsolutePathArray[1].split("[_.java]");

                StringBuilder stringBuilder = new StringBuilder(formatAboutName[1]);
                if (stringBuilder.length() == 1) {
                    stringBuilder.insert(0, "0");
                }

                StringBuilder stringBuilderForPartTwo = new StringBuilder(formatAboutName[2]);
                if (stringBuilderForPartTwo.length() == 1) {
                    stringBuilderForPartTwo.insert(0, "0");
                }

                String name = stringBuilder + "_" + stringBuilderForPartTwo;
                System.out.println(name);
                while (input.hasNext()) {
                    str += input.nextLine() + "\n";
                    if(str.contains("public class Question_")) {
                        str = "public class Question_" +name;
                    }
                }
                PrintWriter output=new PrintWriter(files.get(i));
                output.println(str);
                output.close();


            }

        }
    }
}

