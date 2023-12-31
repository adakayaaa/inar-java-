package week_14.assignments;

import java.util.*;

public class Question_14_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements(n): ");
        int numberOfElements = input.nextInt();

        System.out.println("Enter the elements of the ArrayList (each in the range[1,n]: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(input.nextInt());
        }

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numberOfElements; i++) {
            if (!hashMap.containsKey(list.get(i))) {
                hashMap.put(list.get(i), 1);
            } else {
                hashMap.put(list.get(i), hashMap.get(list.get(i)) + 1);
            }
        }
        display(hashMap, numberOfElements);
    }

    public static void display(Map<Integer, Integer> list, int numberOfElements) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <=numberOfElements ; i++) {
            if(!list.containsKey(i)){
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }

}

