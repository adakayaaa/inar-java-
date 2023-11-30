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
        int count = 0;

        ArrayList<File> directoryList = new ArrayList<>();
        ArrayList<File> fileList = new ArrayList<>();

        directoryList.add(directory);

        while (!directoryList.isEmpty()) {
            File directory1 = directoryList.remove(0);
            File[] array = directory1.listFiles();


            for (int i = 0; i < array.length; i++) {
                String name = array[i].getAbsolutePath();
                File file = array[i];

                if (file.isDirectory() && name.contains("week")) {
                    directoryList.add(file);

                }
                if (file.isFile() && file.getName().endsWith(".java")) {
                    if (file.getAbsolutePath().contains("week")) {
                        String str = file.getAbsolutePath();

                        String[] strArray = str.split("src\\\\");
                        String[] array1 = strArray[1].split("\\\\");

                        StringBuilder stringBuilder = new StringBuilder("package ");
                        for (int j = 0; j < array1.length - 1; j++) {
                            if (j == array1.length - 2) {
                                stringBuilder.append(array1[j] + ";");
                            } else {
                                stringBuilder.append(array1[j] + ".");
                            }
                        }
                        Scanner input = new Scanner(file);
                        StringBuilder stringBuilder2 = new StringBuilder();
                        while (input.hasNext()) {
                            String string1 = input.nextLine();
                            if (string1.startsWith("package")) {
                                string1 = stringBuilder.toString();

                            }

                            stringBuilder2.append(string1 + "\n");
                        }
                        if (!stringBuilder2.toString().contains("package")) {
                            StringBuilder packageName = new StringBuilder(stringBuilder + "\n\n");
                            packageName.append(stringBuilder2);
                            stringBuilder2 = packageName;

                        }
                        PrintWriter output = new PrintWriter(file);
                        output.println(stringBuilder2);
                        output.close();
                    }
                }
            }
        }
    }
}

