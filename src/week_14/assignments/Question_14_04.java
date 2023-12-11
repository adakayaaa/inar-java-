package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {

        ArrayList<Integer> listA = createArrayList();
        ArrayList<Integer> listB = createArrayList();
        ArrayList<Integer> listC = new ArrayList<>();

        Collections.sort(listA);
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
        }

        descendingSort(listB);
        for (int i = 0; i < listB.size(); i++) {
            listC.add(listB.get(i));
        }

        System.out.println("Merged and sorted ArrayList C:\n" + listC);
    }

    public static ArrayList<Integer> createArrayList() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size 'n'  for ArrayList: ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " Integers for ArrayList: ");
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static void descendingSort(ArrayList<Integer> listB) {
        for (int i = 0; i < listB.size() - 1; i++) {
            int maxIndex = i;
            int max = listB.get(i);
            for (int j = i + 1; j < listB.size(); j++) {
                if (listB.get(j) > max) {
                    maxIndex = j;
                    max = listB.get(j);
                }
            }
            if (maxIndex != i) {
                listB.set(maxIndex, listB.get(i));
                listB.set(i, max);
            }

        }
    }

}
