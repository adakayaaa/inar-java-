package week_13.assignments;

import java.util.ArrayList;

public class Question_13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);

        shuffle(list);
    }

    public static void shuffle(ArrayList<Number> list) {
        System.out.println("Before shuffle.." + list);
        list.get(0);
        System.out.println(list.get(0));
        for (int i = 0; i < list.size()-1; i++) {
            int numberForShuffle = (int) (Math.random() * list.size());

            Number temp = list.get(i);
            list.set(i, list.get(numberForShuffle));
            list.set(numberForShuffle, temp);
        }
        System.out.println("After shuffle: " + list);
    }
}
