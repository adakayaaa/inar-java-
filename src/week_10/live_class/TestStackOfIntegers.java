package week_10.live_class;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stackOfIntegers.push(i);
        }
        while (!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}
