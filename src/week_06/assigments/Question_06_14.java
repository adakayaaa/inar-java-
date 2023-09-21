package week_06.assigments;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("i" + "         " + "m(i)");
        System.out.println("------------------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-10d%-10.4f\n", i, estimatePi(i));
        }
    }

    public static double estimatePi(int i) {
        double sum = 0;
        for (int number = 1; number<=i; number ++) {
            sum += 4*(Math.pow(-1, number + 1) / (2 *number - 1));
        }
        return sum;
    }
}
