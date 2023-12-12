package week_14.assignments;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> numberList;
    private Stack<Integer> tempList;

    public MyQueue() {
        this.numberList = new Stack<>();
        this.tempList = new Stack<>();
    }

    public void push(int number) {
        this.numberList.push(number);
    }

    public int pop() {
        while (!numberList.isEmpty()) {
            if (numberList.size() != 1) {
                tempList.add(numberList.pop());
            } else {
                break;
            }
        }
        int result = numberList.pop();

        while (!tempList.isEmpty()) {
            numberList.add(tempList.pop());
        }
        return result;
    }

    public int peek() {
        while (!numberList.isEmpty()) {
            if (numberList.size() != 1) {
                tempList.add(numberList.pop());
            } else {
                break;
            }
        }
        int result = numberList.peek();
        tempList.add(numberList.pop());

        while (!tempList.isEmpty()) {
            numberList.add(tempList.pop());
        }
        return result;
    }


    public int size() {
        return this.numberList.size();
    }

    public boolean isEmpty() {
        return this.numberList.isEmpty();
    }


}
