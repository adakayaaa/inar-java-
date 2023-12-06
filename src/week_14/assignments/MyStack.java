package week_14.assignments;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Number> numberList;
    private Queue<Number> tempList;

    public MyStack() {
        this.numberList = new LinkedList<>();
        this.tempList = new LinkedList<>();
    }

    public void push(Number number) {
        this.numberList.offer(number);
    }

    public Number pop() {
        if(numberList.isEmpty()){
            throw new RuntimeException("The list is empty!");
        }
        while (!numberList.isEmpty()) {
            if (numberList.size() != 1) {
                tempList.add(numberList.remove());
            } else {
                break;
            }
        }
        Number result = numberList.remove();

        while (!tempList.isEmpty()) {
            numberList.add(tempList.remove());
        }
        return result;
    }

    public Number top() {
        if(numberList.isEmpty()){
            throw new RuntimeException("The list is empty!");
        }
        while (!numberList.isEmpty()) {
            if (numberList.size() != 1) {
                tempList.add(numberList.remove());
            } else {
                break;
            }
        }
        Number result = numberList.peek();
        tempList.add(numberList.remove());

        while (!tempList.isEmpty()) {
            numberList.add(tempList.remove());
        }
        return result;
    }

    public int size() {
        return this.size();
    }

    public boolean isEmpty(){
        return this.numberList.isEmpty();
    }


}