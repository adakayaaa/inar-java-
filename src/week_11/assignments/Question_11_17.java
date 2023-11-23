package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

//STH İS WRONG

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m = input.nextInt();

        System.out.println(""+getN(m));
        System.out.println(m*getN(m)  );
    }

    public static double getN(int number) {
        double n = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int possibleGcd = 2;
        int numberOriginal=number;

        while (possibleGcd <= number) {
            if (number % possibleGcd == 0) {
                list.add(possibleGcd);
                number = number / possibleGcd;

            } else {
                possibleGcd++;
            }
        }
        int[] listArray=new int[numberOriginal/2];
        for (int i = 0; i < list.size(); i++) {
            listArray[list.get(i)]++;
        }
        for (int i = 0; i < listArray.length; i++) {
            if(listArray[i]%2==1){
                n*=i;
            }
        }
      return n;
    }


}

