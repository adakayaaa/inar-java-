package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_32 {
    //Not finished.
    public static void main(String[] args) {

        int[] list = getList();
        System.out.println("After the partition, the list is " + Arrays.toString(afterThePartitionList(list)));

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
        int index=0;
        int indexMax=0;
        int indexOfList=0;
        int [] listMin = new int[count];
        int [] listMax= new int[list.length-count];
        for (int i = 1; i < list.length; i++) {
            if(list[i]<= list[0]){
               listMin[index++] = list[i];
            }else{
                listMax[indexMax++] = list[i];
            }
        }
        listMin[index] = list[0];
        System.out.println(Arrays.toString(listMin));
        System.out.println(Arrays.toString(listMax));

        for (int i = 0; i < listMin.length; i++) {
            list[indexOfList] = listMin[i];
            indexOfList++;

        }

        for (int i = 0; i < listMax.length; i++) {
            list[indexOfList] = listMax[i];
            indexOfList++;

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

