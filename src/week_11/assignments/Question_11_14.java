package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = createArrayList();
        ArrayList<Integer> list2 = createArrayList();
        System.out.println("The combined list is " + union(list1,list2));
    }
    public static ArrayList<Integer> createArrayList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 5 integers for list: ");
        int count = 0;
        while (count < 5) {
            int value = input.nextInt();
            list.add(value);
            count++;
        }

        return list;
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1 ,ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i <list2.size(); i++) {
            list.add(list2.get(i));

        }
        return list;
    }
}

