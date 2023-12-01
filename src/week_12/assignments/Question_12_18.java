package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_18 {
    public static void main(String[] args) throws FileNotFoundException {
        String srcRootDirectoryPath = System.getProperty("user.dir") + "\\src";
        File directory = new File(srcRootDirectoryPath);

        System.out.println(directory.isDirectory());

        ArrayList<File> directoryList = new ArrayList<>();

        directoryList.add(directory);

        while (!directoryList.isEmpty()) {
            File fileRemoveList = directoryList.remove(0);
            File[] array =  fileRemoveList.listFiles();


            for (int i = 0; i < array.length; i++) {
                String name = array[i].getAbsolutePath();
                File file = array[i];

                if (file.isDirectory() && name.contains("week")) {
                    directoryList.add(file);

                }
                if (file.isFile() && file.getName().endsWith(".java")) {
                    if (file.getAbsolutePath().contains("week")) {
                        String nameOfAbsolutePath = file.getAbsolutePath();

                        String[] splitForNameOfAbsolutePath = nameOfAbsolutePath.split("src\\\\");
                        String[] splitForNameOfAbsolutePathPartOne = splitForNameOfAbsolutePath[1].split("\\\\");

                        StringBuilder nameOfPackage = new StringBuilder("package ");
                        for (int j = 0; j < splitForNameOfAbsolutePathPartOne.length - 1; j++) {
                            if (j == splitForNameOfAbsolutePathPartOne.length - 2) {
                                nameOfPackage.append(splitForNameOfAbsolutePathPartOne[j] + ";");
                            } else {
                                nameOfPackage.append(splitForNameOfAbsolutePathPartOne[j] + ".");
                            }
                        }
                        Scanner input = new Scanner(file);
                        StringBuilder nameOfPackage2 = new StringBuilder();
                        while (input.hasNext()) {
                            String fileReaderString = input.nextLine();
                            if (fileReaderString.startsWith("package")) {
                                fileReaderString = nameOfPackage.toString();

                            }

                            nameOfPackage2.append(fileReaderString + "\n");
                        }
                        if (!nameOfPackage2.toString().contains("package")) {
                            StringBuilder packageName = new StringBuilder(nameOfPackage + "\n\n");
                            packageName.append(nameOfPackage2);
                            nameOfPackage2 = packageName;

                        }
                        PrintWriter output = new PrintWriter(file);
                        output.println(nameOfPackage2);
                        output.close();
                    }
                }
            }
        }
    }
}

