package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double sum = 1.0;
        double number1 = 1.0;
        for (int number2 = 1; number2 <= 100000; number2++) {
            sum += (1 / (number1 * number2));
            number1 = (number1 * number2);

            if (number2 == 100000) {
                System.out.println("e at i = " + number2 + " is " + sum);
            } else if (number2 == 20000) {
                System.out.println("e at i = " + number2 + " is " + sum);
            } else if (number2 == 10000) {
                System.out.println("e at i = " + number2 + " is " + sum);
            }
        }
        System.out.println("Java's e is " + sum);
    }
}
