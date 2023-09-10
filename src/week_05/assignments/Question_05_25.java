package week_05.assignments;

public class Question_05_25 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100000; i++) {
            sum += 4 * (Math.pow((-1), (i + 1)) / (2 * i - 1));

            if (i == 100000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 90000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 80000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 70000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 60000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 50000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 40000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 30000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 20000) {
                System.out.println("PI value for i= " +i +": " + sum);
            } else if (i == 10000) {
                System.out.println("PI value for i= " +i +": " + sum);
            }
        }
    }
}