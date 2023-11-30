package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\";
        File file = new File(path + "SortedStrings.txt");

        Scanner input = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.next());
        }
        PrintWriter output = new PrintWriter(file);
        output.println(list);
        output.close();

        int count=0;
        ArrayList<String> sortedList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) >0) {
               sortedList.add(list.get(i));
               count++;
               if(count ==2){
                   break;
               }
            }
        }

        System.out.println("The strings " +sortedList + " are out of order ");
    }
}

