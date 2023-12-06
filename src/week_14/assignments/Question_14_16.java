package week_14.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Question_14_16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_14\\assignments\\Question_14_16.java");

        Scanner input = new Scanner(file);
        Map<String, Integer> hashMap = new HashMap<>();

        while (input.hasNext()) {
            String word = input.nextLine();
            String[] arrOfWord = word.split("[\\s._;={*}+:)(\\]\\[\\\\<>,\"\\-]+");

            for (int i = 0; i < arrOfWord.length; i++) {
                if(arrOfWord[i] == ""){
                    continue;
                }
                if (hashMap.containsKey(arrOfWord[i])) {
                    hashMap.replace(arrOfWord[i], hashMap.get(arrOfWord[i]) + 1);
                } else {
                    hashMap.put(arrOfWord[i], 1);
                }
            }
        }
        display(hashMap);



    }
    public static void display(Map<String,Integer> list){
        Set<String> keySet= list.keySet();
        ArrayList<String> arrayList =new ArrayList<>(keySet);
        Collections.sort(arrayList);

        for (String key: arrayList) {
            System.out.println(key + "-->" +list.get(key));
        }
    }
}
