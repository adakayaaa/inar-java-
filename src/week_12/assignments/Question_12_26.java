package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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

            StringBuilder stringBuilder1 = new StringBuilder();

            while (input.hasNext()) {
                String str = input.next() ;
                if (str.contains("Question_")) {
                    String s2=  getName(str);
                    stringBuilder1.append(s2+" ");

                } else {
                    stringBuilder1.append(str+ " ");
                }
            }
            PrintWriter output = new PrintWriter(files.get(i));
            output.println(stringBuilder1);
            output.close();




        }


    }
    public static String getName(String s1){

       s1= s1.replace("Question_","");
        String[] numbers = s1.split("_");

        String result= "Question_";
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= numbers[i].trim();
            if ((numbers[i].length() == 1)) {
                result += "0" + numbers[i];
                if (i == 0) {
                    result += "_";
                }
            } else {
                result += numbers[i];
                if (i == 0) {
                    result += "_";
                }
            }
        }

        return result;
    }
}


