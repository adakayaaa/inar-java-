package week_13.assignments;

public class Question_13_08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack stack1 = new MyStack();

        System.out.println("Pushing the number 4,5 and 6 1st stack...");

        stack1.push(4);
        stack1.push(5);
        stack1.push(6);

        System.out.println("Cloning 1st stack...");
        MyStack stack2 = (MyStack) stack1.clone();


        System.out.println("Popping object from 1st stack...");
        stack1.pop();
        System.out.println("\n1st Stack: " + stack1.toString());
        System.out.println("2nd Stack: " + stack2.toString());

        System.out.println("\nIs the 1st stack equal to the 2nd stack? -->" + stack1.equals(stack2));
    }
}
