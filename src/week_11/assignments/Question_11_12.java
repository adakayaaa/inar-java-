package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList();
        System.out.println("Sum of list: " + sum(list));
    }

    public static ArrayList<Integer> createArrayList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 5 numbers : ");
        int count=0;
        while(count<5){
            int value= input.nextInt();
            list.add(value);
            count++;
        }

        return list;
    }
    public static double sum(ArrayList<Integer> list){
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        return sum;
    }
}
