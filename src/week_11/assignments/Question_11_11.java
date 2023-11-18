package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList();
        System.out.println("Before sorting...");
        System.out.println(list);
        System.out.println("After sorting...");
        sort(list);

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

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            list.remove(minIndex);
            list.add(i,list.get(i));
            list.remove(i);
            list.add(i, min);

        }
        System.out.println(list);
    }
}
