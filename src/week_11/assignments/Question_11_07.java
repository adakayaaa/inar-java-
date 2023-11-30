package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList();

        System.out.println("Before shuffling..");
        System.out.println(list);

        System.out.println("After shuffling");
        java.util.Collections.shuffle(list);
        System.out.println(list);

    }

    public static ArrayList<Integer> createArrayList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a list of integers ending with 0 : ");
        int value = -1;
        while (value != 0) {
            value = input.nextInt();
            if (value != 0) {
                list.add(value);
            }
        }
        return list;
    }
}

