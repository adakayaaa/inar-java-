package week_05.assignments;

public class Question_05_19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= (10 - i); j++) {
                System.out.print("     ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.printf("%-5d", (int)Math.pow(2,k-1));
            }
            for (int l = i;l>1; l--) {
                System.out.printf("%-5d", (int)Math.pow(2,l-2));
            }
            System.out.println();
            }

        }
    }

