package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList();
        removeDuplicate(list);
    }

    public static ArrayList<Integer> createArrayList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 10 integers : ");
        int count = 0;
        while (count < 10) {
            int value = input.nextInt();
            list.add(value);
            count++;
        }

        return list;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> listRemoveDuplicate=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
                if(!listRemoveDuplicate.contains(list.get(i))){
                    listRemoveDuplicate.add(list.get(i));
            }

        }
        System.out.println( listRemoveDuplicate);
    }
}

