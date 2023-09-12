package week_05.assignments;

public class Question_05_40 {
    public static void main (String[] args) {
        int heads =0;
        int tails = 0;

        for(int i=1 ; i<=1000000 ;i++){
        int number = (int)(Math.random()*2) ;
        if (number == 0) {
            heads++;
        }else{
            tails++;
        }

        }
        System.out.println("Fipping a coin one million times.. \nHeads: " +heads + "\nTails: " + tails );
    }
}
