package week_05.assignments;

public class Question_05_42 {
    public static void main(String[] args) {


        double sum = 5000 + (5000 * 0.08) + (5000 * 0.10);
        double total = 0;
        double i;
        for (i = 10000; i <= 30000; i +=1) {
            if (sum + ((i - 10000.0) * 0.12) >= 30000.0) {
                System.out.printf("%s%.2f", "Minimum sales to earn $30000: ", i);
                break;
            }
        }
    }
}


