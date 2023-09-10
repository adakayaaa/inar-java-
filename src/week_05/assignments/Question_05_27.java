package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {
        System.out.println("All the leap years from 101 to 2100: ");
        int numberCount = 0;

        for (int number = 101; number < 2100; number++) {
            if ((number % 4 == 0 && number % 100 != 0) || (number % 400 == 0)) {
                System.out.print(number + " ");
                numberCount++;
                if (numberCount % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
