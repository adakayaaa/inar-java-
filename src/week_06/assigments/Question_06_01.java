package week_06.assigments;

public class Question_06_01 {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers, ten per line: " + getPentagonalNumber(100));

    }

    public static int getPentagonalNumber(int numberCountsOfPentagonal) {
        int number = 1;
        int count = 0;

        while (count < numberCountsOfPentagonal) {
            System.out.printf("%7d", (number * (3 * number - 1) / 2));
            count++;

            if (count % 10 == 0) {
                System.out.println();
            }
            number++;
        }
        return number;
    }
}
