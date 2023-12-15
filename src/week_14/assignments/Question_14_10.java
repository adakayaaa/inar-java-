package week_14.assignments;

import java.util.Scanner;
import java.util.Stack;

public class Question_14_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Post fix Expression: ");
        String str = input.nextLine();
        String[] strArray = str.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("+") || strArray[i].equals("-") || strArray[i].equals("*") || strArray[i].equals("/")) {
                int number = getExpression(strArray[i], stack);
                stack.push(number);
            } else {
                stack.push(Integer.parseInt(strArray[i]));
            }
        }
        int output = stack.pop();
        System.out.println("output : " + output);
        System.out.println("Explanation: ((" + strArray[0] + " " + strArray[2] + " " + strArray[1] + ") " + strArray[4] + " " + strArray[3] + ")" + " = " + output);


    }

    public static int getExpression(String str, Stack<Integer> stack) {

        int number = 0;
        if (str.equals("+")) {
            number = stack.pop() + stack.pop();
        } else if (str.equals("-")) {
            number = stack.pop() - stack.pop();
        } else if (str.equals("*")) {
            number = stack.pop() * stack.pop();
        } else if (str.equals("/")) {
            number = stack.pop() / stack.pop();
        }
        return number;
    }
}
