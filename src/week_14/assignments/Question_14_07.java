package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list=createArrayList();
        System.out.println("Generated list : " +list);
        Collections.sort(list);

        int number=(int) (Math.random()*10+1);
        System.out.println("What is the "+ number + " greatest number: ");
        System.out.println("The " + number + "th largest element is: " + list.get(list.size()-number) );


    }
    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number=(int) (Math.random()*100+1);
            list.add(number);
        }
        return list;
    }
}
