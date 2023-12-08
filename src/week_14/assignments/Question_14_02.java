package week_14.assignments;

import java.util.ArrayList;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int randomNumber = (int) (Math.random() * 100);
            arrayList.add(randomNumber);
        }

        System.out.println("Generated Integers:\n" + arrayList);

        int[] array = new int[100];
        for (int i = 0; i < arrayList.size(); i++) {
           ++array[arrayList.get(i)];
        }
        System.out.println("\nArrayList after removing duplicates: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] ==1){
                System.out.print(i+" ");
            }
        }


    }
}
