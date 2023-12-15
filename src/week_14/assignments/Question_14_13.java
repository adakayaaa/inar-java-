package week_14.assignments;

import java.util.ArrayList;

public class Question_14_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list=createList(10);
        int[] countOfListNumber= new int[3];
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            countOfListNumber[list.get(i)]++;
        }
        for (int i = 0; i < countOfListNumber.length; i++) {
            if(countOfListNumber[i] >(10/3)){
                System.out.print(i+" ");
            }
        }


    }
    public static ArrayList<Integer> createList(int count){
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add((int) (Math.random()*3));
        }
        return list;
    }

}
