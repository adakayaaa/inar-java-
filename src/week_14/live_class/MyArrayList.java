package week_14.live_class;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();

        //add a value to the arrayList
        list.add("Emir");
        list.add("Nafiz");
        list.add("Furkan");
        list.add("Celalettin");

        System.out.println(list.get(1)); //Nafiz

        //to modify/update a value in the arrayList
        list.set(1,"Mehmet Nafiz"); //Mehmet Nafiz

        //to get the length pf the arrayList
        System.out.println(list.size()); //4
        System.out.println(list.isEmpty()); //false

        //to remove an element from arrayList you can use index or the object itself
        list.remove(3);
        list.remove("Emir");

        //arrayList return array
        String[] str= new String[list.size()];
        str= (String[]) list.toArray();








    }
}
