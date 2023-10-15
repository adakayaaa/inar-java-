package week_07.assignments;

import java.util.Scanner;

public class Question_07_32 {
    //Not finished.
    public static void main(String[] args) {

        int[] list = getList();
        System.out.println("After the partition, the list is " + afterThePartitionList(list));

    }

    public static int[] getList() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();

        }
        return list;
    }
    public static  int[] afterThePartitionList(int[]list){
        int count =partition(list);
        int [] listMin = new int[count];
        int [] listMax= new int[list.length-count];
        for (int i = 0; i < list.length; i++) {
            if(list[i]<= list[0]){
               listMin[count-1] = list[i];
            }else{
                listMax[count+1] = list[i];
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < listMin.length; j++) {
                list [j] = listMin [j];
            }
            for (int k = 0; k < listMax.length; k++) {
                list [listMin.length+k] = listMax[k];

            }

        }


        return list;
    }
    public static int partition(int[] list){
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i]<= list[0]){
                count++;
            }

        }
        return count;
    }


}


