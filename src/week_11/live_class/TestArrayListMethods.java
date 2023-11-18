package week_11.live_class;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayListMethods {
    public static void main(String[] args) {
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.sort(list);
        System.out.println(list);
        System.out.println(java.util.Collections.max(list));
        System.out.println(java.util.Collections.min(list));
    }
}
