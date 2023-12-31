package week_14.live_class;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        System.out.println(isEquals(str1, str2));
    }

    private static boolean isEquals(String s1, String s2) {
        Map<Character, Integer> hashMap1 = createMap(s1);
        Map<Character, Integer> hashMap2 = createMap(s2);

       return  hashMap1.equals(hashMap2);
    }

    public static Map<Character, Integer> createMap(String s1) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }
        return result;
    }
}
