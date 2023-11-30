package week_05.assignments;

public class Question_05_39 {
    public static void main(String[] args) {


        double i = 10000;
        double sum = 5000 + (5000 * 0.08) + (5000 * 0.10);

        while (i >= 10000) {
            if (sum + ((i - 10000.0) * 0.12) >= 30000.0) {

                System.out.printf("%s%.2f", "Minimum sales to earn $30000: ", i);
                break;
            }
            i += 0.01;
        }
    }
}

