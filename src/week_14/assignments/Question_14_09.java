package week_14.assignments;

public class Question_14_09 {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.push(30);
        myQueue.push(45);
        myQueue.push(500);
        myQueue.push(34);
        myQueue.push(43);
        System.out.println("Peek method:" + myQueue.peek());

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

        System.out.println("Size: " +myQueue.size());


    }
}
