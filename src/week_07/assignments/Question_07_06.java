package week_07.assignments;

public class Question_07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int count = 1;
        primeNumbers[0] = 2;
        int number = 3;
        long startTime= System.currentTimeMillis();
        while (count < 50) {
            if (isPrime(number)) {
                primeNumbers[count++] = number;
            }
            number++;
        }
        long endTime = System.currentTimeMillis();

        displayArray(primeNumbers);
        System.out.println(endTime-startTime);
    }

    public static boolean isPrime(int[] array, int number) {
        int index = 0;
        while (Math.sqrt(number) >= array[index]) {
            if (number % array[index] == 0) {
                return false;
            }
            index++;
        }
        return true;

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayArray(int[] number) {
        for (int i = 0; i < number.length; i++) {

            System.out.print(number[i] + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();

            }
        }
    }
}

