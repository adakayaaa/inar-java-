package week_14.assignments;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to stop) : ");

        int number = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (number != 0) {
            list.add(number);
            number = input.nextInt();

        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!hashMap.containsKey(list.get(i))) {
                hashMap.put(list.get(i), 1);
            } else {
                hashMap.put(list.get(i), hashMap.get(list.get(i)) + 1);
            }
        }
        display(hashMap);
    }

    public static void display(Map<Integer, Integer> list) {
        Set<Integer> key = list.keySet();
        int max = 1;
        for (Integer numberOfList : key) {
            if (list.get(numberOfList) > max) {
                max = list.get(numberOfList);
            }
        }
        System.out.println("Number(s) with the most occurrences: ");
        for (Integer numberOfList : key) {
            if (list.get(numberOfList) == max) {
                System.out.println(numberOfList + " --> " + max + " times.");
            }
        }
    }
}


