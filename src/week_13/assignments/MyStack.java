package week_13.assignments;

import java.util.ArrayList;


public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return this.list.size();
    }

    public Object peek() {
        if (this.list.isEmpty()) {
            return null;
        } else {
            return this.list.get(getSize() - 1);
        }
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MyStack myStack = (MyStack) super.clone();
        myStack.list = new ArrayList<>(this.list);
        return myStack;

        /*or
        public Object clone() {
        try {
        // Perform a shallow copy
        MyStack myStack = (MyStack) super.clone();
        // Deep copy on list
        myStack.list = new ArrayList<>(this.list);
        return myStack;
        } catch (CloneNotSupportedException ex) {
        return null;
        }
        }
         */
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

}
