package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_20 {
    public static void main(String[] args) throws FileNotFoundException {
        String srcRootDirectoryPath = System.getProperty("user.dir") + "\\src\\week_12\\assignments\\directories";
        File file = new File(srcRootDirectoryPath);

        System.out.println(file.isDirectory());

        ArrayList<File> directories = new ArrayList<>();
        ArrayList<File> files = new ArrayList<>();
        directories.add(file);

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
            String absolutePath = files.get(i).getAbsolutePath();
            String[] splitAbsolutePath= absolutePath.split("src\\\\");
            String[] splitAbsolutePathPartOne = splitAbsolutePath[1].split("\\\\");


            Scanner input = new Scanner(files.get(i));
            String str = " ";
            while (input.hasNext()) {
                str += input.nextLine() + "\n";
            }
            str=str.trim();
            if(str.startsWith("package ")){
                for (int j = 0; j < splitAbsolutePathPartOne.length-2; j++) {
                    // package week_12.assignments.directories.one;
                    str= str.replace("package ","");
                    str= str.replace(splitAbsolutePathPartOne[j]+".","");

                }
                str=str.replace(splitAbsolutePathPartOne[splitAbsolutePathPartOne.length-2]+";" ,"");
            }
            PrintWriter output = new PrintWriter(files.get(i));
            output.println(str);
            output.close();

        }
    }
}

