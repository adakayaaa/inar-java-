package week_06.assigments;

public class Question_06_28 {
    public static void main(String[] args) {
        mersennePrimeNumber();
    }

    public static void mersennePrimeNumber() {
        printMersennePrimeNumberTitle();
        printMersennePrimeNumberBody(31);
    }

    public static void printMersennePrimeNumberTitle() {
        System.out.println("p" + "         " + "2^p-1");
        System.out.println("--------------------");
    }

    public static void printMersennePrimeNumberBody(int lastPrimeNumber) {
        for (int i = 2; i <= lastPrimeNumber; i++) {
            if (isPrime(i) && isPrime((int) (Math.pow(2, i) - 1))) {
                System.out.printf("%-10d%-10d\n", i, ((int) (Math.pow(2, i) - 1)));
            }
        }
    }

        public static boolean isPrime ( int number){
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
