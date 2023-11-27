package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "SortList.txt";
        File file = new File("C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\" + fileName);

        if (!file.exists()) {
            System.out.println("That is not exist!");
        }

        ArrayList<Integer> list = createArrayList();
        PrintWriter output = new PrintWriter(file);
        output.println(list);
        output.close();

        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        Scanner input = new Scanner(file);
        while (input.hasNext() && count < 100) {
            arrayList.add(list.get(count));
            count++;
        }

        display(arrayList);
    }


    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100 + 1));
        }
        return list;
    }

    public static void display(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 11 != 0) {
                System.out.printf("%-4d", arrayList.get(i));
            } else {
                System.out.println();
            }

        }
    }
}

