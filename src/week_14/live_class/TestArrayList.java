package week_14.live_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        String word = "Inar Academy";
        String shuffled;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }

        Collections.shuffle(list);
        System.out.println(list);



    }
}

