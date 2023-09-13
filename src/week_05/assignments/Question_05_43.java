package week_05.assignments;

public class Question_05_43 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= (7 - i); j++) {
                System.out.println(i + "  " + (j + i));
                count++;


            }

        }
        System.out.println("The total number of all combinaitons is " +count);
    }
}
