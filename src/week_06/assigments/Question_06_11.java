package week_06.assigments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount" + "    " + "Commission");
        System.out.println("------------------------------");
        int salesAmount = 10000;

        while (salesAmount <= 100000) {
            System.out.printf("%-16d%8.1f",salesAmount , computeCommission(salesAmount));
            salesAmount += 5000;
            System.out.println();
        }

    }

    public static double computeCommission(double salesAmount) {

            if (salesAmount <= 5000) {
                return (salesAmount * 0.08);
            } else if (salesAmount <= 10000) {
                return (5000 * 0.08 + (salesAmount - 5000) * 0.10);
            } else {
                return (5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12);
            }
        }

    }

