package week_14.assignments;

import java.util.*;

public class Question_14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter DNA : ");
        String dna = input.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < dna.length() - 4; i++) {
            String str = dna.substring(i, i + 5);

            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }

        }
        Set<String> key = map.keySet();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : key) {
            if (map.get(s) > 1) {
                arrayList.add(s);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);


    }
}
