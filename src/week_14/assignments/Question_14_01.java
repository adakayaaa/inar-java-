package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            int randomNumber= (int)(Math.random()*10+99);
            arrayList.add(randomNumber);
        }

        System.out.println("Generated Integers : " +arrayList);

        Collections.reverse(arrayList);
        System.out.println("Reversed list : " + arrayList);

    }
}
