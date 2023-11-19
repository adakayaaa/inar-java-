package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
       MyStack myStack=createArrayList();
        System.out.println(myStack.toString());

        System.out.println("Displaying them in reverse order: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack.pop()+" ");
        }

    }
    public static MyStack createArrayList() {
        Scanner input = new Scanner(System.in);
        MyStack myStack= new MyStack();
        System.out.print("Enter 5 numbers : ");
        int count=0;
        while(count<5){
            int value= input.nextInt();
            myStack.add(value);
            count++;
        }
        return myStack;
    }
}
