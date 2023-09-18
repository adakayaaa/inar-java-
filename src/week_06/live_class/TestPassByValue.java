package week_06.live_class;

public class TestPassByValue {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        System.out.println("Before invoking the swap method, number1 is " + number1 +
                " number2 is " + number2);
        swap(number1, number2);
        System.out.println("After invoking the swap method, number1 is " + number1 +
                " number2 is " + number2);
    }

    public static void swap(int num1, int num2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, num1 is " + num1 +
                " and num2 is " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\t\tAfter swapping, num1 is " + num1 +
                " and num2 is " + num2);
    }
}
