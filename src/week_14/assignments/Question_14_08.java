package week_14.assignments;

public class Question_14_08 {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();

        myStack.push(25);
        myStack.push(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(900);
        myStack.push(325);
        System.out.println("Top method:" + myStack.top());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("Size: " +myStack.size());
    }

}
