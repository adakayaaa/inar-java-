package week_05.assignments;

public class Question_05_24 {
    public static void main(String[] args) {
        double sum = 0.0;
        double number = 1.0;

        for (int number2 = 3; number2 <= 99; number2 += 2) {
            sum += (number / number2);
            number = number2;
        }
        System.out.println("Sum of series: " + sum);
    }
}

