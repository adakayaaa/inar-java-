package week_07.assignments;

import java.util.Scanner;

public class Question_07_27 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1: ");
        int [] list1 = new int[input.nextInt()];
        for(int i=0; i<list1.length;i++){
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2: ");
        int [] list2 = new int[input.nextInt()];
        for(int i=0; i<list2.length;i++){
            list2[i] = input.nextInt();
        }
        int [] sortList1 = sorted(list1);
        int [] sortList2 = sorted(list2);

        if( ! equals(sortList1,sortList2)){
            System.out.println("Two list are not identical");
        }else{
            System.out.println("Two list are identical");
        }
    }
    public static int[] sorted(int [] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
    public static boolean equals (int[] list1,int[]list2){
        for(int i=0; i< list1.length;i++){
            if (list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}

