package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {

        double sum1 = 0;
        double sum2 = 0;
        for (int number = 1; number <= 50000; number++) {
            sum1 += 1.0 / number;
        }
        System.out.println("Summation of series left to right: " + sum1);
        for (int number = 50000; number >= 1; number--) {
            sum2 += 1.0 / number;
        }
        System.out.println("Summation os series right to left: " + sum2);
        System.out.println("Summation of series right to left-Summation os series left to right: " + (sum2 - sum1));
    }
}

