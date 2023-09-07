package week_05.assignments;

public class Question_05_15 {
    public static void main (String [] args){

       int number = 33;
        int numberCount = 0;

        while (33<= number && number <=126 ){
            System.out.print(" " + (char)number);
            number++;
            numberCount++;
            if (numberCount % 10 == 0) {
                System.out.println();
            }
        }

    }
}
