package week_05.assignments;

public class Question_05_20 {
    public static void main (String [] args ) {
        int number1= 2;
        int number= 1;
        int numberCount =0;

        while(2<=number1 && number1<= 1000){
            if(number1%number == number1){
                System.out.println(" " + number1);
                number++;
                numberCount++;

                if (numberCount % 8 == 0) {
                    System.out.println();
                }
            }
            number1++;
        }
    }
}
