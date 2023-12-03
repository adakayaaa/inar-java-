package week_12.assignments;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_28 {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\directories\\question_12_26\\";
        File directory = new File(path);

        System.out.println(directory.isDirectory());

        ArrayList<File> directories = new ArrayList<>();
        ArrayList<File> files = new ArrayList<>();

        directories.add(directory);
        while (!directories.isEmpty()) {
            File removeFileList = directories.remove(0);
            File[] fileArray = removeFileList.listFiles();

            for (int i = 0; i < fileArray.length; i++) {
                if (fileArray[i].isDirectory()) {
                    directories.add(fileArray[i]);
                }
                if (fileArray[i].isFile()) {
                    files.add(fileArray[i]);
                }
            }
        }

        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);

            if (file.getName().endsWith(".java") && file.getName().contains("Question_")) {
                String fileAbsolutePath = file.getAbsolutePath();


                String[] fileAbsolutePathArray = fileAbsolutePath.split("question_12_26\\\\");
                StringBuilder nameOfPackage = new StringBuilder("public class ");
                String[] fileAbsolutePathArrayPartOne = fileAbsolutePathArray[1].split("[_.]");
                fileAbsolutePathArrayPartOne[2] = fileAbsolutePathArrayPartOne[2].trim();

                if (fileAbsolutePathArrayPartOne[2].length() == 1 && !fileAbsolutePathArrayPartOne[2].startsWith("0")) {
                    nameOfPackage.append(fileAbsolutePathArrayPartOne[0] + "_" +
                            fileAbsolutePathArrayPartOne[1] + "_0" +
                            fileAbsolutePathArrayPartOne[2] + " {");

                    fileAbsolutePath = fileAbsolutePathArray[0] + "question_12_26\\\\" +
                            (fileAbsolutePathArrayPartOne[0] + "_" +
                            fileAbsolutePathArrayPartOne[1] + "_0" +
                            fileAbsolutePathArrayPartOne[2] + "." +
                            fileAbsolutePathArrayPartOne[3]);

                } else {
                    nameOfPackage.append(fileAbsolutePathArrayPartOne[0] + "_" +
                            fileAbsolutePathArrayPartOne[1] + "_" +
                            fileAbsolutePathArrayPartOne[2] + " {");

                    fileAbsolutePath = fileAbsolutePathArray[0] + "question_12_26\\\\" +
                            (fileAbsolutePathArrayPartOne[0] + "_" +
                            fileAbsolutePathArrayPartOne[1] + "_" +
                            fileAbsolutePathArrayPartOne[2] + "." +
                            fileAbsolutePathArrayPartOne[3]);
                }


                Scanner input = new Scanner(file);
                StringBuilder nameOfPackage2 = new StringBuilder();

                while (input.hasNext()) {
                    String fileReaderString = input.nextLine();
                    if (fileReaderString.startsWith("public class ")) {
                        fileReaderString = nameOfPackage.toString();


                    }
                    nameOfPackage2.append(fileReaderString + "\n");
                }
                input.close();
                File newFile = new File(fileAbsolutePath);
                PrintWriter output = new PrintWriter(newFile);
                file.delete();
                output.println(nameOfPackage2);
                output.close();


            }
        }
    }
}

