package week_12.assignments;


import java.sql.Array;
import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array= createArray(100);

        try{
            System.out.println("Enter the index of the array: ");
            int chooseNumber= array[input.nextInt()];
            System.out.println("You chose: " + chooseNumber);

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of bounds!!");
        }

    }
    public static int[] createArray(int number){
        int[] array=new int[number];
        for (int i = 0; i < array.length ; i++) {
            array[i]=(int)(Math.random()*100+1);
        }
        return array;
    }
}
