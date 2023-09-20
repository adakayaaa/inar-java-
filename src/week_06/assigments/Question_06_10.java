package week_06.assigments;

public class Question_06_10 {
    public static void main (String[] args){
        System.out.print("The number of prime numbers less than 10.000 is: " );
        printPrimesNumberCount(10000);
    }
   public static void printPrimesNumberCount (int countOfNumber){
        int count =0;
        for(int number =2; number<countOfNumber;number++){
            if (isPrime(number)){
                count++;
            }
        }
       System.out.print(count);
    }
    public  static boolean isPrime (int number){
        for(int i =2; i<number ; i++){
            if(number%i ==0){
                return  false;
            }
        }
        return true;
    }
}
