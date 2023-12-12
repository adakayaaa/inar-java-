package week_14.assignments;

import java.util.ArrayList;

public class Question_14_06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList();
        System.out.println("Original List: " + list);
        System.out.println("Rearranged list: " + rearrangedList(list));

    }

    public static ArrayList<Integer> createArrayList() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 100 + 10);
            list.add(number);
        }

        return list;
    }
    public static ArrayList<Integer> rearrangedList(ArrayList<Integer> list){
        ArrayList<Integer> rearrangedList = new ArrayList<>();
        ArrayList<Integer> forEvenNumbers = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                rearrangedList.add(list.get(i));
            } else {
                forEvenNumbers.add(list.get(i));
            }
        }

        for (int i = 0; i < forEvenNumbers.size(); i++) {
            rearrangedList.add(forEvenNumbers.get(i));
        }
        return rearrangedList;
    }
}

