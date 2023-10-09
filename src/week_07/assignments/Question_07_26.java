package week_07.assignments;

import java.util.Scanner;

public class Question_07_26 {
    public static void main (String [] args){
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
        if( !equals(list1,list2)){
            System.out.println("Two list are not strictly identical");
        }else{
            System.out.println("Two list are strictly identical");
        }
    }
    public static boolean equals(int []list1, int [] list2){
        for(int i=0;i< list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}
