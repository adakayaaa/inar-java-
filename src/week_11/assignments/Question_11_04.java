package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list=createArrayList();
        System.out.println("The largest number in the list is " + max(list));

    }
    public static ArrayList<Integer> createArrayList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a sequence of numbers ending with 0 : ");
        int value;
        do {
            value = input.nextInt();
            list.add(value);
        }
        while (value != 0);
        return list;
    }
    public static Integer max( ArrayList<Integer> list){
        return java.util.Collections.max(list);
    }
}

