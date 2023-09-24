package week_06.assigments;

public class Question_06_29 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isTwinPrimes(i, i + 2)) {
                System.out.println("(" + i + " , " + (i + 2) + ")");
            }
        }
    }

    public static boolean isTwinPrimes(int number1, int number2) {
        if (isPrime(number1) && isPrime(number2)) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int number) {
        for(int i=2; i< number ;i++){
            if(number%i ==0){
                return false;
            }
        }
        return true;
    }
}

