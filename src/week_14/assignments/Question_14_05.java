package week_14.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers for ArrayList nums (enter -1 to stop): ");
        int number = input.nextInt();
        while (number != -1) {
            list.add(number);
            number = input.nextInt();
        }

        createArrayListWithoutZero(list);

    }
    public static void createArrayListWithoutZero(ArrayList<Integer>list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                count++;
                list.remove(list.get(i));
            }
        }

        for (int i = 0; i < count; i++) {
            list.add(0);
        }

        System.out.println("ArrayList after moving zeros to the end:\n" + list);
    }
}

